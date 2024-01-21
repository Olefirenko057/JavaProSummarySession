package org.example.lesson17012024;

import java.util.Random;

public class Weapon {
    private String name;
    private int force;
    private static Weapon[] availableWeapons;

    static {
        Weapon weapon1 = new Weapon("Gun",15);
        Weapon weapon2 = new Weapon("Sword",10);
        Weapon weapon3 = new Weapon("Canon",25);
        availableWeapons = new Weapon[]{weapon1,weapon2,weapon3};
    }

    public Weapon(String name, int force) {
        this.name = name;
        this.force = force;
    }

    public static Weapon generateRandomWeapon() {
        Random random = new Random();
        int r = random.nextInt(availableWeapons.length);
        return availableWeapons[r];

    }

    public String getName() {
        return name;
    }

    public int getForce() {
        return force;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setForce(int force) {
        this.force = force;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", force=" + force +
                '}';
    }
}
