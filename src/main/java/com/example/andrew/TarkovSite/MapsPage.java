package com.example.andrew.TarkovSite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MapsPage {




    @RequestMapping("/maps")
    public String getMaps(){
        return "maps.html";
    }
}
