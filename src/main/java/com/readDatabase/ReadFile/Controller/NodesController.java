package com.readDatabase.ReadFile.Controller;

import com.readDatabase.ReadFile.Model.Node;
import com.readDatabase.ReadFile.Service.BooleanNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("nodes")
public class NodesController {

    BooleanNodeService booleanNodeService;

    @Autowired
    public NodesController(BooleanNodeService booleanNodeService)
    {
        this.booleanNodeService=booleanNodeService;
    }
    @GetMapping
    public List<Node> nodes() {
        return booleanNodeService.getSampleNodeList();
    }
}
