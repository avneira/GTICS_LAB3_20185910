package com.example.demo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    @ResponseBody
    public String paginaPrincipal(){
        return " fibra campeon sdi 2023 :) ";
    }
}
