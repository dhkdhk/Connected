package com.connected.connected.support;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.nio.charset.StandardCharsets;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ControllerSupport {

    @Autowired
    protected MockMvc mockMvc;
    protected final MediaType JSON_UTF8_MEDIA_TYPE = new MediaType(MediaType.APPLICATION_JSON, StandardCharsets.UTF_8);

    @Autowired
    private ObjectMapper objectMapper;


    protected <T> ResultActions postApi(String url, T body) throws Exception{
        return mockMvc.perform(post(url)
                    .contentType(JSON_UTF8_MEDIA_TYPE)
                    .accept(JSON_UTF8_MEDIA_TYPE)
                    .content(objectMapper.writeValueAsString(body)));
    }


}
