package com.frostmourne.camp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by JIN Benli on 04/12/14.
 */
@Controller
public class InfoController {
    @RequestMapping(value = "/info")
    public String home() {
        return "view/info";
    }
}