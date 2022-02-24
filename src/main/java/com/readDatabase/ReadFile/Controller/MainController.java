package com.readDatabase.ReadFile.Controller;

import com.readDatabase.ReadFile.Service.BooleanNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class MainController {

    private final BooleanNodeService booleanNodeService;

    @Autowired
    public MainController (BooleanNodeService booleanNodeService)
    {
        this.booleanNodeService=booleanNodeService;
    }

    @GetMapping
    public String getHomePage(Model model) {
        model.addAttribute("data",booleanNodeService.getSampleNodeList());
        return "home";
    }
}


