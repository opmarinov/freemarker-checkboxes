package com.example.demo.dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Checkbox {

    private String label;
    private boolean checked;
    private List<ChildCheckbox> childCheckboxes;
}
