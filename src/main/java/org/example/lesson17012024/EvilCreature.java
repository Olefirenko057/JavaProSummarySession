package org.example.lesson17012024;

public class EvilCreature {
    private String name;
    private double force;
    private Protection protection;
    private boolean isAngry;
    private double health;

    public EvilCreature(String name,double force, boolean isAngry) {
        this.name = name;
        this.force = force;
        this.protection = Protection.generateRandomProtection();
        this.isAngry = isAngry;
        this.health = 100;
    }

    public void fight(Superhero superheroOpponent) {
        double evilForce = this.force;
        double superHeroForce = superheroOpponent.countForce() + superheroOpponent.getWeapon().getForce();
        double updatedHealth;
        if (isAngry) {
            evilForce *= 2;
            if (evilForce > superHeroForce) {
                System.out.println(this.name + " has won");
                updatedHealth = superheroOpponent.getHealth() - (evilForce - superHeroForce) / superheroOpponent.countProtectionLevel();
                superheroOpponent.setHealth(updatedHealth / 2);
            } else if (evilForce < superHeroForce) {
                System.out.println(superheroOpponent.getName() + " has won the Evil Creature!!!!");
                updatedHealth = this.health - (superHeroForce - evilForce) / this.protection.getLevel();
                this.health = updatedHealth;
            } else {
                System.out.println("There is a draw");
            }
        } else {
            if (evilForce > superHeroForce) {
                System.out.println(this.name + " has won");
                updatedHealth = superheroOpponent.getHealth() - (evilForce - superHeroForce) / superheroOpponent.countProtectionLevel();
                superheroOpponent.setHealth(updatedHealth);
            } else if (evilForce < superHeroForce) {
                System.out.println(superheroOpponent.getName() + " has won the Evil Creature!!!!");
                updatedHealth = this.health - (superHeroForce - evilForce) / this.protection.getLevel();
                this.health = updatedHealth;
            } else {
                System.out.println("There is a draw");
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getForce() {
        return force;
    }

    public void setForce(double force) {
        this.force = force;
    }

    public Protection getProtection() {
        return protection;
    }

    public void setProtection(Protection protection) {
        this.protection = protection;
    }

    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean angry) {
        isAngry = angry;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

}
