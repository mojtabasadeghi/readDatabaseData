package com.readDatabase.ReadFile.Service;

import com.readDatabase.ReadFile.Mapper.DataFromDatabaseMapper;
import com.readDatabase.ReadFile.Model.DataFromDatabase;
import com.readDatabase.ReadFile.Model.Node;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Service
public class BooleanNodeService {

    private final DataFromDatabaseMapper dataFromDatabaseMapper;

    public BooleanNodeService(DataFromDatabaseMapper dataFromDatabaseMapper)
    {
        this.dataFromDatabaseMapper=dataFromDatabaseMapper;
    }

    public List<Node> getSampleNodeList() {
//        List<Node> nodes = new ArrayList<>();
//        nodes.add(new Node("Root", "0", "#", "http://frontbackend.com/"));
//        nodes.add(new Node("1", "Root", "AFGHANISTAN", ""));
//        nodes.add(new Node("2", "1", "Bagram AB", ""));
//        nodes.add(new Node("3", "1", "Kandahar Airfield", ""));
//        nodes.add(new Node("4", "1", "Mazar-e-Sharif", ""));
//        nodes.add(new Node("5", "1", "Gardez", ""));
//        nodes.add(new Node("6", "1", "Kabul", ""));
//        nodes.add(new Node("7", "1", "Herat", ""));
//        nodes.add(new Node("8", "1", "Shindand", ""));
//        nodes.add(new Node("9", "1", "Sharab", ""));
//        nodes.add(new Node("10", "1", "Jalalabad", ""));
//        nodes.add(new Node("11", "Root", "ALBANIA", ""));
//        nodes.add(new Node("12", "Root", "ALGERIA", ""));
//        nodes.add(new Node("13", "Root", "AMERICAN SAMOA", ""));
//        nodes.add(new Node("14", "13", "American Samoa", ""));

        return generateTree();
    }

    private List<Node> generateTree()
    {
        List<Node> nodes = new ArrayList<>();
        nodes.add(new Node("Root", "0", "#", ""));
        List<String> counryNames=dataFromDatabaseMapper.getAllCountryNames();
        counryNames.forEach(e->{
            List<DataFromDatabase> dataFromDatabases= dataFromDatabaseMapper.getAlldataByCountryName(e);
            String uniqueID = UUID.randomUUID().toString();
            nodes.add(new Node(uniqueID, "Root", e, ""));
            dataFromDatabases.forEach(element-> nodes.add(new Node(element.getDataId().toString(), uniqueID, element.getBaseName(), "")));

        });

        return nodes;
    }

}
