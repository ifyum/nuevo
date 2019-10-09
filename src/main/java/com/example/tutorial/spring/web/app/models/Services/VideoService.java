package com.example.tutorial.spring.web.app.models.Services;

public class VideoService {

    public static String repeat(String str, int times){
        String result = "";
        for (int i=0; i<times; i++){
            result +=str;
        }
    return result;
    }
}
