package org.example.lesson17012024;

import java.util.Random;

public class Superhero extends CombatCharacter {
    private double force;
    private Weapon weapon;
    private Protection protection;
//    private static Superhero[] superheroes;

    public Superhero(String name,double force) {
        super(name);
        this.force = force;
        this.weapon = Weapon.generateRandomWeapon();
        this.protection = Protection.generateRandomProtection();
    }

    public Superhero(String name, String message,double force) {
        super(name, message);
        this.force = force;
        this.weapon = Weapon.generateRandomWeapon();
        this.protection = Protection.generateRandomProtection();
    }

//    public Superhero(String name,double force) {
//        super(name);
//        this.health = 100;
//        this.force = force;
//        this.weapon = Weapon.generateRandomWeapon();
//        this.protection = Protection.generateRandomProtection();
//
//    }
//    public Superhero(String name, String message, double force) {
//        super(name, message);
//        this.health = 100;
//        this.force = force;
//        this.weapon = Weapon.generateRandomWeapon();
//        this.protection = Protection.generateRandomProtection();
//    }

    @Override
    public double countForce() {
         return this.force + this.weapon.getForce();
    }

    @Override
    public int countProtectionLevel() {
        return getProtection().getLevel();
    }

//    public void fight(Superhero opponent) {
//        System.out.println(this.getName() + " is fighting against " + opponent.getName());
//        double myForce = this.force + this.weapon.getForce();
//        double opponentForce = opponent.force + opponent.weapon.getForce();
//        if(myForce < opponentForce) {
//            System.out.println(opponent.getName() + " has won the fight");
//            System.out.println(opponent.getName() + " force - " + opponentForce + " : " + this.getName() + " force - " + myForce);
//            this.health = this.health - (opponentForce - myForce) / this.protection.getLevel();
//        } else if(myForce > opponentForce) {
//            System.out.println(this.getName() + " has won the fight");
//            System.out.println(this.getName() + " force - " + myForce + " : " + opponent.getName() + " force - " + opponentForce);
//            opponent.health = opponent.health - (myForce - opponentForce) / opponent.protection.getLevel();
//        } else {
//            System.out.println("There is a draw");
//        }
//    }

    public static Superhero generateRandomFighter() {
         String[] names = new String[]{"Robot","Ninja","Zombie","Mummy","Boxer","Spider-man","Batman"};
         Random random = new Random();
         return new Superhero(names[random.nextInt(names.length)],random.nextInt(100));
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
                "name='" + this.getName() + '\'' +
                ", health=" + this.getHealth() +
                ", force=" + force +
                ", weapon=" + weapon +
                ", protection=" + protection +
                '}';
    }

}
