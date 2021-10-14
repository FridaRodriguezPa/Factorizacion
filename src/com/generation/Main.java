package com.generation;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner c = new Scanner( System.in);
        System.out.print("Enter number 1  ");
        int num1 = c.nextInt();
        System.out.print("Enter number 2  ");
        int num2 = c.nextInt();
        System.out.println("Choose the number of the operation you want: \n1)Addition \n2)Subtraction \n3)Multiplication \n4)Division ");
        int operation = c.nextInt();
        switch (operation){
            case 1:
                int addition = num1 + num2;
                System.out.println( num1+" + "+num2+" = "+ addition);
                break;
            case 2:
                int subtraction = num1 - num2;
                System.out.println( num1+" - "+num2+" = "+ subtraction);
                break;
            case 3:
                int multiplication = num1 * num2;
                System.out.println( num1+" * "+num2+" = "+ multiplication);
                break;
            case 4:
                int division = num1 / num2;
                System.out.println( num1+" / "+num2+" = "+ division);
                break;
            default:
               System.out.println("La operacion es invalida");
        }
    }
}
