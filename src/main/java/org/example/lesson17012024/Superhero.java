package org.example.lesson17012024;

import java.util.Random;

public class Superhero implements Introduceable {
    private String name;
    private double health;
    private double force;
    private Weapon weapon;
    private Protection protection;
    private static Superhero[] superheroes;

    public Superhero(String name, int force) {
        this.name = name;
        this.health = 100;
        this.force = force;
        this.weapon = Weapon.generateRandomWeapon();
        this.protection = Protection.generateRandomProtection();
    }

    public void fight(Superhero opponent) {
        System.out.println(name + " is fighting against " + opponent.getName());
        double myForce = this.force + this.weapon.getForce();
        double opponentForce = opponent.force + opponent.weapon.getForce();
        if(myForce < opponentForce) {
            System.out.println(opponent.name + " has won the fight");
            System.out.println(opponent.name + " force - " + opponentForce + " : " + this.name + " force - " + myForce);
            this.health = this.health - (opponentForce - myForce) / this.protection.getLevel();
        } else if(myForce > opponentForce) {
            System.out.println(this.name + " has won the fight");
            System.out.println(this.name + " force - " + myForce + " : " + opponent.name + " force - " + opponentForce);
            opponent.health = opponent.health - (myForce - opponentForce) / opponent.protection.getLevel();
        } else {
            System.out.println("There is a draw");
        }
    }

    public static Superhero generateRandomFighter() {
         String[] names = new String[]{"Robot","Ninja","Zombie","Mummy","Boxer","Spider-man","Batman"};
         Random random = new Random();
         return new Superhero(names[random.nextInt(names.length)],random.nextInt(100));
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public double getForce() {
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

    public void setHealth(double health) {
        this.health = health;
    }

    public void setForce(double force) {
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

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + this.name + "!");
    }
}
