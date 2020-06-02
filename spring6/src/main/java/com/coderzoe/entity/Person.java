package com.coderzoe.entity;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author yhs
 * @date 2020/5/31 17:04
 * @description
 */
public class Person {
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;
    private String name;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
