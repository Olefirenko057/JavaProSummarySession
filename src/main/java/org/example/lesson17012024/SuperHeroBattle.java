package org.example.lesson17012024;

public class SuperHeroBattle {
    public static void main(String[] args) {
//        Weapon weapon1 = new Weapon("Gun", 30);
//        Weapon weapon2 = new Weapon("Sword", 10);
//        Weapon weapon3 = new Weapon("Canon", 50);
//
//        Protection protection1 = new Protection("Shield", 15);
//        Protection protection2 = new Protection("Bulletproof vest", 10);
//        Protection protection3 = new Protection("Armor", 20);

         Superhero steve = new Superhero("Steve", 70);
         Superhero leo = new Superhero("Leo",55);

         System.out.println("Before the fight:");
         System.out.println(steve);
         System.out.println(leo);

         System.out.println();

         steve.fight(leo);

         System.out.println();

         System.out.println("After the fight:");
         System.out.println(steve);
         System.out.println(leo);

         System.out.println();


         Superhero randomFighter = Superhero.generateRandomFighter();
         System.out.println("Before the fight");
         System.out.println(steve);
         System.out.println(randomFighter);

         System.out.println();

         steve.fight(randomFighter);

         System.out.println("After the fight");
         System.out.println(steve);
         System.out.println(randomFighter);


    }
}
