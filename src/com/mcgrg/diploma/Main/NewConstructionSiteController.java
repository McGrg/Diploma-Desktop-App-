package com.mcgrg.diploma.Main;

import com.google.gson.reflect.TypeToken;
import com.mcgrg.diploma.connection.InsertEntityRequest;
import com.mcgrg.diploma.entity.Stock;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

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
    private void onClickMethodNewSite() {
        try {
            Stage thirdStage = new Stage();
            Parent fxmlLoaderThree = FXMLLoader.load(getClass().getResource("NewAddress.fxml"));
            Scene sceneThree = new Scene(fxmlLoaderThree);
            thirdStage.setScene(sceneThree);
            thirdStage.setTitle("Добавление адреса");
            thirdStage.show();
        } catch (IOException e) {
            System.out.println(e.toString() + " :" + "Can't load new view!");
        }
    }

    @FXML
    private void onClickMethodNewDebit() {
        try {
            Stage thirdStage = new Stage();
            Parent fxmlLoaderThree = FXMLLoader.load(getClass().getResource("NewDebitStandart.fxml"));
            Scene sceneThree = new Scene(fxmlLoaderThree);
            thirdStage.setScene(sceneThree);
            thirdStage.setTitle("Добавление нормативов списания ТМЦ");
            thirdStage.show();
        } catch (IOException e) {
            System.out.println(e.toString() + " :" + "Can't load new view!");
        }
    }

    @FXML
    private void onClickMethodCancel() {
        try {
            Stage primaryStage = new Stage();
            Parent fxmlLoader = FXMLLoader.load(getClass().getResource("MainForm.fxml"));
            Scene scene = new Scene(fxmlLoader);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Выберите операцию");
            primaryStage.show();
            Stage stage = (Stage) btnCancel.getScene().getWindow();
            stage.hide();
        } catch (IOException e) {
            System.out.println(e.toString() + " :" + "Can't load new view!");
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
            } catch (Exception e) {
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
        } catch (IOException e) {
            System.out.println(e.toString() + " :" + "Can't load new view!");
        }
    }

    @FXML
    public void initialize() {
        cmbFioUsers.setStyle("-fx-font: 18px \"System\";");
    }

}

