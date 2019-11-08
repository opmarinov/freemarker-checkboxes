package com.example.demo;

import com.example.demo.dtos.Checkbox;
import com.example.demo.dtos.ChildCheckbox;
import com.example.demo.dtos.Root;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@SpringBootApplication
@Controller
public class DemoApplication {

    @ModelAttribute("root")
    public Root root(){
        Root root = new Root();

        List<Checkbox> checkboxes = new ArrayList<>();

        for(int i = 0; i < 10; i++){

            List<ChildCheckbox> childCheckboxes = new ArrayList<>();

            for(int j = 0; j < 5; j++){
                String childLabel = "child " + j;
                childCheckboxes.add(new ChildCheckbox(childLabel, false));
            }

            String label = "label " + i;
            checkboxes.add(new Checkbox(label,false, childCheckboxes));
        }

        root.setTitle("ROOT");
        root.setCheckboxes(checkboxes);

        return root;
    }

    @PostMapping(value="/add")
    public String add(Root root){


        return "redirect:/";
    }

    @GetMapping
    public String index(){
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
