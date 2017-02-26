package com.mcgrg.diploma.Main;

import com.google.gson.reflect.TypeToken;
import com.mcgrg.diploma.AdditionalEntities.MaterialName;
import com.mcgrg.diploma.connection.SelectEntityRequest;
import com.mcgrg.diploma.entity.Materials;
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
    private ComboBox<MaterialName> cmbMaterialName; // Value injected by FXMLLoader

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
    private void onClickMethodCancel() {
        try {
            Stage stage = (Stage) btnCancel.getScene().getWindow();
            stage.hide();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    private void onClickMethodBack() {
        try {
            Stage primaryStage = new Stage();
            Parent fxmlLoader = FXMLLoader.load(getClass().getResource("MainForm.fxml"));
            Scene scene = new Scene(fxmlLoader);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Выберите операцию");
            primaryStage.show();
            Stage stage = (Stage) btnBack.getScene().getWindow();
            stage.hide();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    private void onClickMethodEnter() {
        try {
            Stage primaryStage = new Stage();
            Parent fxmlLoader = FXMLLoader.load(getClass().getResource("SupplyInputForm.fxml"));
            Scene scene = new Scene(fxmlLoader);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Данные к загрузке");
            primaryStage.setResizable(false);
            primaryStage.show();
            Stage stage = (Stage) btnEnter.getScene().getWindow();
            stage.hide();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    public void initialize() {
        datepickerOperDate.setStyle("-fx-font: 18px \"System\";");
        cmbMaterialName.getItems().addAll(setMaterials());
        cmbMaterialName.setStyle("-fx-font: 18px \"System\";");
        setMaterials();
    }

    private ArrayList<MaterialName> setMaterials(){
        List<Materials> materialsList;
        ArrayList<MaterialName> matList = new ArrayList<>();
        try {
            SelectEntityRequest ser = new SelectEntityRequest();
            materialsList = ser.setRequest(new TypeToken<List<Materials>>() {
            }.getType());
            for (Materials mat:materialsList){
                MaterialName matname = new MaterialName(mat.getMaterialsName());
                matList.add(matname);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Поступление:" + e.toString(),
                    "Ошибка!",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        return matList;
    }

}

