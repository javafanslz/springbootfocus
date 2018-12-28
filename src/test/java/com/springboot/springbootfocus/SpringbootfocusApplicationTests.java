package com.springboot.springbootfocus;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;

import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringbootfocusApplicationTests {
    @LocalServerPort
    private int port;
    private URL base;
    @Autowired
    private TestRestTemplate testRestTemplate;
    @Before
    public void setUp() throws Exception{
        this.base = new URL("http://localhost:"+port+"/hello");
    }

    @Test
    public void contextLoads() {
        ResponseEntity<String> response = testRestTemplate.getForEntity(base.toString(), String.class);
        Assert.assertEquals(response.getBody(),"Gettings from Spring Boot");
    }
}
