package com.readDatabase.ReadFile.Controller;

import com.readDatabase.ReadFile.Model.SearchContext;
import com.readDatabase.ReadFile.Service.BooleanNodeService;
import com.readDatabase.ReadFile.Service.DataFromDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class MainController {


    private final DataFromDatabaseService dataFromDatabaseService;

    @Autowired
    public MainController( DataFromDatabaseService dataFromDatabaseService) {
        this.dataFromDatabaseService = dataFromDatabaseService;
    }

    @GetMapping
    public String getHomePage() {
        return "home";
    }
    @GetMapping("/search")
    public String redirectHomePage() {
        return "redirect:/";
    }

    @PostMapping("/search")
    public String getSearchResult(Model model, SearchContext searchContext) {
        model.addAttribute("datalist", dataFromDatabaseService.getSearchResult(searchContext.getSearchTxt()));
        return "home";
    }




}


