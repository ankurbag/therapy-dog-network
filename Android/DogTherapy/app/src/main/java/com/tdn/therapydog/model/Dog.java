package com.tdn.therapydog.model;

/**
 * Created by sabri on 4/29/2017.
 */
public class Dog {


    private String name;
    private int age;
    private String breed;
    private String description;
    private String gender;
    private String color;
    private Location location;

    private String image;

    public Dog(String name, int age, String breed, String description, String gender, String color, Location location) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.description = description;
        this.gender = gender;
        this.color = color;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
