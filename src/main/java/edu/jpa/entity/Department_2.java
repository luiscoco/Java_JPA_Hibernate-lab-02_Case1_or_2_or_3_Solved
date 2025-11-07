package edu.jpa.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Department_2 {
    private DepartmentKey id;
    private String description;

    @EmbeddedId
    public DepartmentKey getId() {
        return id;
    }

    public void setId(DepartmentKey id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
