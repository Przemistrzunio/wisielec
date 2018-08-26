package com.sda.hangman;

import com.sda.hangman.domain.port.PhraseRepository;

import java.util.Scanner;

public class Application {

    private static Scanner scanner;
    private static PhraseRepository phraseRepository;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean menuFlag = true;
        do {
            System.out.println("1. Start ");
            System.out.println("2. Wyniki ");
            System.out.println("3. Koniec ");
            int decision = scanner.nextInt();

            switch (decision) {
                case 1:
                    System.out.println("Tutaj będzie logika do start ");
                    break;
                case 2:
                    System.out.println("Tutaj będzie logika do wyników ");
                    break;
                default:
                    System.out.println("Tutaj będzie koniec ");
            }
        }
        while (menuFlag);
    }
    public static void startGame(){
        System.out.println("Podaj swój nick : ");
        String name = scanner.nextLine();
        System.out.println("Kliknij Enter, żeby rozpocząć program ");
        String phrase = phraseRepository.getPhrase();
    }
}