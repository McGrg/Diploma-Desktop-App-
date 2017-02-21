package com.mcgrg.diploma.Main.KindOfControllers;

import com.google.gson.reflect.TypeToken;
import com.mcgrg.diploma.connection.SelectEntityRequest;
import com.mcgrg.diploma.entity.Users;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import javax.swing.*;
import java.util.List;

public class AuthController {

    @FXML
    private AnchorPane AuthintifikationView;

    @FXML
    private Label lblName;

    @FXML
    private TextField txtUserName;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private Button btnSubmit;

    @FXML
    public void initialize() {
        btnSubmit.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                txtUserName.setText(comboBox.getValue());
            }
        });
        try {
            SelectEntityRequest ser = new SelectEntityRequest();
            List<Users> usersList = ser.setRequest(new TypeToken<List<Users>>() {
            }.getType());
            for (Users users : usersList) {
                if (users.getUserThirdname() == null) users.setUserThirdname("");
                String str = users.getUserSurname() + " " + users.getUserName() + " " + users.getUserThirdname();
                comboBox.getItems().add(str);
            }
            comboBox.setPromptText(" Выберите имя");
            comboBox.setStyle("-fx-font: 18px \"System\";");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString(),
                    "Ошибка!",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
