package com.example.tutorial.spring.web.app.models.Services;

import org.junit.Test;
import org.mockito.internal.util.StringUtil;

import static org.junit.Assert.*;

public class VideoServiceTest {

    @Test
    public void repeat() {
        String result = VideoService.repeat("test ",3);
        System.out.println(result);
    }
}