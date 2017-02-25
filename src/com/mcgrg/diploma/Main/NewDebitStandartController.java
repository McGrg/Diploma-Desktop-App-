package com.mcgrg.diploma.Main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NewDebitStandartController {

    @FXML // fx:id="lblLabel"
    private Label lblLabel; // Value injected by FXMLLoader

    @FXML // fx:id="cmbMaterial1"
    private ComboBox<?> cmbMaterial1; // Value injected by FXMLLoader

    @FXML // fx:id="cmbMaterial2"
    private ComboBox<?> cmbMaterial2; // Value injected by FXMLLoader

    @FXML // fx:id="cmbMaterial3"
    private ComboBox<?> cmbMaterial3; // Value injected by FXMLLoader

    @FXML // fx:id="txtDebitStandart1"
    private TextField txtDebitStandart1; // Value injected by FXMLLoader

    @FXML // fx:id="txtDebitStandart2"
    private TextField txtDebitStandart2; // Value injected by FXMLLoader

    @FXML // fx:id="txtDebitStandart3"
    private TextField txtDebitStandart3; // Value injected by FXMLLoader

    @FXML // fx:id="btnCancel"
    private Button btnCancel; // Value injected by FXMLLoader

    @FXML // fx:id="btnEnter"
    private Button btnEnter; // Value injected by FXMLLoader

    @FXML
    public void initialize() {
        cmbMaterial1.setStyle("-fx-font: 18px \"System\";");
        cmbMaterial2.setStyle("-fx-font: 18px \"System\";");
        cmbMaterial3.setStyle("-fx-font: 18px \"System\";");
    }

}

