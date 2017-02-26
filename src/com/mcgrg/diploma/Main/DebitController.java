package com.mcgrg.diploma.Main;

import com.google.gson.reflect.TypeToken;
import com.mcgrg.diploma.connection.SelectEntityRequest;
import com.mcgrg.diploma.entity.PileTypes;
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
    private void onClickMethodInputData() {
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
        cmbPileType.setStyle("-fx-font: 18px \"System\";");
        datePicker.setStyle("-fx-font: 18px \"System\";");
        setPileTypes();
    }

    private List<PileTypes>  setPileTypes(){
        List<PileTypes> pilesList = new ArrayList<>();
        try {
            SelectEntityRequest ser = new SelectEntityRequest();
            pilesList = ser.setRequest(new TypeToken<List<PileTypes>>() {
            }.getType());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Изготовление свай: " + e.toString(),
                    "Ошибка!",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        return pilesList;
    }
}
