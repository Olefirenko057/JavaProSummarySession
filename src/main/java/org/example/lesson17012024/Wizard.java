package org.example.lesson17012024;

public class Wizard extends Character{
    private int level;

    public Wizard(String name,int level) {
        super(name);
        this.level = level;
    }

    public Wizard(String name, String message,int level) {
        super(name, message);
        this.level = level;
    }


    public void heal(Superhero hero) {
        if(hero.getHealth() < 100) {
            hero.setHealth(100);
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
        double force = hero.getForce();
        force = force + force * 0.1 * this.level;
        hero.setForce(force);
    }
    public void increaseForce(Superhero[] superheroes) {
        for (Superhero superhero : superheroes) {
            increaseForce(superhero);
        }
    }

}
