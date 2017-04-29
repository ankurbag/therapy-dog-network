package com.tdn.therapydog.DummyContent;

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
        dogList.add(dog);

        return dogList;

    }
}
