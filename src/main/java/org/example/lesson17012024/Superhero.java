package org.example.lesson17012024;

public class Superhero {
    private String name;
    private int health;
    private int force;
    private Weapon weapon;
    private Protection protection;

    public Superhero(String name, int force, Weapon weapon, Protection protection) {
        this.name = name;
        this.health = 100;
        this.force = force;
        this.weapon = weapon;
        this.protection = protection;
    }

    public void fight(Superhero opponent) {
        System.out.println(this.name + " is fighting against " + opponent.getName());


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
