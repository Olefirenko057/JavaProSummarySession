package org.example.lesson17012024;

public abstract class CombatCharacter extends Character {
    private double health;

    public CombatCharacter(String name) {
        super(name);
        this.health = 100;
    }

    public CombatCharacter(String name, String message) {
        super(name, message);
        this.health = 100;
    }


    public abstract double countForce();
    public abstract int countProtectionLevel();
    public void fight(CombatCharacter another) {
        System.out.println(this.getName() + " is fighting against " + another.getName());
        double myForce = countForce();
        double anotherForce = another.countForce();
        if(myForce < anotherForce) {
            System.out.println(another.getName() + " has won the fight");
            System.out.println(another.getName() + " force - " + anotherForce + " : " + this.getName() + " force - " + myForce);
            this.health = this.health - (anotherForce - myForce) / countProtectionLevel();
        } else if(myForce > anotherForce) {
            System.out.println(this.getName() + " has won the fight");
            System.out.println(this.getName() + " force - " + myForce + " : " + another.getName() + " force - " + anotherForce);
            another.health = another.health - (myForce - anotherForce) / another.countProtectionLevel();
        } else {
            System.out.println("There is a draw");
        }

    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }
}
