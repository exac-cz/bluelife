package info.exac.bluelife;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@SpringBootApplication
@EnableWebMvc
public class BlueLifeApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BlueLifeApplication.class, args);
    }


    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

    }

}
