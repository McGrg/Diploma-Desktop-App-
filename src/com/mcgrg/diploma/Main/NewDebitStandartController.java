package com.mcgrg.diploma.Main;

import com.google.gson.reflect.TypeToken;
import com.mcgrg.diploma.connection.InsertEntityRequest;
import com.mcgrg.diploma.connection.SelectEntityRequest;
import com.mcgrg.diploma.entity.Debitstandart;
import com.mcgrg.diploma.entity.Materials;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

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
                InsertEntityRequest<Debitstandart> insDebit = new InsertEntityRequest<>();
                insDebit.setRequest(new TypeToken<Debitstandart>() {
                        }.getType(), "DebitStandart_site_ID, DebitStandart_materials, DebitStandart_value, DebitStandart_piles_type_id",
                        " 3, 8, 345, 6");
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
        setMaterials();
        cmbMaterial1.setStyle("-fx-font: 18px \"System\";");
        cmbMaterial2.setStyle("-fx-font: 18px \"System\";");
        cmbMaterial3.setStyle("-fx-font: 18px \"System\";");
    }

    private List<Materials> setMaterials(){
        List<Materials> materialsList = new ArrayList<>();
        try {
            SelectEntityRequest ser = new SelectEntityRequest();
            materialsList = ser.setRequest(new TypeToken<List<Materials>>() {
            }.getType());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Изготовление свай: " + e.toString(),
                    "Ошибка!",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        return materialsList;
    }

}

