package com.mcgrg.diploma.connection;

import com.github.kevinsawicki.http.HttpRequest;
import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by MSI GT70 on 18.02.2017.
 */
public class SelectEntityRequest<T> {
    public List<T> setRequest(Type itemListType) throws HttpRequest.HttpRequestException {
        List<T> parsegson = null;
        String report;
        StringBuilder classname = new StringBuilder(itemListType.toString());
        String tablename = classname.delete(0, classname.lastIndexOf(".") + 1).deleteCharAt(classname.length() - 1).toString().toLowerCase();
        String strRequest = "SELECT * FROM diploma." + tablename + ";";
        HttpRequest request = HttpRequest.post("http://127.0.0.1:8080/ServletDBMySql", true, "sql", strRequest, "table", tablename);
        if (request.code() == 200) {
            report = request.body();
            System.out.println(report);
            parsegson = new Gson().fromJson(report, itemListType);
            System.out.println(parsegson);
        }
        return parsegson;
    }

    public List<T> setRequestWhere (Type itemListType, String clause, String volume) throws HttpRequest.HttpRequestException {
        List<T> parsegson = null;
        StringBuilder classname = new StringBuilder(itemListType.toString());
        String tablename = classname.delete(0, classname.lastIndexOf(".") + 1).deleteCharAt(classname.length() - 1).toString().toLowerCase();
        String strRequest = "SELECT * FROM diploma." + tablename + " WHERE " + clause + " like '%" + volume + "%';";
        HttpRequest request = HttpRequest.post("http://127.0.0.1:8080/ServletDBMySql", true, "sql", strRequest, "table", tablename);
        if (request.code() == 200) {
            parsegson = new Gson().fromJson(request.body(), itemListType);
        }
        return parsegson;
    }
}

