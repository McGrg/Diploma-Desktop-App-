package com.mcgrg.diploma.Main;

import com.google.gson.reflect.TypeToken;
import com.mcgrg.diploma.connection.SelectEntityRequest;
import com.mcgrg.diploma.entity.ConsSiteTable;
import com.mcgrg.diploma.entity.ConstructionSite;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

import javax.swing.*;
import java.util.List;

public class Controller {

    private ObservableList<ConsSiteTable> constructionSite = FXCollections.observableArrayList();

    public ObservableList<ConsSiteTable> getConstructionSite() {
        return constructionSite;
    }

    public void setConstructionSite(ObservableList<ConsSiteTable> constructionSite) {
        this.constructionSite = constructionSite;
    }

    @FXML
    private AnchorPane ConstructionSitesView;

    @FXML
    private Button btnData;

    @FXML
    public void onClickMethod() {

        onButtonClick();
    }

    @FXML
    private TableView<ConsSiteTable> ConstructionSitesTable;

    @FXML
    private TableColumn<ConsSiteTable, Integer> tableColConsSiteId;

    @FXML
    private TableColumn<ConsSiteTable, String> tableColConsSiteCity;

    @FXML
    private TableColumn<ConsSiteTable, String> tableColConsSiteStreet;

    @FXML
    private TableColumn<ConsSiteTable, String> tableColConsSiteBilding;

    @FXML
    private TableColumn<ConsSiteTable, String> tableColStartDate;

    @FXML
    private TableColumn<ConsSiteTable, String> tableColFinishDate;

    @FXML
    private TableColumn<ConsSiteTable, String> tableColManager;

    @FXML
    public void initialize() {
    }

    public void onButtonClick() {
        try {
            SelectEntityRequest ser = new SelectEntityRequest();
            List<ConstructionSite> consList = ser.setRequest(new TypeToken<List<ConstructionSite>>() {
            }.getType(), "*");

            for (ConstructionSite site : consList) {
                ConsSiteTable table = new ConsSiteTable(site.getConssiteId(), site.getConssiteCity(), site.getConssiteStreet(), site.getConssiteBilding(), site.getStartDate(), site.getFinishDate(), site.getManager());
                constructionSite.add(table);
                tableColConsSiteId.setCellValueFactory(cellData -> cellData.getValue().conssiteIdProperty().asObject());
                tableColConsSiteCity.setCellValueFactory(cellData -> cellData.getValue().conssiteCityProperty());
                tableColConsSiteStreet.setCellValueFactory(cellData -> cellData.getValue().conssiteStreetProperty());
                tableColConsSiteBilding.setCellValueFactory(cellData -> cellData.getValue().conssiteBildingProperty());
                tableColStartDate.setCellValueFactory(cellData -> cellData.getValue().conssiteStartDateProperty());
                tableColFinishDate.setCellValueFactory(cellData -> cellData.getValue().conssiteFinishDateProperty());
                tableColManager.setCellValueFactory(cellData -> cellData.getValue().conssiteManagerProperty());
                ConstructionSitesTable.setItems(constructionSite);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString(),
                    "Ошибка!",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
