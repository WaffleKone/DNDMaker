package com.DNDMaker.importer.dto;


public class SpellDTO {

    private String name;
    private String school;

    public SpellDTO() {}

    public String getName() {
        return this.name;
    }

    public String getSchool() {
        return this.school;
    }

    @Override
    public String toString() {
        return "SpellDTO{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}
