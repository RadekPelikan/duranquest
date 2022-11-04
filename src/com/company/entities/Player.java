package com.company.entities;

import com.company.items.Food;
import com.company.items.Potion;
import com.company.map.GameLocation;

public class Player implements Entity{

    private final String name = "Tomáš Ďurán";
    private Race race;

    @Override
    public void fight() {

    }

    @Override
    public void defend() {

    }

    @Override
    public void dodge() {

    }

    @Override
    public void escape() {

    }

    @Override
    public void heal(Potion potion) {

    }

    @Override
    public void eat(Food food) {

    }

    @Override
    public void moveTo(GameLocation gameLocation) {

    }

    @Override
    public void talkTo(Entity entity) {

    }

    @Override
    public void sleep() {

    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }
}
