package com.liu.web.entity;

import java.util.List;

/**
 * Created by liufengfang on 2020/2/17.
 */
public class Author {
    private String name;
    private Integer age;
    private List<String> skills;

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
