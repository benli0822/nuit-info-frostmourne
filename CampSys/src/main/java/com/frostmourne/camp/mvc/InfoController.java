package com.frostmourne.camp.mvc;

import com.frostmourne.camp.domain.InformationType;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by JIN Benli on 04/12/14.
 */
@Controller
public class InfoController {
    private Logger log = Logger.getLogger(InfoController.class);

    @RequestMapping(value = "/find")
    public String info(Model model) {
        log.info("[InfoController: info], listing info find family");
        model.addAttribute("title", "Finding your family!");
        return "view/info";
    }

    @RequestMapping(value = "/vaccine")
    public String vaccine(Model model) {
        log.info("[InfoController: info], listing info Vaccine");
        model.addAttribute("title", "Vaccines");
        return "view/info";
    }

    @RequestMapping(value = "/security")
    public String security(Model model) {
        log.info("[InfoController: info], listing info security");
        model.addAttribute("title", "Security");
        return "view/info";
    }

    @RequestMapping(value = "/all")
    public String all(Model model) {
        log.info("[InfoController: info], listing info all");
        model.addAttribute("title", "All");
        return "view/info";
    }

    @RequestMapping(value = "/infopost")
    public String post(Model model) {
        log.info("[InfoController: info], listing info all");
        model.addAttribute("title", "All");
        List<InformationType> allType = new ArrayList<InformationType>(Arrays.asList(InformationType.values()));
        model.addAttribute("allType", allType);
        log.info(model);
        return "view/post";
    }

}
