package com.mcgrg.diploma.connection;

import com.github.kevinsawicki.http.HttpRequest;

import java.lang.reflect.Type;

/**
 * Created by MSI GT70 on 19.02.2017.
 */
public class InsertEntityRequest<T> {
    public void setRequest(Type itemListType, String value) throws HttpRequest.HttpRequestException {
        StringBuilder classname = new StringBuilder(itemListType.toString());
        String tablename = classname.delete(0, classname.lastIndexOf(".")+1).toString().toLowerCase();
        String strRequest = "INSERT INTO diploma." + tablename + " ( authentifikation_name, authentifikation_password ) Values(' " + value + " ');";
        System.out.println(strRequest);
        HttpRequest request = HttpRequest.post("http://127.0.0.1:8080/InputServlet", true, "sql", strRequest, "table", tablename, "operation", "INSERT");
        System.out.println(request.code());
        if (request.code() == 200) {
            System.out.println(request.body());
        }
    }
}
