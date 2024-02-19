package org.example.lesson1402024.tsk1.task2;

import java.util.Arrays;
import java.util.Iterator;

public class CustomArrayList implements Iterable<String> {

        private String[] data;
        private int nextCounter;
//        private int capacity;

        public CustomArrayList(String[] data) {
            this.data = data;
        }


    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
            CustomArrayList list = new CustomArrayList(new String[] {"A", "B", "C", "D"});


        for (String s : list) { // TODO
            System.out.println(s);
        }
        for (String s : list) { // TODO
            System.out.println(s);
        }
        for (String s : list) { // TODO
            System.out.println(s);
        }
        }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < data.length;
            }

            @Override
            public String next() {
                return data[index++];
            }
        };
    }

}
