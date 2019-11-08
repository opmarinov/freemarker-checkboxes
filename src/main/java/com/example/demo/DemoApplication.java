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
    private Root root = new Root();

    @ModelAttribute("root")
    public Root root() {

        root.setTitle("ROOT");
        root.setCheckboxes(getDummyCheckboxes());

        return root;
    }

    @GetMapping
    public String index() {
        return "index";
    }

    @PostMapping(value = "/add")
    public String add(Root root) {

        this.root = root;

        return "redirect:/";
    }

    private List<Checkbox> getDummyCheckboxes() {

        if (this.root.getCheckboxes() == null) {
            List<Checkbox> checkboxes = new ArrayList<>();

            for (int i = 0; i < 10; i++) {

                List<ChildCheckbox> childCheckboxes = new ArrayList<>();

                for (int j = 0; j < 5; j++) {
                    String childLabel = "child " + "[ " + j + " ] ";
                    childCheckboxes.add(new ChildCheckbox(childLabel, false));
                }

                String label = "parent " + "[ " + i + " ] ";
                checkboxes.add(new Checkbox(label, false, childCheckboxes));
            }

            return checkboxes;
        }

        return this.root.getCheckboxes();
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
