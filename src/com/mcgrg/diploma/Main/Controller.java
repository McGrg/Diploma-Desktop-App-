package com.mcgrg.diploma.Main;

import com.google.gson.reflect.TypeToken;
import com.mcgrg.diploma.connection.SelectEntityRequest;
import com.mcgrg.diploma.entity.ConstructionSite;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import javax.swing.*;
import java.util.List;

public class Controller {

    @FXML
    private AnchorPane ConstructionSitesView;

    @FXML
    private Button btnData;

    @FXML
    public void onClickMethod() {
        onButtonClick();
    }

    @FXML
    private TableView<ConstructionSite> ConstructionSitesTable;

    @FXML
    private TableColumn<ConstructionSite, Integer> tableColConsSiteId;

    @FXML
    private TableColumn<ConstructionSite, String> tableColConsSiteCity;

    @FXML
    private TableColumn<ConstructionSite, String> tableColConsSiteStreet;

    @FXML
    private TableColumn<ConstructionSite, String> tableColConsSiteBilding;

    @FXML
    private TableColumn<ConstructionSite, String> tableColStartDate;

    @FXML
    private TableColumn<ConstructionSite, String> tableColFinishDate;

    @FXML
    private TableColumn<ConstructionSite, String> tableColManager;

    @FXML
    public void initialize() {
    }

    public void onButtonClick() {
        try {
            SelectEntityRequest ser = new SelectEntityRequest();
            List<ConstructionSite> consList = ser.setRequest(new TypeToken<List<ConstructionSite>>() {
            }.getType(), "*");
            ObservableList<ConstructionSite> oConsList = FXCollections.observableArrayList(consList);
            tableColConsSiteId.setCellValueFactory(new PropertyValueFactory<ConstructionSite, Integer>("conssiteId"));
            tableColConsSiteCity.setCellValueFactory(new PropertyValueFactory<ConstructionSite, String>("conssiteCity"));
            tableColConsSiteStreet.setCellValueFactory(new PropertyValueFactory<ConstructionSite, String>("conssiteStreet"));
            tableColConsSiteBilding.setCellValueFactory(new PropertyValueFactory<ConstructionSite, String>("conssiteBilding"));
            tableColStartDate.setCellValueFactory(new PropertyValueFactory<ConstructionSite, String>("startDate"));
            tableColFinishDate.setCellValueFactory(new PropertyValueFactory<ConstructionSite, String>("finishDate"));
            tableColManager.setCellValueFactory(new PropertyValueFactory<ConstructionSite, String>("manager"));
            ConstructionSitesTable.setItems(oConsList);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString(),
                    "Ошибка!",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
