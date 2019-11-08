package com.example.demo.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Root {

    private String title;
    private List<Checkbox> checkboxes;
    private boolean checked;
}
