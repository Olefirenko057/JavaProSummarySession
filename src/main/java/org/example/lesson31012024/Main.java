package org.example.lesson31012024;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        A.doSomethingStatic();
        A a = new A("j");
        a.doSomething();
        a = new B("l");
        a.doSomething();
        a.doSomething("A","B","C");

    }
   static class A {


        private String field;

       public A() {
           this("default");
       }

       public A(String field) {
           this.field = field;
           System.out.println("DO A");
       }

       public void doSomething() {
            System.out.println("class A");
        }
       public void doSomething(int a) {
           System.out.println("class A");
       }

       public void doSomething(String...s) {
           System.out.println("class A");
       }
        public static void doSomethingStatic() {

        }

    }

   static class B extends A {
       public B(String field) {
           super();
           System.out.println("DO B");
       }

       @Override
        public void doSomething() {
            System.out.println("class B");
        }
    }
 }
