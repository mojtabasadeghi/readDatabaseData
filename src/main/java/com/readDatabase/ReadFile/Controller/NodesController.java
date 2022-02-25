package com.readDatabase.ReadFile.Controller;

import com.readDatabase.ReadFile.Model.DataFromDatabase;
import com.readDatabase.ReadFile.Model.Node;
import com.readDatabase.ReadFile.Service.BooleanNodeService;
import com.readDatabase.ReadFile.Service.DataFromDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("nodes")
public class NodesController {

    BooleanNodeService booleanNodeService;
    DataFromDatabaseService dataFromDatabaseService;

    @Autowired
    public NodesController(BooleanNodeService booleanNodeService, DataFromDatabaseService dataFromDatabaseService) {
        this.booleanNodeService = booleanNodeService;
        this.dataFromDatabaseService = dataFromDatabaseService;
    }

    @GetMapping
    public List<Node> nodes() {
        return booleanNodeService.getSampleNodeList();
    }


    @GetMapping("/all")
    public List<DataFromDatabase> all() {
        return dataFromDatabaseService.getAllData();
    }

//    @GetMapping("/cnames")
//    public List<Node> allcname() {
//        return booleanNodeService.generateTree();
//    }
}
