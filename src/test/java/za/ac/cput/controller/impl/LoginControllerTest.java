package za.ac.cput.controller.impl;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.web.util.UriComponentsBuilder;
import za.ac.cput.entity.Login;
import za.ac.cput.factory.LoginFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class LoginControllerTest {

    //Attributes
        private static Login login = LoginFactory.createLogin("217009301", "jon010snow", "Password01");
        @Autowired
        private TestRestTemplate restTemplate;
    private final String BASE_URL = "http://localhost:8080/login/getLoginDetails";

    //@Disabled("This test is not fully implemented yet!")
    @Test
    void testGetLoginDetails()
    {//Url for the create method
        System.out.println("URL: " + BASE_URL);

        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);

        UriComponentsBuilder queryParams = UriComponentsBuilder.fromHttpUrl(BASE_URL)
        .queryParam("username", login.getUsername())
        .queryParam("password", login.getPassword());

        HttpEntity<?> entity = new HttpEntity<>(headers);

        HttpEntity<Boolean> response = restTemplate.exchange(queryParams.build().toUriString(), HttpMethod.POST, entity, boolean.class);

        assertTrue(response.getBody());
    }
}