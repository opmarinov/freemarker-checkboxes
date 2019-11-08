package com.example.demo.dtos;


import java.util.List;

public class Checkbox {

    private String label;
    private boolean checked;
    private List<ChildCheckbox> childCheckboxes;

    public Checkbox(String label, boolean checked, List<ChildCheckbox> childCheckboxes) {
        this.label = label;
        this.checked = checked;
        this.childCheckboxes = childCheckboxes;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<ChildCheckbox> getChildCheckboxes() {
        return childCheckboxes;
    }

    public void setChildCheckboxes(List<ChildCheckbox> childCheckboxes) {
        this.childCheckboxes = childCheckboxes;
    }
}
