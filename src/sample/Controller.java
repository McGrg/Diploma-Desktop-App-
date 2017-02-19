package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import sample.Entity.ConstructionSites;

public class Controller {

    private ObservableList<ConstructionSites> constructionSite = FXCollections.observableArrayList();

    public ObservableList<ConstructionSites> getConstructionSite() {
        return constructionSite;
    }

    public void setConstructionSite(ObservableList<ConstructionSites> constructionSite) {
        this.constructionSite = constructionSite;
    }

    @FXML
    private AnchorPane ConstructionSitesView;

    @FXML
    private Button btnData;

    @FXML
    public void onClickMethod(){
        onButtonClick();
    }

    @FXML
    private TableView<ConstructionSites> ConstructionSitesTable;

    @FXML
    private TableColumn<ConstructionSites, Integer> tableColConsSiteId;

    @FXML
    private TableColumn<ConstructionSites, String> tableColConsSiteCity;

    @FXML
    private TableColumn<ConstructionSites, String> tableColConsSiteStreet;

    @FXML
    private TableColumn<ConstructionSites, String> tableColConsSiteBilding;

    @FXML
    private TableColumn<ConstructionSites, String> tableColStartDate;

    @FXML
    private TableColumn<ConstructionSites, String> tableColFinishDate;

    @FXML
    private TableColumn<ConstructionSites, String> tableColManager;

    @FXML
    public void initialize() {
//        btnData.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                onButtonClick();
//            }
//        });

    }

    public  void onButtonClick() {
        ConstructionSites site = new ConstructionSites(1, "Санкт-Петербург",
                "Пискаревский пр.", "3",
                "12.08.2015", "25.12.2016", "Петров Алексей");
        constructionSite.add(site);
        tableColConsSiteId.setCellValueFactory(cellData->cellData.getValue().conssiteIdProperty().asObject());
        tableColConsSiteCity.setCellValueFactory(cellData->cellData.getValue().conssiteCityProperty());
        tableColConsSiteStreet.setCellValueFactory(cellData->cellData.getValue().conssiteStreetProperty());
        tableColConsSiteBilding.setCellValueFactory(cellData->cellData.getValue().conssiteBildingProperty());
        tableColStartDate.setCellValueFactory(cellData->cellData.getValue().conssiteStartDateProperty());
        tableColFinishDate.setCellValueFactory(cellData->cellData.getValue().conssiteFinishDateProperty());
        tableColManager.setCellValueFactory(cellData->cellData.getValue().conssiteManagerProperty());
        ConstructionSitesTable.setItems(constructionSite);
    }
}
