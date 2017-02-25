package com.mcgrg.diploma.Main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class SupplyInputController {

    @FXML // fx:id="SupplyForm"
    private AnchorPane SupplyForm; // Value injected by FXMLLoader

    @FXML // fx:id="tblDebitOperation"
    private TableView<?> tblDebitOperation; // Value injected by FXMLLoader

    @FXML // fx:id="colMaterialName"
    private TableColumn<?, ?> colMaterialName; // Value injected by FXMLLoader

    @FXML // fx:id="colMaterialAmount"
    private TableColumn<?, ?> colMaterialAmount; // Value injected by FXMLLoader

    @FXML // fx:id="colDateOfOper"
    private TableColumn<?, ?> colDateOfOper; // Value injected by FXMLLoader

    @FXML // fx:id="lblConsSiteAddress"
    private Label lblConsSiteAddress; // Value injected by FXMLLoader

    @FXML // fx:id="btnCancel"
    private Button btnCancel; // Value injected by FXMLLoader

    @FXML // fx:id="btnEnter"
    private Button btnEnter; // Value injected by FXMLLoader

    @FXML // fx:id="btnDelete"
    private Button btnDelete; // Value injected by FXMLLoader

    @FXML // fx:id="btnAdd"
    private Button btnAdd; // Value injected by FXMLLoader

}
