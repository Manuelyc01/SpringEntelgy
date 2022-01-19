package com.entelgy.controller;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.jupiter.api.Test;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


class RestTest {

    @Test
    public void statu() throws IOException {//Estatus de Conexión 200 OK

        HttpUriRequest request = new HttpPost( "http://localhost:8081/listar");

        HttpResponse httpResponse = HttpClientBuilder.create().build().execute( request );

        assertThat(httpResponse.getStatusLine().getStatusCode(),equalTo(HttpStatus.SC_OK));
    }


}