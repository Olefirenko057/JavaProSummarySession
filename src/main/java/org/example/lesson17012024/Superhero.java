package org.example.lesson17012024;

import java.util.Random;

public class Superhero {
    private String name;
    private int health;
    private int force;
    private Weapon weapon;
    private Protection protection;
    private static Superhero[] superheroes;

    static {
        Superhero superhero1 = new Superhero("Predator", 100);
        Superhero superhero2 = new Superhero("Spider-man",75);
        Superhero superhero3 = new Superhero("SimpleFighter",60);
        Superhero superhero4 = new Superhero("Deadpool",80);
        Superhero superhero5 = new Superhero("Dracula",90);
        superheroes = new Superhero[]{superhero1,superhero2,superhero3,superhero4,superhero5};
    }

    public Superhero(String name, int force) {
        this.name = name;
        this.health = 100;
        this.force = force;
        this.weapon = Weapon.generateRandomWeapon();
        this.protection = Protection.generateRandomProtection();
    }

    public static void generateFightersAndStartFight() {
        Random random = new Random();
        int r = random.nextInt(superheroes.length);
        Superhero fighter1 = superheroes[r];
        int r2 = random.nextInt(superheroes.length);
        Superhero fighter2;
        if(r != r2) {
            fighter2 = superheroes[r2];
        } else {
            if(r2 != 5) {
               fighter2 = superheroes[r2 + 1];
            } else {
                fighter2 = superheroes[r2 - 1];
            }
        }
        fight(fighter1,fighter2);
    }

    public static void fight(Superhero fighter1, Superhero fighter2) {
        System.out.println("The fight between " + fighter1.name + " and " + fighter2.name);
        System.out.println("Let's see their characteristics: ");
        System.out.println(fighter1);
        System.out.println(fighter2);
        System.out.println("The fight has started");
        int force1 = fighter1.getForce() + fighter1.getWeapon().getForce();
        int force2 = fighter2.getForce() + fighter2.getWeapon().getForce();
        if(force1 > force2) {
            System.out.println(fighter1.name + " has won the fight!");
            fighter2.setHealth(fighter2.health - (force1 - force2) / fighter2.getProtection().getLevel());
        } else if (force1 < force2) {
            System.out.println(fighter2.name + " has won the fight");
            fighter1.setHealth(fighter1.health - (force2 - force1) / fighter1.getProtection().getLevel());
        } else {
            System.out.println("There is draw!");
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getForce() {
        return force;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Protection getProtection() {
        return protection;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setForce(int force) {
        if(force < 0) throw new RuntimeException("Force can't be less than 0");
        this.force = force;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setProtection(Protection protection) {
        this.protection = protection;
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", force=" + force +
                ", weapon=" + weapon +
                ", protection=" + protection +
                '}';
    }
}
