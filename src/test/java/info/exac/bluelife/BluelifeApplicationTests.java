package info.exac.bluelife;

import info.exac.bluelife.controller.HelloRestController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;


@SpringBootTest
class BluelifeApplicationTests {

    @Autowired
    private HelloRestController helloRestController;

    @Test
    public void contextLoads() {
        assertThat(helloRestController).isNotNull();
    }

}
