package com;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Boolean w= true;
        int i=0;
        int j=1;
        String[][] n = new String[10][10];

        for ( i=1 ; i<=3 ; i++){
            for ( j=1 ; j<=3 ; j++) {
                n [i][j] = " ";
            } }

        System.out.println("Нолики начинают");

        for (int m=1 ; m<10 ; m++){
            if (m%2==1){
                System.out.println("Введите координаты нолика");
                i=in.nextInt();
                j=in.nextInt();
                while (n[i][j]!=" "){
                    System.out.println("Здесь ставить нельзя, введите другие координаты");
                    i=in.nextInt();
                    j=in.nextInt();
                }
                n[i][j]="O";
            }

            else{
                System.out.println("Введите координаты крестика");

                i=in.nextInt();
                j=in.nextInt();

                while (n[i][j]!=" "){
                    System.out.println("Здесь ставить нельзя, введите другие координаты");
                    i=in.nextInt();
                    j=in.nextInt();
                }
                n[i][j]="X";
            }

            for ( i=1 ; i<=3 ; i++){

                for ( j=1 ; j<=3 ; j++){

                    if ( j==3 )
                        System.out.print(n[i][j]);
                    else
                        System.out.print(n[i][j]+"|");
                }

                System.out.println();
                System.out.println("------");

            }
            if ( n[0+1][0+1] == n[0+1][1+1] && n[0+1][1+1]== n[0+1][2+1] && n[0+1][2+1]!=" " ||
            n[1+1][0+1] == n[1+1][1+1] && n[+11][1+1] == n[1+1][2+1] && n[1+1][2+1]!=" " ||
            n[2+1][0+1] == n[2+1][1+1] && n[2+1][1+1] == n[2+1][2+1] && n[2+1][2+1]!=" " ||
            n[0+1][0+1] == n[1+1][0+1] && n[1+1][0+1] == n[2+1][0+1] && n[2+1][0+1]!=" " ||
            n[0+1][1+1] == n[1+1][1+1] && n[1+1][1+1] == n[2+1][1+1] && n[2+1][1+1]!=" " ||
            n[0+1][2+1] == n[1+1][2+1] && n[1+1][2+1] == n[2+1][2+1] && n[2+1][2+1]!=" " ||
            n[0+1][0+1] == n[1+1][1+1] && n[1+1][1+1] == n[2+1][2+1] && n[2+1][2+1]!=" " ||
            n[0+1][2+1] == n[1+1][1+1] && n[1+1][1+1] == n[2+1][0+1] && n[2+1][0+1]!=" " ) {

                System.out.println("Игра закончилась, победил последний игрок) ");

                System.out.println("Чтобы сыграть заново, просто запусти команду ещё раз!");
            w = false;
                break;
            }
        }
        if (w){
            System.out.println("Эх, получилась ничья");
            System.out.println("Чтобы сыграть заново, просто запусти команду ещё раз!");
        }

    }}