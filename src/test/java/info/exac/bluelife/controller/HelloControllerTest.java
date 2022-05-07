package info.exac.bluelife.controller;

import info.exac.bluelife.domain.Message;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;


import static org.assertj.core.api.Assertions.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    public static final String BASE_URI = "http://localhost";

    @Test
    void helloAsText() {
        String result = testRestTemplate.getForObject(BASE_URI + ":" + port + "/hello/text", String.class);
        assertThat(result).isEqualTo("\"Hello\"");
    }


    @Test
    void helloAsJson() {
        Message result = testRestTemplate.getForObject(BASE_URI + ":" + port + "/hello/json", Message.class);
        assertThat(result).isNotNull();
        assertThat(result.getContent()).isEqualTo("Hello");
    }

}