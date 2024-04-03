package com.example.week11;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(GreetingController.class)
public class HTTPRequestTestUsingMock {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void TestingDoubleNumber() throws Exception{
        mockMvc.perform(get("/Double?number=6"))
                .andExpect(status().isOk())
                .andExpect(content().string("12"));
    }

}
