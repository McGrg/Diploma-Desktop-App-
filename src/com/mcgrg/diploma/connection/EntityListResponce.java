package com.mcgrg.diploma.connection;

import com.google.gson.Gson;

import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;

/**
 * Created by MSI GT70 on 17.02.2017.
 */
public class EntityListResponce<T> {
    public LinkedList<T> getList(Type itemListType)

    {
        URL url = null;
        LinkedList<T> parsegson = null;
        HttpURLConnection urlconnection = null;
        try {
            url = new URL("http://127.0.0.1:8080/ServletDBMySql");
            urlconnection = (HttpURLConnection) url.openConnection();
            urlconnection.setRequestMethod("POST");
            urlconnection.setUseCaches(false);
            urlconnection.setConnectTimeout(3000);
            urlconnection.setReadTimeout(3000);
            urlconnection.connect();
            if (HttpURLConnection.HTTP_OK==urlconnection.getResponseCode()){
                parsegson = new Gson().fromJson(new InputStreamReader(urlconnection.getInputStream()), itemListType);
            } else {
                System.out.println("fail: " + urlconnection.getResponseCode() + " " + urlconnection.getResponseMessage());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            urlconnection.disconnect();
        }
        return parsegson;
    }
}
