package com.mcgrg.diploma.connection;

import com.github.kevinsawicki.http.HttpRequest;
import com.google.gson.reflect.TypeToken;
import com.mcgrg.diploma.entity.Usergroups;

import java.util.List;
import java.util.Scanner;

public class Conn {
    public static void userconn(String[] a) {
//        try {
//            SelectEntityRequest ser = new SelectEntityRequest();
//            List<Materials> materialslist = ser.setRequest(new TypeToken<List<Materials>>() {
//            }.getType(), *);
//            for (Materials mat : materialslist) {
//                System.out.println(mat.toString());
//            }
//        }catch ( HttpRequest.HttpRequestException e){
//            e.printStackTrace();
//            }


        String columnname;
        String value;
        Scanner in = new Scanner(System.in);
        System.out.print("Column name: ");
        columnname = in.nextLine();
        System.out.print(" value: ");
        value = in.nextLine();
        try {
            InsertEntityRequest ier = new InsertEntityRequest();
            ier.setRequest(new TypeToken<List<Usergroups>>() {
            }.getType(), columnname, value);
        } catch (HttpRequest.HttpRequestException e) {
            e.printStackTrace();
        }
    }
}
