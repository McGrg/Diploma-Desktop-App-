//package com.mcgrg.diploma.AdditionalEntities;
//
//
//import javafx.util.StringConverter;
//import org.apache.commons.lang3.*;
//
///**
// * Created by MSI GT70 on 24.02.2017.
// */
//public class FIOConverter extends StringConverter<FioUsers> {
//
//    @Override
//    public String toString(FioUsers fio) {
//        return fio == null ? null : fio.getFio();
//    }
//
//    @Override
//    public FioUsers fromString(String str) {
//        FioUsers fio = null;
//
//        if (str.equals(null)) return fio;
////        str = str.trim();
//        int spaceAmount = StringUtils.countMatches(str, " ");
//        switch (spaceAmount) {
//            case 0: {
//                fio = null;
//            }
//            break;
//            case 1: {
//                int spaceIndex = StringUtils.indexOf(str, "");
//                String surame = str.substring(0, spaceIndex);
//                String name = str.substring(spaceIndex + 1);
//                fio = new FioUsers(surame, name, "");
//            }
//            break;
//            case 2: {
//                int spaceIndexFirst = StringUtils.indexOf(str, " ");
//                int spaceIndexSecond = StringUtils.lastIndexOf(str, " ");
//                String surame = str.substring(0, spaceIndexFirst);
//                String thirdName = str.substring(spaceIndexSecond + 1);
//                String name = str.substring(spaceIndexFirst + 1, spaceIndexSecond);
//                fio = new FioUsers(surame, name, thirdName);
//            }
//            break;
//            default: {
//                fio = null;
//            }
//        }
//        return fio;
//    }
//}
