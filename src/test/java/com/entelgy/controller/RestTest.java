package com.entelgy.controller;

import com.entelgy.EntelgyApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = EntelgyApplication.class)
@AutoConfigureMockMvc
class RestTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void listar() throws Exception {//Estatus de Conexión 200 OK
        mockMvc.perform(MockMvcRequestBuilders
                .post("/listar")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}