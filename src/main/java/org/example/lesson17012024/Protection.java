package org.example.lesson17012024;

public class Protection {
    private String name;
    private int level;

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

    @Override
    public String toString() {
        return "Protection{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
