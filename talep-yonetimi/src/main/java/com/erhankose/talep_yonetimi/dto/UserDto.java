package com.erhankose.talep_yonetimi.dto;

public class UserDto {
    private Long id;
    private String name_surname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName_surname() {
        return name_surname;
    }

    public void setName_surname(String name_surname) {
        this.name_surname = name_surname;
    }
}
