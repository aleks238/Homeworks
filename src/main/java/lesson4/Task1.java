package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {


    private static final int SIZE = 3;
    private static char[][] GAME_FIELD = new char[SIZE][SIZE];
    private static final char HUMAN_SYMBOL = 'X';
    private static final char COMPUTER_SYMBOL = '0';
    private static final char EMPTY_FIELD = '*';
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private static String SPACE_FIELD = "  ";


    public static void main(String[] args) {
        initGameField();
        printGameField();
        playGame();
    }

    private static void initGameField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                GAME_FIELD[i][j] = EMPTY_FIELD;
            }
        }
    }

    private static void printGameField() {
        System.out.print("   ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + SPACE_FIELD);
        }

        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + SPACE_FIELD);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(GAME_FIELD[i][j] + SPACE_FIELD);
            }
            System.out.println();
        }
    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printGameField();
            if (checkEnd(HUMAN_SYMBOL)) {
                break;
            }

            computerTurn();
            printGameField();
            if (checkEnd(COMPUTER_SYMBOL)) {
                break;
            }
        }
    }

    private static void humanTurn() {
        System.out.println("Human turn");
        int rowNumber;
        int columnNumber;

        while (true) {
            System.out.println("Input raw coordinate: ");
            rowNumber = scanner.nextInt() - 1;
            System.out.println("Input column coordinate: ");
            columnNumber = scanner.nextInt() - 1;
            if (GAME_FIELD[rowNumber][columnNumber] == EMPTY_FIELD) {
                break;
            }
            System.out.printf("Эта ячейка уже занята.");
        }
        GAME_FIELD[rowNumber][columnNumber] = HUMAN_SYMBOL;
    }

    private static void computerTurn() {
        System.out.println("Human turn");
        int rowNumber;
        int columnNumber;

        do {
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);
        } while (GAME_FIELD[rowNumber][columnNumber] != EMPTY_FIELD);
        GAME_FIELD[rowNumber][columnNumber] = COMPUTER_SYMBOL;
    }

    private static boolean checkEnd(char symb) {

        if (checkWin(symb)) {
            if (symb == HUMAN_SYMBOL) {
                System.out.println("You win");
            } else {
                System.out.println("Computer win");
            }
            return true;
        }

        if (checkDraw()) {
            System.out.println("Draw");
            return true;
        }
        return false;
    }

    private static boolean checkWin(char symb) {
        if (GAME_FIELD[0][0] == symb && GAME_FIELD[0][1] == symb && GAME_FIELD[0][2] == symb) return true;
        if (GAME_FIELD[1][0] == symb && GAME_FIELD[1][1] == symb && GAME_FIELD[1][2] == symb) return true;
        if (GAME_FIELD[2][0] == symb && GAME_FIELD[2][1] == symb && GAME_FIELD[2][2] == symb) return true;

        if (GAME_FIELD[0][0] == symb && GAME_FIELD[1][0] == symb && GAME_FIELD[2][0] == symb) return true;
        if (GAME_FIELD[0][1] == symb && GAME_FIELD[1][1] == symb && GAME_FIELD[2][1] == symb) return true;
        if (GAME_FIELD[0][2] == symb && GAME_FIELD[1][2] == symb && GAME_FIELD[2][2] == symb) return true;

        if (GAME_FIELD[0][0] == symb && GAME_FIELD[1][1] == symb && GAME_FIELD[2][2] == symb) return true;
        if (GAME_FIELD[2][0] == symb && GAME_FIELD[1][1] == symb && GAME_FIELD[0][2] == symb) return true;
        return false;
    }

    private static boolean checkDraw() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (GAME_FIELD[i][j] == EMPTY_FIELD) {
                    return false;
                }
            }
        }
        return true;
    }

}


