package oop.exercises;
/*
* UCF cop3330 Summer 2021 Assignment 1 solutions
* Copyright 2021 Keondez Robinson
 */
import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String nounInput = input.nextLine();

        System.out.print("Enter a verb: ");
        String verbInput = input.nextLine();

        System.out.print("Enter an adjective: ");
        String adjInput = input.nextLine();

        System.out.print("Enter an adverb: ");
        String adverbInput = input.nextLine();

        System.out.println("Do Yo " + verbInput + " your " + adjInput + " " + nounInput + " " + adverbInput + "? That's hilarious!");
    }
}