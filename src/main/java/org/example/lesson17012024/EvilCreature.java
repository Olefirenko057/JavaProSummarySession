package org.example.lesson17012024;

public class EvilCreature extends CombatCharacter {
    private int protectionLevel;
    private double force;
    private boolean isAngry;

    public EvilCreature(String name, int protectionLevel, double force, boolean isAngry) {
        super(name);
        this.protectionLevel = protectionLevel;
        this.force = force;
        this.isAngry = isAngry;
    }

    public EvilCreature(String name, String message, int protectionLevel, double force, boolean isAngry) {
        super(name, message);
        this.protectionLevel = protectionLevel;
        this.force = force;
        this.isAngry = isAngry;
    }

    @Override
    public double countForce() {
        return (isAngry) ? (force * 2) : force ;
    }

    @Override
    public int countProtectionLevel() {
        return protectionLevel;
    }
}
