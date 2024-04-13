package API;

import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;

import com.google.gson.Gson;

import java.io.IOException;

import interfaces.LayTruyenVe;
//import kong.unirest.GenericType;
//import kong.unirest.HttpResponse;
//import kong.unirest.JsonNode;
//import kong.unirest.ObjectMapper;
//import kong.unirest.Unirest;
//import kong.unirest.UnirestException;
import model.TruyenTranh;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class ApiLayTruyen extends AsyncTask<Void, Void, ApiResponse> {
    String data;
    LayTruyenVe layTruyenVe;

    public ApiLayTruyen(LayTruyenVe layTruyenVe) {
        this.layTruyenVe = layTruyenVe;
        this.layTruyenVe.batdau();
    }

    public static ApiResponse get(String url){
//        try {
//
//            HttpResponse<String> response = Unirest.get(url).asString();
//            return response.getBody();
//        } catch (UnirestException e) {
//            throw new RuntimeException(e);
//        }

        try{
            OkHttpClient client = new OkHttpClient().newBuilder()
                    .build();
            Request request = new Request.Builder()
                    .url("https://api.myjson.online/v1/records/2bf44877-11a2-48fb-aedc-36e7174bbed6")
                    .build();
            Response response = client.newCall(request).execute();
            String responseBody = response.body().string();
            Gson gson = new Gson();
            ApiResponse truyen = gson.fromJson(responseBody, ApiResponse.class);
            return truyen;
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static ApiResponse getData(){
        return get("https://api.myjson.online/v1/records/2bf44877-11a2-48fb-aedc-36e7174bbed6");
    }
//    @Override
//    protected Void doInBackground(Void... voids) {
//        String responseString = getData();
//        ObjectMapper mapper = new ObjectMapper() {
//            @Override
//            public <T> T readValue(String value, Class<T> valueType) {
//                return null;
//            }
//
//            @Override
//            public <T> T readValue(String value, GenericType<T> genericType) {
//                return ObjectMapper.super.readValue(value, genericType);
//            }
//
//            @Override
//            public String writeValue(Object value) {
//                return null;
//            }
//        };
//
//        Response response = mapper.readValue(responseString, Response.class);
//        data = response.toString();
//        return null;
//    }


    @Override
    protected ApiResponse doInBackground(Void... voids) {
        return getData();
    }
    @Override
    protected void onPostExecute(ApiResponse result) {
        if (result == null) {
            this.layTruyenVe.biLoi();
        } else {
            this.layTruyenVe.ketthuc(result);
        }
    }
}
