package org.example.lesson17012024;

public class Wizard implements Introduceable {
    private String name;
    private int level;

    public Wizard(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void heal(Superhero hero) {
        int maxHealth = 100;
        if(hero.getHealth() < maxHealth) {
            hero.setHealth(maxHealth - hero.getHealth() + hero.getHealth());
            System.out.println(hero.getName() + " has been healed!");
        } else {
            System.out.println(hero.getName() + " doesn't need any treatment");
        }
    }
    public void heal(Superhero[] heroes) {
        for (Superhero hero : heroes) {
            heal(hero);
        }
    }
    public void increaseForce(Superhero hero) {
        hero.setForce(hero.getForce() + hero.getForce() * 0.1 * this.level);
    }
    public void increaseForce(Superhero[] superheroes) {
        for (Superhero superhero : superheroes) {
            increaseForce(superhero);
        }
    }

    @Override
    public void introduce() {

    }
}
