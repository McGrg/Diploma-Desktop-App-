package com.mcgrg.diploma.Main;

import com.google.gson.reflect.TypeToken;
import com.mcgrg.diploma.connection.InsertEntityRequest;
import com.mcgrg.diploma.entity.Stock;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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

    @FXML
    private void onClickMethodCancel() {
        try {
            Stage secondaryStage = new Stage();
            Parent fxmlLoaderTwo = FXMLLoader.load(getClass().getResource("SupplyForm.fxml"));
            Scene sceneTwo = new Scene(fxmlLoaderTwo);
            secondaryStage.setScene(sceneTwo);
            secondaryStage.setTitle("Поступление материалов");
            secondaryStage.setResizable(false);
            secondaryStage.show();
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
                InsertEntityRequest<Stock> insStock = new InsertEntityRequest<>();
                insStock.setRequest(new TypeToken<Stock>() {
                        }.getType(), "stock_materials, stock_amount, stock_site_id",
                        " 3, 16000, 1");
            }catch (Exception e){
                e.printStackTrace();
            }
            Stage secondaryStage = new Stage();
            Parent fxmlLoaderTwo = FXMLLoader.load(getClass().getResource("OkForm.fxml"));
            Scene sceneTwo = new Scene(fxmlLoaderTwo);
            secondaryStage.setScene(sceneTwo);
            secondaryStage.setTitle("Успешно!");
            secondaryStage.setResizable(false);
            secondaryStage.show();
            Stage stage = (Stage) btnEnter.getScene().getWindow();
            stage.hide();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    private void onClickMethodDelete(){

    }

    @FXML
    private void onClickMethodAdd(){

    }
}
