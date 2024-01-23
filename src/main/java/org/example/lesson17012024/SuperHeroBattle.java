package org.example.lesson17012024;

public class SuperHeroBattle {
    public static void main(String[] args) {

         Superhero steve = new Superhero("Steve", 70);
         Superhero leo = new Superhero("Leo",55);
         Superhero john = new Superhero("John",60);
         Superhero alex = new Superhero("Alex",65);
         Superhero randomSuperHero1 = Superhero.generateRandomFighter();
         Superhero randomSuperHero2 = Superhero.generateRandomFighter();
         Superhero randomSuperHero3 = Superhero.generateRandomFighter();
         Superhero randomSuperHero4 = Superhero.generateRandomFighter();

         Superhero[] availableFighters = new Superhero[]{steve,leo,john,alex,randomSuperHero1,randomSuperHero2,randomSuperHero3,randomSuperHero4};
         steve.fight(steve.generateOpponent(availableFighters));
         leo.fight(leo.generateOpponent(availableFighters));
         john.fight(john.generateOpponent(availableFighters));




//
//
//         System.out.println("Before the fight:");
//         System.out.println(steve);
//         System.out.println(leo);
//
//         System.out.println();
//
//         steve.fight(leo);
//
//         System.out.println();
//
//         System.out.println("After the fight:");
//         System.out.println(steve);
//         System.out.println(leo);
//
//         System.out.println();
//
//
//         Superhero randomFighter = Superhero.generateRandomFighter();
//         System.out.println("Before the fight");
//         System.out.println(steve);
//         System.out.println(randomFighter);
//
//         System.out.println();
//
//         steve.fight(randomFighter);
//
//         System.out.println("After the fight");
//         System.out.println(steve);
//         System.out.println(randomFighter);


    }
}
