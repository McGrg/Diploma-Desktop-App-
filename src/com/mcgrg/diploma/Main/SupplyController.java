package com.mcgrg.diploma.Main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class SupplyController {

    @FXML // fx:id="SupplyForm"
    private AnchorPane SupplyForm; // Value injected by FXMLLoader

    @FXML // fx:id="lblMaterialName"
    private Label lblMaterialName; // Value injected by FXMLLoader

    @FXML // fx:id="lblAmount"
    private Label lblAmount; // Value injected by FXMLLoader

    @FXML // fx:id="datepickerOperDate"
    private DatePicker datepickerOperDate; // Value injected by FXMLLoader

    @FXML // fx:id="cmbMaterialName"
    private ComboBox<?> cmbMaterialName; // Value injected by FXMLLoader

    @FXML // fx:id="txtAmount"
    private TextField txtAmount; // Value injected by FXMLLoader

    @FXML // fx:id="lblDate"
    private Label lblDate; // Value injected by FXMLLoader

    @FXML // fx:id="btnBack"
    private Button btnBack; // Value injected by FXMLLoader

    @FXML // fx:id="btnCancel"
    private Button btnCancel; // Value injected by FXMLLoader

    @FXML // fx:id="btnEnter"
    private Button btnEnter; // Value injected by FXMLLoader

    @FXML // fx:id="lblConsSiteAddress"
    private Label lblConsSiteAddress; // Value injected by FXMLLoader

    @FXML
    public void initialize() {
        datepickerOperDate.setStyle("-fx-font: 18px \"System\";");
        cmbMaterialName.setStyle("-fx-font: 18px \"System\";");
    }

}

