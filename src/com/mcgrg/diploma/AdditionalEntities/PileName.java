package com.mcgrg.diploma.AdditionalEntities;

import com.mcgrg.diploma.entity.PileTypes;

/**
 * Created by MSI GT70 on 26.02.2017.
 */
public class PileName extends PileTypes {

    private String pile;

    public PileName(String str){
        this.pile = str;
    }

    public PileName(){
        this("");
    }

    public String getPileName() {
        return pile;
    }

    public void setPileName() {
        this.pile = this.getPileTypesName();
    }

    @Override
    public String toString() {
        return pile;
    }
}
