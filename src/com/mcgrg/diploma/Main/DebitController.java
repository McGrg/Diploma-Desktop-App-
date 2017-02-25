package com.mcgrg.diploma.Main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class DebitController {

    @FXML // fx:id="debidForm"
    private AnchorPane debidForm; // Value injected by FXMLLoader

    @FXML // fx:id="btnBack"
    private Button btnBack; // Value injected by FXMLLoader

    @FXML // fx:id="btnCancel"
    private Button btnCancel; // Value injected by FXMLLoader

    @FXML // fx:id="btnEnter"
    private Button btnEnter; // Value injected by FXMLLoader

    @FXML // fx:id="datePicker"
    private DatePicker datePicker; // Value injected by FXMLLoader

    @FXML // fx:id="lblConsSite"
    private Label lblConsSite; // Value injected by FXMLLoader

    @FXML // fx:id="cmbPileType"
    private ComboBox<?> cmbPileType; // Value injected by FXMLLoader

    @FXML // fx:id="txtPileAmount"
    private TextField txtPileAmount; // Value injected by FXMLLoader

    @FXML
    public void initialize() {
        cmbPileType.setStyle("-fx-font: 18px \"System\";");
        datePicker.setStyle("-fx-font: 18px \"System\";");
    }


}
