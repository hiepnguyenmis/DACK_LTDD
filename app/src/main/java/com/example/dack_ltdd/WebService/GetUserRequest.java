package com.example.dack_ltdd.WebService;


import com.example.dack_ltdd.Model.User;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Map;

import okhttp3.Request;



public class GetUserRequest extends SeverRequest {
    public GetUserRequest(SeverRequestListener listener) {
        super(listener);
    }

    @Override
    protected Request prepare(Map<String, String> parameter) {

        Request request = new Request.Builder()
                .url(URL)
                .get()
                .addHeader("Content-Type", "application/json")
                .build();
        return request;
    }

    @Override
    protected Object process(String data) {
        try {
            ArrayList<User> arr=new ArrayList<>();
            JSONArray jsonArray=new JSONArray(data);


            for(int i=0;i<jsonArray.length();i++){
                JSONObject jsOb=jsonArray.getJSONObject(i);
                User us=new User(
                        jsOb.getInt("$id"),
                        null,
                        null,
                        jsOb.getInt("id"),
                        jsOb.getString("name"),
                        jsOb.getString("username"),
                        jsOb.getString("password"),
                        jsOb.getString("phone"),
                        jsOb.getString("email"),
                        null
                );
                arr.add(us);
            }
            return arr;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}