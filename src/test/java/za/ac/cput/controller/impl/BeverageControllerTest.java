package za.ac.cput.controller.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BeverageControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private final String BASE_URL = "http://localhost:8080/beverage/getBeverageList";

    @Test
    void testGetBeverageList()
    {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String>entity = new HttpEntity(null, headers);
        ResponseEntity<String>response = restTemplate.exchange(BASE_URL, HttpMethod.GET, entity, String.class);

        System.out.println("Show all Beverages");
        System.out.println(response.getBody());

    }


}