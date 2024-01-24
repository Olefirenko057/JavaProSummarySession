package org.example.lesson17012024;

import java.util.Arrays;
import java.util.Random;

public class SuperHeroBattle {
    public static void main(String[] args) {

         Superhero steve = new Superhero("Steve","I am Steve", 70);
         Superhero leo = new Superhero("Leo",55);
         Superhero john = new Superhero("John",60);
         Superhero alex = new Superhero("Alex",65);
         Superhero randomSuperHero1 = Superhero.generateRandomFighter();
         Superhero randomSuperHero2 = Superhero.generateRandomFighter();
         Superhero randomSuperHero3 = Superhero.generateRandomFighter();
         Superhero randomSuperHero4 = Superhero.generateRandomFighter();

         Superhero[] availableFighters = new Superhero[]{steve,leo,john,alex,randomSuperHero1,randomSuperHero2,randomSuperHero3,randomSuperHero4};
         Superhero[] lostFighters = new Superhero[3];

         Superhero randomOpponent1 = generateOpponent(availableFighters,steve);
         Superhero randomOpponent2 = generateOpponent(availableFighters,leo);
         Superhero randomOpponent3 = generateOpponent(availableFighters,john);

         System.out.println("fight 1");
         System.out.println();
         System.out.println("Before the fight:");
         System.out.println(steve);
         System.out.println(randomOpponent1);
         steve.fight(randomOpponent1);
         System.out.println("After the fight:");
         System.out.println(steve);
         System.out.println(randomOpponent1);
         lostFighters[0] = compareForce(steve,randomOpponent1);

         System.out.println("fight 2");
         System.out.println();
         System.out.println("Before the fight:");
         System.out.println(leo);
         System.out.println(randomOpponent2);
         leo.fight(randomOpponent2);
         System.out.println("After the fight:");
         System.out.println(leo);
         System.out.println(randomOpponent2);
         lostFighters[1] = compareForce(leo,randomOpponent2);

        System.out.println("fight 3");
        System.out.println();
        System.out.println("Before the fight:");
        System.out.println(john);
        System.out.println(randomOpponent3);
        john.fight(randomOpponent3);
        System.out.println("After the fight:");
        System.out.println(john);
        System.out.println(randomOpponent3);
        lostFighters[2] = compareForce(john,randomOpponent3);

        System.out.println();
        System.out.println(Arrays.toString(lostFighters));

        Superhero[] allLostFighters = sortingHeroes(lostFighters);
        System.out.println(Arrays.toString(allLostFighters));

        Superhero[] fightersToHeal = uniqueHeroes(allLostFighters);
        System.out.println(Arrays.toString(fightersToHeal));

        Wizard wizard1 = new Wizard("Nel",7);
        wizard1.introduce();
        wizard1.heal(fightersToHeal);
        System.out.println(Arrays.toString(fightersToHeal));

        Wizard wizard2 = new Wizard("Evil","I can do magic",5);
        wizard2.introduce();
    }
     public static Superhero generateOpponent(Superhero[] superheroes,Superhero superhero) {
          Random random = new Random();
          int index = random.nextInt(superheroes.length);
          if(superheroes[index].getName() != superhero.getName()) {
               return superheroes[index];
          } else if(index != 0){
               index -= 1;
               return superheroes[index];
          } else {
               index += 1;
               return superheroes[index];
          }
     }

     public static Superhero compareForce(Superhero fighter1, Superhero fighter2) {
         double   forceFighter1 = fighter1.getForce() + fighter1.getWeapon().getForce();
         double forceFighter2 = fighter2.getForce() + fighter2.getWeapon().getForce();
         if(forceFighter1 < forceFighter2) {
              return fighter1;
         } else if(forceFighter1 > forceFighter2) {
              return fighter2;
         } else {
              return null;
         }
     }

     public static Superhero[] sortingHeroes(Superhero[] superheroes) {
        Superhero[] notNullHeroes = new Superhero[superheroes.length];
        int count = 0;
        for(Superhero superhero : superheroes) {
            if(superhero != null) {
                notNullHeroes[count++] = superhero;
            }
        }
        return Arrays.copyOf(notNullHeroes,count);
     }

     public static Superhero[] uniqueHeroes(Superhero[] superheroes) {
        int count = 0;
        Superhero[] uniqueSuperheroes = new Superhero[superheroes.length];
        String[] uniqueNames = new String[superheroes.length];
        for (Superhero superhero : superheroes) {
            String superheroName = superhero.getName();
            int existingIndex = findIndexByName(uniqueNames,count,superheroName);
            if(existingIndex == -1) {
                uniqueSuperheroes[count++] = superhero;
                uniqueNames[count - 1] = superheroName;
            }
        }
        return Arrays.copyOf(uniqueSuperheroes,count);
     }

     public static int findIndexByName(String[] names, int count, String targetName) {
        for (int i = 0; i < count; i++) {
            if(names[i] != null && names[i].equals(targetName)) {
                return i;
            }
        }
        return -1;
     }

}
