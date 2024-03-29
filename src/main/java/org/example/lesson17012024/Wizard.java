package org.example.lesson17012024;

public class Wizard extends Character implements HealingSkills,ReinforcementSkills{
    private int level;

    public Wizard(String name,int level) {
        super(name);
        this.level = level;
    }

    public Wizard(String name, String message,int level) {
        super(name, message);
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

    public int getLevel() {
        return level;
    }
}
