package com.mcgrg.diploma.Main;

import com.google.gson.reflect.TypeToken;
import com.mcgrg.diploma.connection.InsertEntityRequest;
import com.mcgrg.diploma.entity.ConstructionSite;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;

public class NewAddressController {

    @FXML // fx:id="lblConsSiteAddress"
    private Label lblConsSiteAddress; // Value injected by FXMLLoader

    @FXML // fx:id="lblCity"
    private Label lblCity; // Value injected by FXMLLoader

    @FXML // fx:id="lblStreet"
    private Label lblStreet; // Value injected by FXMLLoader

    @FXML // fx:id="lblBilding"
    private Label lblBilding; // Value injected by FXMLLoader

    @FXML // fx:id="txtCity"
    private TextField txtCity; // Value injected by FXMLLoader

    @FXML // fx:id="txtStreet"
    private TextField txtStreet; // Value injected by FXMLLoader

    @FXML // fx:id="txtBilding"
    private TextField txtBilding; // Value injected by FXMLLoader

    @FXML // fx:id="btnCancel"
    private Button btnCancel; // Value injected by FXMLLoader

    @FXML // fx:id="btnEnter"
    private Button btnEnter; // Value injected by FXMLLoader

    @FXML
    private void onClickMethodCancel() {
        try {
            Stage stage = (Stage) btnCancel.getScene().getWindow();
            stage.hide();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    private void onClickMethodEnter() {
        try {
            try {
                InsertEntityRequest<ConstructionSite> insSite = new InsertEntityRequest<>();
                insSite.setRequest(new TypeToken<ConstructionSite>() {
                        }.getType(), "Cons_site_city, Cons_site_street, Cons_site_bilding",
                        " 'СП-б', 'Капитанская ул' , '4'");
            }catch (Exception e){
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "Указанные данные добавлены",
                    "Ошибка!",
                    JOptionPane.INFORMATION_MESSAGE);
            Stage stage = (Stage) btnEnter.getScene().getWindow();
            stage.hide();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    public void initialize() {

    }

}
