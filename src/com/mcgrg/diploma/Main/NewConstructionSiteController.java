package com.mcgrg.diploma.Main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class NewConstructionSiteController {

    @FXML // fx:id="lblLabel"
    private Label lblLabel; // Value injected by FXMLLoader

    @FXML // fx:id="lblAddress"
    private Label lblAddress; // Value injected by FXMLLoader

    @FXML // fx:id="lblChef"
    private Label lblChef; // Value injected by FXMLLoader

    @FXML // fx:id="cmbFioUsers"
    private ComboBox<?> cmbFioUsers; // Value injected by FXMLLoader

    @FXML // fx:id="btnNewConsSite"
    private Button btnNewConsSite; // Value injected by FXMLLoader

    @FXML // fx:id="lblDebits"
    private Label lblDebits; // Value injected by FXMLLoader

    @FXML // fx:id="btnNewDebit"
    private Button btnNewDebit; // Value injected by FXMLLoader

    @FXML // fx:id="btnCancel"
    private Button btnCancel; // Value injected by FXMLLoader

    @FXML // fx:id="btnEnter"
    private Button btnEnter; // Value injected by FXMLLoader

    @FXML
    public void initialize() {
cmbFioUsers.setStyle("-fx-font: 18px \"System\";");
    }

}

