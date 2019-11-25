package com.liu.annotation;

/**
 * Created by liufengfang on 2019/11/25.
 */
public class Person {
    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    @Range(min = 1, max = 20)
    public String name;

    @Range(max = 10)
    public String city;

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", city=" + city + '}';
    }
}
