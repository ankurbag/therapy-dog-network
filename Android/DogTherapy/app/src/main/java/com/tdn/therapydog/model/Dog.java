package com.tdn.therapydog.model;

/**
 * Created by sabri on 4/29/2017.
 */
public class Dog {


    private String name;
    private int age;
    private String breed;
    private String description;
    private Location location;

    public Dog(String name, int age, String breed, String description, Location location) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.description = description;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
