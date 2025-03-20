package org.wantsome.layered.web.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BeanController {
    @RequestMapping(method = RequestMethod.GET, values = "/users")
    public String getUsers(){
        return "users";
    }
}
