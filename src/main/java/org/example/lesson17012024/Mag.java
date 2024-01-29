package org.example.lesson17012024;

public class Mag extends EvilCreature implements HealingSkills,ReinforcementSkills,Spells{
    private int level;

    public Mag(String name, int protectionLevel, double force, boolean isAngry, int level) {
        super(name, protectionLevel, force, isAngry);
        this.level = level;
    }

    public Mag(String name, String message, int protectionLevel, double force, boolean isAngry, int level) {
        super(name, message, protectionLevel, force, isAngry);
        this.level = level;
    }

    @Override
    public void heal(CombatCharacter hero) {
        if(hero.getHealth() < 100) {
            hero.setHealth(100);
            System.out.println(hero.getName() + " has been healed!");
        } else {
            System.out.println(hero.getName() + " doesn't need any treatment");
        }
    }

    @Override
    public void heal(CombatCharacter[] heroes) {
        for (CombatCharacter hero : heroes) {
            heal(hero);
        }
    }

    @Override
    public void increaseForce(Superhero hero) {
        double force = hero.getForce();
        force = force + force * 0.1 * this.level;
        hero.setForce(force);
    }

    @Override
    public void increaseForce(Superhero[] superheroes) {
        for (Superhero superhero : superheroes) {
            increaseForce(superhero);
        }
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void curse(Superhero hero) {
        System.out.println(this.getName() + " has cursed " + hero.getName());
        System.out.println(hero.getName() + " health before curse - " + hero.getHealth());
        double updatedHealth = hero.getHealth() - 0.1 * this.level * hero.getHealth();
        hero.setHealth(updatedHealth);
        System.out.println(hero.getName() + " health after curse - " + hero.getHealth());
    }
}
