package com.mcgrg.diploma.Interfaces;

import com.mcgrg.diploma.entity.ConstructionSite;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class WrapperConstructionSite {
    private ObservableList<ConstructionSite> oList = FXCollections.observableArrayList();

    public void add(ConstructionSite consSite){
        oList.add(consSite);
    }
}
