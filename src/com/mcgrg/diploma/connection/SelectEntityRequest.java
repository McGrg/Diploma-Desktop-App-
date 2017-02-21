package com.mcgrg.diploma.connection;

import com.github.kevinsawicki.http.HttpRequest;
import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by MSI GT70 on 18.02.2017.
 */
public class SelectEntityRequest<T> {
    public List<T> setRequest(Type itemListType, String column) throws HttpRequest.HttpRequestException {
        List<T> parsegson = null;
        StringBuilder classname = new StringBuilder(itemListType.toString());
        String tablename = classname.delete(0, classname.lastIndexOf(".") + 1).deleteCharAt(classname.length() - 1).toString().toLowerCase();
        String strRequest = "SELECT " + column + " FROM diploma." + tablename + ";";
        System.out.println(strRequest);
        HttpRequest request = HttpRequest.post("http://127.0.0.1:8080/ServletDBMySql", true, "sql", strRequest, "table", tablename);
        System.out.println(request.code());
        if (request.code() == 200) {
            parsegson = new Gson().fromJson(request.body(), itemListType);
        }
        return parsegson;
    }
}

