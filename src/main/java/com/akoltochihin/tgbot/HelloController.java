package com.akoltochihin.tgbot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class HelloController {

    private static final Logger LOG = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private Storage storage;

    @GetMapping("/strings")
    public List<String> hello() {
        LOG.info("GET request");
//        return "Hello!!";
        return storage.getAll();
    }

    @PostMapping("/strings")
    public String addString(@RequestBody String string) {
        LOG.info("POST request");
        LOG.info(string);
        storage.createString(string);
        return "Created";
    }

}
