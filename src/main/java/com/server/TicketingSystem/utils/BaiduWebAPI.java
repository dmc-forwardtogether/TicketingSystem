package com.server.TicketingSystem.utils;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class BaiduWebAPI {

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        try (InputStream is = new URL(url).openStream()) {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
            String jsonText = readAll(rd);
            return new JSONObject(jsonText);
        }
    }

    public static void main(String[] args) throws IOException, JSONException {
        //这里调用百度的ip定位api服务 详见 http://api.map.baidu.com/lbsapi/cloud/ip-location-api.htm
        //47.118.50.14,127.0.0.1
        JSONObject json = readJsonFromUrl("https://api.map.baidu.com/location/ip?ak=oHnhZoQuhOqas5kjleR6jTjcrcKU7Xi8&ip=203.119.241.103&coor=bd09ll");
        System.out.println(json);
        JSONObject content = (JSONObject) json.get("content");
        JSONObject address_detail = (JSONObject) content.get("address_detail");
        System.out.println(content.get("address"));
        System.out.println(address_detail.get("city") );
    }
}
