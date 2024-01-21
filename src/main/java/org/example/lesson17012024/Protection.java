package org.example.lesson17012024;

import java.util.Random;

public class Protection {
    private String name;
    private int level;
    private static Protection[] availableProtection;

    static {
        Protection protection1 = new Protection("Hat", 0);
        Protection protection2 = new Protection("Jacket", 10);
        Protection protection3 = new Protection("Helmet", 15);
        Protection protection4 = new Protection("Shield", 30);
        Protection protection5 = new Protection("Bulletproof", 10);
        availableProtection = new Protection[]{protection1,protection2,protection3,protection4,protection5};

    }

    public Protection(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public static Protection generateRandomProtection() {
        Random random = new Random();
        int r = random.nextInt(availableProtection.length);
        return availableProtection[r];

    }

    @Override
    public String toString() {
        return "Protection{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
