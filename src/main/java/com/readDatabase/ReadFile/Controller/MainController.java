package com.readDatabase.ReadFile.Controller;

import com.readDatabase.ReadFile.Model.DataFromDatabase;
import com.readDatabase.ReadFile.Model.SearchContext;
import com.readDatabase.ReadFile.Service.DataFromDatabaseService;
import com.readDatabase.ReadFile.Service.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
@RequestMapping({"/", "home"})
public class MainController {

    Logger log = LoggerFactory.getLogger(MainController.class);
    private final DataFromDatabaseService dataFromDatabaseService;

    @Autowired
    public MainController(DataFromDatabaseService dataFromDatabaseService) {
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

    @PostMapping("/database")
    public String insert(DataFromDatabase dataFromHome, RedirectAttributes redirectAttributes) {
        try {
            if (Integer.parseInt(dataFromHome.getDataInsOrUpd()) > 0) {
                dataFromDatabaseService.updateDataSource(dataFromHome);
                redirectAttributes.addFlashAttribute("noteMsgShowOrNotShow", true);
                redirectAttributes.addFlashAttribute("classMessage", MessageService.getClassSuccessType());
                redirectAttributes.addFlashAttribute("textMessage", MessageService.getEditSuccessMessage(dataFromHome.getCountryName(), dataFromHome.getBaseName()));
                return "redirect:/home";
            } else {
                dataFromDatabaseService.insertData(dataFromHome);
                redirectAttributes.addFlashAttribute("noteMsgShowOrNotShow", true);
                redirectAttributes.addFlashAttribute("classMessage", MessageService.getClassSuccessType());
                redirectAttributes.addFlashAttribute("textMessage", MessageService.getInsertSuccessMessage(dataFromHome.getCountryName(), dataFromHome.getBaseName()));
                return "redirect:/home";
            }
        } catch (Exception e) {
            log.error(e.getMessage());
            redirectAttributes.addFlashAttribute("noteMsgShowOrNotShow", true);
            redirectAttributes.addFlashAttribute("classMessage", MessageService.getClassErrorType());
            redirectAttributes.addFlashAttribute("textMessage", MessageService.getErrorMessage());
            return "redirect:/home";
        }

    }


    @GetMapping("/delete/{id}")
    public String deleteNote(@PathVariable int id, RedirectAttributes redirectAttributes) {

        DataFromDatabase dataFromDatabase = dataFromDatabaseService.getDataById(id);
        redirectAttributes.addFlashAttribute("noteMsgShowOrNotShow", true);
        redirectAttributes.addFlashAttribute("classMessage", MessageService.getClassSuccessType());
        redirectAttributes.addFlashAttribute("textMessage", MessageService.getDeleteSuccessMessage(dataFromDatabase.getCountryName(), dataFromDatabase.getBaseName()));
        dataFromDatabaseService.deleteById(id);
        return "redirect:/home";
    }

    @ModelAttribute("dataFromHome")
    public DataFromDatabase setDataFromHomeDefult() {
        return new DataFromDatabase();
    }

    @ModelAttribute("datalist")
    public List<DataFromDatabase> alldata() {
        return dataFromDatabaseService.getAllData();
    }
}


