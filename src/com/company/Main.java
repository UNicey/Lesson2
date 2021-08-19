package com.company;

public class Main {

    public static void main(String[] args) {
        String value  = "Красный";
        switch (value){
            case "Красный":
                System.out.println("Вы агрессивный и вспыльчивый");
                break;
            case "Оранжевый":
                System.out.println("Вы очень вечелый");
                break;
            case "Белый":
                System.out.println("Вы добрый и мягкий");
                break;
        }

        if (value == "Оранжевый" || value.length()> 3){
           printText("Hello World!", "This is from the main method!");

        }
        System.out.println(sum(15, 20));
    }

    public static void  print(){
        System.out.println("Проверка прошла!");
    }

    public static void printText(String text, String secondText){
        System.out.println(text + " " + secondText);
    }

    public static int sum(int a, int b){
        return a + b;
    }
}
