package com.frostmourne.camp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jamesRMBP on 05/12/14.
 */
@Controller
public class SOSController {

    @RequestMapping(value = "/sos")
    public String home() {
        return "view/sos";
    }

}
