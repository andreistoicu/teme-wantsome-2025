package org.wantsome.layered.web.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BeanController {
    @GetMapping("/users")
    public String getUsers() {
        return "users";
    }
    }

