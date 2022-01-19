package com.entelgy.service;

import com.entelgy.models.DataContainer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class ServiceImplTest {


    @InjectMocks
    private ServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void list() {//Datos por service deben ser iguales a la clase
        assertEquals(DataContainer.class, service.list("https://reqres.in/api/users").getClass());
    }
}