package stensaxpåse;

import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Utils utils = new Utils();
        Random random = new Random();
        spelare player = new spelare();
        spelare computer = new spelare();

        String[] computerOptions = {".", "o", "x"};

        boolean playGame = true;

        System.out.println("Du spelar mot datorn");
        System.out.println("Först till tre poäng vinner");


        while (playGame) {

            System.out.println("Välj Sten[.] - Påse[o] - Sax[x] Eller tryck på Q för att avsluta spelet");
            String playerPick = sc.nextLine();

            if (playerPick.equals(".") || playerPick.equals("o") || playerPick.equals("x")) {
                System.out.println("Du valde: " + utils.checkPickedValue(playerPick));
                String computerPick = computerOptions[random.nextInt(computerOptions.length)];
                System.out.println("Datorn valde: " + utils.checkPickedValue(computerPick));

                if (utils.isPlayerWinner(playerPick, computerPick)) {
                    player.setScore(1);
                    System.out.println("Poäng denna rundan: du " + player.getScore() + " - " + computer.getScore() + " Datorn");

                    if (player.getScore() == 3) {
                        player.setWins(1);
                        System.out.println("Du vann!!! Antal segrar: Du " + player.getWins() + " - " + computer.getWins() + " Datorn");
                        player.resetScore();
                        computer.resetScore();
                    }

                } else if (utils.isPlayerWinner(computerPick, playerPick)) {
                    computer.setScore(1);
                    System.out.println("Poäng denna rundan du: " + player.getScore() + " - " + computer.getScore() + " Datorn");

                    if (computer.getScore() == 3) {
                        computer.setWins(1);
                        System.out.println("Datorn vann!\nTotalt antal segrar: Du " + player.getWins() + " - " + computer.getWins() + " Datorn");
                        player.resetScore();
                        computer.resetScore();
                    }

                } else {
                    System.out.println("Lika, dra igen");
                }

            } else if (playerPick.equals("Q") || playerPick.equals("q")) {
                System.out.println("Du har valt att avsluta spelet");
                playGame = false;
            } else {
                System.out.println("Fel input, testa igen");
            }
        }

    }
}