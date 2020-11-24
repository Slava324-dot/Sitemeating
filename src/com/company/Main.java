package com.company;

public class Main {

    public static void main(String[] args) {
    User User1 = new User((short) 32, "Slava", 184);
    System.out.println("Имя " + User1.name + " Возраст " + User1.age + " Рост " + User1.height);
    }
}

    class User {
        String name;
        short age;
        int height;

        public User(String name, short age, int height) {
            this.name = name;
            this.age = age;
            this.height = height;

        }

        public User(String name, int height, short age) {
            this.name = name;
            this.age = age;
            this.height = height;

        }


        public User(int height, String name, short age) {
            this.name = name;
            this.age = age;
            this.height = height;

        }

        public User(int height, short age, String name) {
            this.name = name;
            this.age = age;
            this.height = height;

        }

        public User(short age, int height, String name) {
            this.name = name;
            this.age = age;
            this.height = height;

        }


        public User(short age, String name, int height) {
            this.name = name;
            this.age = age;
            this.height = height;

        }





















}