package com.mcgrg.diploma.Main;

import com.google.gson.reflect.TypeToken;
import com.mcgrg.diploma.AdditionalEntities.Address;
import com.mcgrg.diploma.AdditionalEntities.FioUsers;
import com.mcgrg.diploma.connection.SelectEntityRequest;
import com.mcgrg.diploma.entity.ConstructionSite;
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
    private ComboBox<Address> cmbAddress;

    @FXML
    private ComboBox<FioUsers> cmbName;

    @FXML
    private Button btnSubmit;

    @FXML
    private void onClickMethod() {
//        if ((cmbName.getValue() != null) && (!txtPassword.getText().equals(""))) {
            SelectEntityRequest ser = new SelectEntityRequest();
            System.out.println("Hello!!!");
//            System.out.println(cmbName.getValue().toString());
            try {
//                List<Authentifikation> passwordsList = ser.setRequestWhere(new TypeToken<List<Authentifikation>>() {
//                }.getType(), "authentifikation_name", cmbName.getValue().toString());
//                for (Authentifikation auth : passwordsList) {
//                    System.out.println(auth.getAuthentifikation_password().trim());
//                    System.out.println(auth.getAuthentifikation_name().trim());
//                    if ((auth.getAuthentifikation_password().trim().equals(txtPassword.getText())) && (auth.getAuthentifikation_name().trim().equals(cmbName.getValue().toString()))) {
                        try {
                            Stage primaryStage = new Stage();
                            Parent fxmlLoader = FXMLLoader.load(getClass().getResource("MainForm.fxml"));
                            Scene scene = new Scene(fxmlLoader);
                            primaryStage.setScene(scene);
                            primaryStage.setTitle("Выберите операцию");
                            primaryStage.show();
                            Stage stage = (Stage) btnSubmit.getScene().getWindow();
                            stage.hide();
                        } catch (Exception e) {
                            System.out.println(e.toString() + " :" + "Can't load new view!");
                        }
//                    }
//                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString(),
                        "Ошибка!",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
//    }

    @FXML
    private void initialize() {

        try {
            cmbName.getItems().addAll(setUserName());
            cmbName.setPromptText(" Выберите имя");
            cmbName.setStyle("-fx-font: 18px \"System\";");
            cmbAddress.getItems().addAll(setAddress());
            cmbAddress.setStyle("-fx-font: 18px \"System\";");

            // Define rendering of the list of values in ComboBox drop down.
//            cmbName.setCellFactory((comboBox) -> {
//                return new ListCell<FioUsers>() {
//                    @Override
//                    protected void updateItem(FioUsers item, boolean empty) {
//                        super.updateItem(item, empty);
//
//                        if (item == null || empty) {
//                            setText(null);
//                        } else {
//                            setText(item.getFio());
//                        }
//                    }
//                };
//            });

            // Define rendering of selected value shown in ComboBox.
//            cmbName.setConverter(new FIOConverter());
//
//            cmbName.setOnAction((event) -> {
//                FioUsers selectedFioUsers = cmbName.getSelectionModel().getSelectedItem();
//            });
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString(),
                    "Ошибка!",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private ArrayList<FioUsers> setUserName() {
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
            JOptionPane.showMessageDialog(null, "Отсутствует связь с сервером, проверьте сетевое подключение",
                    "Ошибка!",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        return fioList;
    }

    private ArrayList<Address> setAddress() {
        List<ConstructionSite> consList;
        ArrayList<Address> addressList = new ArrayList<>();
        try {
            SelectEntityRequest ser = new SelectEntityRequest();
            consList = ser.setRequest(new TypeToken<List<ConstructionSite>>() {
            }.getType());
            for (ConstructionSite cons : consList) {
                Address addr = new Address(cons.getConssiteCity(), cons.getConssiteStreet(), cons.getConssiteBilding());
                addressList.add(addr);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Отсутствует связь с сервером, проверьте сетевое подключение",
                    "Ошибка!",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        return addressList;
    }
    //----------------------------------------------------------------------------------------------
}

