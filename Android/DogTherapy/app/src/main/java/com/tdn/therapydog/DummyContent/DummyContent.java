package com.tdn.therapydog.dummycontent;

import com.tdn.therapydog.model.Dog;
import com.tdn.therapydog.model.Location;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sabri on 4/29/2017.
 */
public class DummyContent {



    public static List<Dog> getDogList(){

        List<Dog> dogList = new ArrayList<>();


        Location location = new Location(42.36159, -71.0719);
        Dog dog = new Dog("Chloe", 2, "Chow chow", "I am 2 year old. I like to jump a lot.", "Male", "Light Brown", location);
        dog.setImage("chow_chow.jpg");
        dogList.add(dog);

        location = new Location(42.37326, -71.0757);
        dog = new Dog("Mia", 3, "French bulldog", "I am Mia! 3 year old and  I like to play with soft toys.", "Female", "Black", location);
        dog.setImage("French_Bulldog.jpg");
        dogList.add(dog);

        location = new Location(42.346719, -71.031325);
        dog = new Dog("Cody", 1, "German Shepard", "I am 1 year old. I love playing with ball.", "Female", "Black", location);
        dog.setImage("germanShepard.jpg");
        dogList.add(dog);

        location = new Location(42.34598, -71.0321);
        dog = new Dog("Sophie", 2, "Pug", "I am good with kids. 2 years old. Love jumping.", "Male", "White", location);
        dog.setImage("pug.jpg");
        dogList.add(dog);

        location = new Location(42.34614, -71.0296);
        dog = new Dog("Max", 4, "Siberian Husky", "Max here.I am 4 year old. My favourite color is blue.", "Male", "Black", location);
        dog.setImage("Siberian_Husky.jpg");
        dogList.add(dog);

        location = new Location(42.34493, -71.0295);
        dog = new Dog("Shelby", 1, "Labrador", "Hi there! My name is Shelby and I'm an adorable 1 year old female Labrador.", "Female", "Peach", location);
        dog.setImage("labrador.jpg");
        dogList.add(dog);

        location = new Location(42.34441, -71.0285);
        dog = new Dog("Arwen", 1, "Chihuahua", "Hey there, I am pretty calm dog. 1 year old and love an evening walk.", "Male", "Brown", location);
        dog.setImage("chihuahua.jpg");
        dogList.add(dog);

        location = new Location(42.34618, -71.0275);
        dog = new Dog("Riley", 2, "Golden doodle", "I am 2 year old. My master call me RILEY. charming and amiable.", "Male", "Brown", location);
        dog.setImage("goldenDoodle.jpg");
        dogList.add(dog);

        location = new Location(42.34614, -71.0296);
        dog = new Dog("Luke", 2, "Poodle", "Luke is my name.2 years female and very proud to say - can make a 'memory' for life.", "Female", "Black", location);
        dog.setImage("poodle.jpg");
        dogList.add(dog);

        location = new Location(42.37326, -71.0757);
        dog = new Dog("Teller", 2, "Terrier", "Lovable,amiable and very cheering.2 years old, and look to cheer up anybody around.", "Female", "White", location);
        dog.setImage("Terrier.jpg");
        dogList.add(dog);

        location = new Location(42.36159, -71.0719);
        dog = new Dog("Joe", 2, "Chow chow", "I am 2 year old. I like to jump a lot.", "Male", "White", location);
        dog.setImage("chow_chow_white.jpg");
        dogList.add(dog);

        location = new Location(42.37326, -71.0757);
        dog = new Dog("Sia", 3, "French bulldog", "I am Mia! 3 year old and  I like to play with soft toys.", "Female", "Grey", location);
        dog.setImage("French_Bulldog_Grey.jpg");
        dogList.add(dog);

        location = new Location(42.346719, -71.031325);
        dog = new Dog("Zeeba", 1, "German Shepard", "I am 1 year old. I love playing with ball.", "Female", "Black", location);
        dog.setImage("germanShepard.jpg");
        dogList.add(dog);

        location = new Location(42.34598, -71.0321);
        dog = new Dog("Daisy", 2, "Pug", "I am good with kids. 2 years old. Love jumping.", "Male", "White", location);
        dog.setImage("pug.jpg");
        dogList.add(dog);

        location = new Location(42.34614, -71.0296);
        dog = new Dog("Tanner", 4, "Siberian Husky", "Max here.I am 4 year old. My favourite color is blue.", "Male", "White", location);
        dog.setImage("SiberianHuskyWhite.jpg");
        dogList.add(dog);

        location = new Location(42.34493, -71.0295);
        dog = new Dog("Tia", 1, "Labrador", "Hi there! My name is Shelby and I'm an adorable 1 year old female Labrador.", "Female", "Brown", location);
        dog.setImage("labradorBrown.jpg");
        dogList.add(dog);

        location = new Location(42.34441, -71.0285);
        dog = new Dog("Lexi", 1, "Chihuahua", "Hey there, I am pretty calm dog. 1 year old and love an evening walk.", "Male", "Black", location);
        dog.setImage("ChihuahuaBlack.JPG");
        dogList.add(dog);

        location = new Location(42.34618, -71.0275);
        dog = new Dog("Charlie", 2, "Golden doodle", "I am 2 year old. My master call me RILEY. charming and amiable.", "Male", "Brown", location);
        dog.setImage("goldenDoodle.jpg");
        dogList.add(dog);

        location = new Location(42.34614, -71.0296);
        dog = new Dog("Ruby", 2, "Poodle", "Luke is my name.2 years female and very proud to say - can make a 'memory' for life.", "Female", "White", location);
        dog.setImage("poodleWhite.jpg");
        dogList.add(dog);

        location = new Location(42.37326, -71.0757);
        dog = new Dog("Kayla", 2, "Terrier", "Lovable,amiable and very cheering.2 years old, and look to cheer up anybody around.", "Female", "Black", location);
        dog.setImage("TerrierBlack.jpg");
        dogList.add(dog);


        /*Location location = new Location(42.36159, -71.0719);
        Dog dog = new Dog("Chloe", 2, "Chow Chow","", location);
        dogList.add(dog);

        location = new Location(42.37326, -71.0757);
        dog = new Dog("Mia", 2, "French bulldog","", location);
        dogList.add(dog);

        location = new Location(42.346719, -71.031325);
        dog = new Dog("Cody", 2, "German Shepard","", location);
        dogList.add(dog);

        location = new Location(42.34598, -71.0321);
        dog = new Dog("Sophie", 2, "Pug","", location);
        dogList.add(dog);*/

        return dogList;

    }
}
