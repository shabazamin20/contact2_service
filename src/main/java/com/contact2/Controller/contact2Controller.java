package com.contact2.Controller;

import com.contact2.Entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contact2")
public class contact2Controller {
    private static final Logger log = LoggerFactory.getLogger(contact2Controller.class);
    @PostMapping("/user/stringTwo")
    public String postString() {        return " world";
    }

    @GetMapping("/user/name")
    @ResponseBody
    public User postName() {
        User user = new User();
        user.setName("shabaz");
        user.setSurname("amin");
        log.info("service 3 main method Called");
        return user;
    }
}
