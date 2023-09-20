package com.Sudhir;

import java.util.Scanner;
import java.util.Random;

public class RPS_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        String[] choice={"rock","paper","scissors"};

        System.out.println("Enter your choice: ");
        System.out.println("Rock,Paper or Scissors");
        String plyChoice = sc.nextLine().toLowerCase();

        int comChoiceInd= random.nextInt(3);
        String comChoice = choice[comChoiceInd];
        System.out.println("Computer Choice: " +comChoice);

        if(plyChoice.equals(comChoice)){
            System.out.println("Match Tie!");
        }

        else if(plyChoice.equals("rock") && comChoice.equals("scissors") ||

                plyChoice.equals("scissors") && comChoice.equals("paper") ||

                plyChoice.equals("paper") && comChoice.equals("rock"))
        {
            System.out.println("Congratulation! You Won the match");
        }
        else
        {
            System.out.println("Computer Win");
        }
    }
}

