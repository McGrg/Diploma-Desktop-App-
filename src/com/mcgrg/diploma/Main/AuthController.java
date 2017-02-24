package com.mcgrg.diploma.Main;

import com.google.gson.reflect.TypeToken;
import com.mcgrg.diploma.connection.SelectEntityRequest;
import com.mcgrg.diploma.entity.FIOConverter;
import com.mcgrg.diploma.entity.FioUsers;
import com.mcgrg.diploma.entity.Users;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class AuthController {

    @FXML
    private AnchorPane AuthintifikationView;

    @FXML
    private Label lblMessage;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private ComboBox<FioUsers> comboBox;

    @FXML
    private Button btnSubmit;

    @FXML
    public void onClickMethod() {
        if (!txtPassword.getText().equals("")) {
            Stage stage = (Stage) btnSubmit.getScene().getWindow();
            stage.hide();

            SelectEntityRequest ser = new SelectEntityRequest();
//            List<Authentifikation> passwordsList = ser.setRequestWhere(new TypeToken<List<Authentifikation>>() {
//            }.getType(), "authentifikation_name", comboBox.getValue().toString());
//            for (Authentifikation auth : passwordsList) {
//                if (auth.getAuthentifikation_password().equals(txtPassword.getText()) && auth.getAuthentifikation_name().equals(comboBox.getValue())) {
                    try {
                        Stage primaryStage = new Stage();
                        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("ConsSiteForm.fxml"));
                        Scene scene = new Scene(fxmlLoader);
                        primaryStage.setScene(scene);
                        primaryStage.setTitle("Construction sites");
                        primaryStage.show();
                    } catch (Exception e) {
                        System.out.println(e.toString() + " :" + "Can't load new view!");
                    }
                }
            }
//        }
//    }

    @FXML
    public void initialize() {

        try {
            comboBox.getItems().addAll(setUserName());
            comboBox.setPromptText(" Выберите имя");
            comboBox.setStyle("-fx-font: 18px \"System\";");

            // Define rendering of the list of values in ComboBox drop down. 
            comboBox.setCellFactory((comboBox) -> {
                return new ListCell<FioUsers>() {
                    @Override
                    protected void updateItem(FioUsers item, boolean empty) {
                        super.updateItem(item, empty);

                        if (item == null || empty) {
                            setText(null);
                        } else {
                            setText(item.getFio());
                        }
                    }
                };
            });

// Define rendering of selected value shown in ComboBox.
            comboBox.setConverter(new FIOConverter());

            comboBox.setOnAction((event) -> {
                FioUsers selectedFioUsers = comboBox.getSelectionModel().getSelectedItem();
            });
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString(),
                    "Ошибка!",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public ArrayList<FioUsers> setUserName() {
        List<Users> usersList;
        ArrayList<FioUsers> fioList = new ArrayList<>();
        try {
            SelectEntityRequest ser = new SelectEntityRequest();
            usersList = ser.setRequest(new TypeToken<List<Users>>() {
            }.getType());
            for (Users users : usersList) {
                if (users.getUserThirdname() == null) users.setUserThirdname("");
                FioUsers fio = new FioUsers(users.getUserSurname(), users.getUserName(), users.getUserThirdname());
                fioList.add(fio);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString(),
                    "Ошибка!",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        return fioList;
    }
    //----------------------------------------------------------------------------------------------
}

