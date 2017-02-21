package com.mcgrg.diploma.Interfaces;

import com.mcgrg.diploma.entity.ConstructionSite;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Created by MSI GT70 on 21.02.2017.
 */
public class WrapperConstructionSite {
    private ObservableList<ConstructionSite> oList = FXCollections.observableArrayList();

    public void add(ConstructionSite consSite){
        oList.add(consSite);
    }
}
