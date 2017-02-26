package com.mcgrg.diploma.Main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML // fx:id="lblOperationType"
    private Label lblOperationType; // Value injected by FXMLLoader

    @FXML // fx:id="rbtSupply"
    private RadioButton rbtSupply; // Value injected by FXMLLoader

    @FXML // fx:id="rbtMakingPile"
    private RadioButton rbtMakingPile; // Value injected by FXMLLoader

    @FXML // fx:id="btnExit"
    private Button btnExit; // Value injected by FXMLLoader

    @FXML // fx:id="btnCancel"
    private Button btnCancel; // Value injected by FXMLLoader

    @FXML // fx:id="btnEnter"
    private Button btnEnter; // Value injected by FXMLLoader

    @FXML // fx:id="lblconsSiteAddress"
    private Label lblconsSiteAddress; // Value injected by FXMLLoader

    @FXML
    private Button btnNewConsSite;

    @FXML
    private void onClickMethodExit() {
        try {
            Stage stage = (Stage) btnExit.getScene().getWindow();
            stage.hide();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    private void onClickMethodEnter(){
        try {
            //-------------------------------------------------------------------------
            Stage primaryStage = new Stage();
            Parent fxmlLoader = FXMLLoader.load(getClass().getResource("DebitForm.fxml"));
            Scene scene = new Scene(fxmlLoader);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Выполненные работы");
            primaryStage.setResizable(false);
            primaryStage.show();
            //--------------------------------------------------------------------------
            Stage secondaryStage = new Stage();
            Parent fxmlLoaderTwo = FXMLLoader.load(getClass().getResource("SupplyForm.fxml"));
            Scene sceneTwo = new Scene(fxmlLoaderTwo);
            secondaryStage.setScene(sceneTwo);
            secondaryStage.setTitle("Поступление материалов");
            secondaryStage.setResizable(false);
            secondaryStage.show();
            //--------------------------------------------------------------------------
            Stage stage = (Stage) btnEnter.getScene().getWindow();
            stage.hide();
        } catch (Exception e) {
            System.out.println(e.toString() + " :" + "Can't load new view!");
        }
    }

    @FXML
    private void onClickMethodNewSite() {
        try {
            Stage thirdStage = new Stage();
            Parent fxmlLoaderThree = FXMLLoader.load(getClass().getResource("NewConstructionSiteForm.fxml"));
            Scene sceneThree = new Scene(fxmlLoaderThree);
            thirdStage.setScene(sceneThree);
            thirdStage.setTitle("Добавление новой строительной площадки");
            thirdStage.show();
            Stage stage = (Stage) btnNewConsSite.getScene().getWindow();
            stage.hide();
        } catch (IOException e) {
            System.out.println(e.toString() + " :" + "Can't load new view!");
        }
    }


    @FXML
    private void onClickMethodCancel() {
        try {
            Stage thirdStage = new Stage();
            Parent fxmlLoaderThree = FXMLLoader.load(getClass().getResource("Authentifikation.fxml"));
            Scene sceneThree = new Scene(fxmlLoaderThree);
            thirdStage.setScene(sceneThree);
            thirdStage.setTitle("Авторизация");
            thirdStage.show();
            Stage stage = (Stage) btnCancel.getScene().getWindow();
            stage.hide();
        } catch (IOException e) {
            System.out.println(e.toString() + " :" + "Can't load new view!");
        }
    }

    @FXML
    public void initialize() {
        
    }

}

