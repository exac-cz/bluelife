package info.exac.bluelife.controller;

import info.exac.bluelife.domain.Message;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/hello")
public class HelloController {


    @RequestMapping(path = "/text", method = RequestMethod.GET)
    public ResponseEntity<?> helloAsText() {
        return ResponseEntity.ok("Hello");
    }


    @RequestMapping(path = "/json", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> helloAsJson() {
        return ResponseEntity.ok(new Message("Hello"));
    }

}
