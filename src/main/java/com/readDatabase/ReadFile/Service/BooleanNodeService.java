package com.readDatabase.ReadFile.Service;

import com.readDatabase.ReadFile.Model.Node;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BooleanNodeService {
    public List<Node> getSampleNodeList() {
        List<Node> nodes = new ArrayList<>();
        nodes.add(new Node("Root", "0", "Root", "http://frontbackend.com/"));
        nodes.add(new Node("Child1", "Root", "Child1", "http://frontbackend.com/child1"));
        nodes.add(new Node("Child2", "Root", "Child2", "http://frontbackend.com/child2"));
        nodes.add(new Node("Child3", "Root", "Child3", "http://frontbackend.com/child3"));
        nodes.add(new Node("Child3.1", "Child3", "Child3.1", "http://frontbackend.com/child3/child1"));
        nodes.add(new Node("Child3.2", "Child3", "Child3.2", "http://frontbackend.com/child3/child2"));
        nodes.add(new Node("Child4", "Root", "Child4", "http://frontbackend.com/child4"));
        return nodes;
    }
}
