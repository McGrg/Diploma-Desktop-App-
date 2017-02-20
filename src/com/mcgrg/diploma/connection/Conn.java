package com.mcgrg.diploma.connection;

import com.github.kevinsawicki.http.HttpRequest;
import com.google.gson.reflect.TypeToken;
import com.mcgrg.diploma.entity.ConstructionSite;
import com.mcgrg.diploma.entity.Materials;

import java.util.List;

public class Conn {
    public static void userconn(String[] a) {
        try {
            SelectEntityRequest ser = new SelectEntityRequest();
            List<ConstructionSite> materialslist = ser.setRequest(new TypeToken<List<Materials>>() {
            }.getType(), "*");
            for (ConstructionSite con : materialslist) {
                System.out.println(con.toString());
            }
        }catch ( HttpRequest.HttpRequestException e){
            e.printStackTrace();
            }


//        String columnname;
//        String value;
//        Scanner in = new Scanner(System.in);
//        System.out.print("Column name: ");
//        columnname = in.nextLine();
//        System.out.print(" value: ");
//        value = in.nextLine();
//        try {
//            InsertEntityRequest ier = new InsertEntityRequest();
//            ier.setRequest(new TypeToken<List<Usergroups>>() {
//            }.getType(), columnname, value);
//        } catch (HttpRequest.HttpRequestException e) {
//            e.printStackTrace();
//        }
    }
}
