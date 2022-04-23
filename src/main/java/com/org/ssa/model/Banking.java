package com.org.ssa.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table
@Data

public class Banking implements Serializable {
    @Id
    private int id;
    private String name;
    private String address;
    private String branch;
    private Double exp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Double getExp() {
        return exp;
    }

    public void setExp(Double exp) {
        this.exp = exp;
    }
}
