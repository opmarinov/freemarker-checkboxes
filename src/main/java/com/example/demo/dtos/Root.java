package com.example.demo.dtos;

import lombok.Data;
import java.util.List;

@Data
public class Root {

    private String title;
    private List<Checkbox> checkboxes;
    private boolean checked;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Checkbox> getCheckboxes() {
        return checkboxes;
    }

    public void setCheckboxes(List<Checkbox> checkboxes) {
        this.checkboxes = checkboxes;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

}
