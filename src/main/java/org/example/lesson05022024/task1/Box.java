package org.example.lesson05022024.task1;

public class Box<Item> {
    //1. Создать generic класс Box<Item>, в котором можно хранить предметы любого типа.
    //Реализовать методы:
    //- put(Item item) - положить предмет
    //- get() - извлечь предмет
    //- remove() - извлечь и удалить предмет

    private Item object;

    public Box(Item object) {
        put(object);
        this.object = object;
    }

    public Item get() {
        return object;
    }

    public void put(Item object) {
        this.object = object;
    }

    public Item remove(){
        object = null;
        return object;
    }
}
