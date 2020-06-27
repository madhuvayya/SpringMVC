package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("")
@Controller
public class controller {

    @RequestMapping(method = RequestMethod.GET)
    public String print(ModelMap model){
        model.addAttribute("message","spring mvc frameork");
        return "hello";
    }
}
