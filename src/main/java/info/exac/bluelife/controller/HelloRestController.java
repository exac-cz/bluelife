package info.exac.bluelife.controller;

import info.exac.bluelife.domain.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello")
public class HelloRestController {


    @RequestMapping(path = "/text", method = RequestMethod.GET)
    public ResponseEntity<?> helloAsText() {
        return new ResponseEntity<String>("Hello", HttpStatus.OK);
    }


    @RequestMapping(path = "/json", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> helloAsJson() {
        return ResponseEntity.ok(new Message("Hello"));
    }

}
