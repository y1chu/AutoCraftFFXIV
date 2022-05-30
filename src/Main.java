import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

import static java.awt.event.KeyEvent.*;

public class Main {
    private static Robot bot;

    static {
        try {
            bot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }

    public static HashMap<String, Integer> items = new HashMap<>();

    public Main() throws AWTException {
        bot = new Robot();

    }

    public static void main(String[] args) throws Exception {
        System.out.println("Please make sure you have all the materials! (List below):");
        readPrintMaterialInput("src/DailyCraft.txt");
        bot.keyPress(KeyEvent.VK_ENTER);
        Main keyboard = new Main();
        // Scanner reader = new Scanner(System.in);
        // String typing = reader.nextLine();
        keyboard.type("Test");
        // Some ideas: make a timer to click in ff14
        // then do the clicking?

    }

    private static void readPrintMaterialInput(String materialList) throws FileNotFoundException {
        File input = new File(materialList);
        Scanner reader = new Scanner(input);
        while (reader.hasNextLine()) {
            String[] currentLine = reader.nextLine().split(",");
            Material currentMaterial = new Material(currentLine[0], Integer.parseInt(currentLine[1]));
            if (items.containsKey(currentMaterial.getItemName())) {
                items.put(currentMaterial.getItemName(), items.get(currentMaterial.getItemName()) + currentMaterial.getTotalCountNeeded());
            } else {
                items.put(currentMaterial.getItemName(), currentMaterial.getTotalCountNeeded());
            }
        }
        System.out.println(items.entrySet());
    }

    public void type(CharSequence characters) {
        int length = characters.length();
        for (int i = 0; i < length; i++) {
            char character = characters.charAt(i);
            type(character);
        }
    }

    public void type(char character) {
        switch (character) {
            case 'a' -> doType(VK_A);
            case 'b' -> doType(VK_B);
            case 'c' -> doType(VK_C);
            case 'd' -> doType(VK_D);
            case 'e' -> doType(VK_E);
            case 'f' -> doType(VK_F);
            case 'g' -> doType(VK_G);
            case 'h' -> doType(VK_H);
            case 'i' -> doType(VK_I);
            case 'j' -> doType(VK_J);
            case 'k' -> doType(VK_K);
            case 'l' -> doType(VK_L);
            case 'm' -> doType(VK_M);
            case 'n' -> doType(VK_N);
            case 'o' -> doType(VK_O);
            case 'p' -> doType(VK_P);
            case 'q' -> doType(VK_Q);
            case 'r' -> doType(VK_R);
            case 's' -> doType(VK_S);
            case 't' -> doType(VK_T);
            case 'u' -> doType(VK_U);
            case 'v' -> doType(VK_V);
            case 'w' -> doType(VK_W);
            case 'x' -> doType(VK_X);
            case 'y' -> doType(VK_Y);
            case 'z' -> doType(VK_Z);
            case 'A' -> doType(VK_SHIFT, VK_A);
            case 'B' -> doType(VK_SHIFT, VK_B);
            case 'C' -> doType(VK_SHIFT, VK_C);
            case 'D' -> doType(VK_SHIFT, VK_D);
            case 'E' -> doType(VK_SHIFT, VK_E);
            case 'F' -> doType(VK_SHIFT, VK_F);
            case 'G' -> doType(VK_SHIFT, VK_G);
            case 'H' -> doType(VK_SHIFT, VK_H);
            case 'I' -> doType(VK_SHIFT, VK_I);
            case 'J' -> doType(VK_SHIFT, VK_J);
            case 'K' -> doType(VK_SHIFT, VK_K);
            case 'L' -> doType(VK_SHIFT, VK_L);
            case 'M' -> doType(VK_SHIFT, VK_M);
            case 'N' -> doType(VK_SHIFT, VK_N);
            case 'O' -> doType(VK_SHIFT, VK_O);
            case 'P' -> doType(VK_SHIFT, VK_P);
            case 'Q' -> doType(VK_SHIFT, VK_Q);
            case 'R' -> doType(VK_SHIFT, VK_R);
            case 'S' -> doType(VK_SHIFT, VK_S);
            case 'T' -> doType(VK_SHIFT, VK_T);
            case 'U' -> doType(VK_SHIFT, VK_U);
            case 'V' -> doType(VK_SHIFT, VK_V);
            case 'W' -> doType(VK_SHIFT, VK_W);
            case 'X' -> doType(VK_SHIFT, VK_X);
            case 'Y' -> doType(VK_SHIFT, VK_Y);
            case 'Z' -> doType(VK_SHIFT, VK_Z);
            case '`' -> doType(VK_BACK_QUOTE);
            case '0' -> doType(VK_0);
            case '1' -> doType(VK_1);
            case '2' -> doType(VK_2);
            case '3' -> doType(VK_3);
            case '4' -> doType(VK_4);
            case '5' -> doType(VK_5);
            case '6' -> doType(VK_6);
            case '7' -> doType(VK_7);
            case '8' -> doType(VK_8);
            case '9' -> doType(VK_9);
            case '-' -> doType(VK_MINUS);
            case '=' -> doType(VK_EQUALS);
            case '~' -> doType(VK_SHIFT, VK_BACK_QUOTE);
            case '!' -> doType(VK_EXCLAMATION_MARK);
            case '@' -> doType(VK_AT);
            case '#' -> doType(VK_NUMBER_SIGN);
            case '$' -> doType(VK_DOLLAR);
            case '%' -> doType(VK_SHIFT, VK_5);
            case '^' -> doType(VK_CIRCUMFLEX);
            case '&' -> doType(VK_AMPERSAND);
            case '*' -> doType(VK_ASTERISK);
            case '(' -> doType(VK_LEFT_PARENTHESIS);
            case ')' -> doType(VK_RIGHT_PARENTHESIS);
            case '_' -> doType(VK_UNDERSCORE);
            case '+' -> doType(VK_PLUS);
            case '\t' -> doType(VK_TAB);
            case '\n' -> doType(VK_ENTER);
            case '[' -> doType(VK_OPEN_BRACKET);
            case ']' -> doType(VK_CLOSE_BRACKET);
            case '\\' -> doType(VK_BACK_SLASH);
            case '{' -> doType(VK_SHIFT, VK_OPEN_BRACKET);
            case '}' -> doType(VK_SHIFT, VK_CLOSE_BRACKET);
            case '|' -> doType(VK_SHIFT, VK_BACK_SLASH);
            case ';' -> doType(VK_SEMICOLON);
            case ':' -> doType(VK_COLON);
            case '\'' -> doType(VK_QUOTE);
            case '"' -> doType(VK_QUOTEDBL);
            case ',' -> doType(VK_COMMA);
            case '<' -> doType(VK_SHIFT, VK_COMMA);
            case '.' -> doType(VK_PERIOD);
            case '>' -> doType(VK_SHIFT, VK_PERIOD);
            case '/' -> doType(VK_SLASH);
            case '?' -> doType(VK_SHIFT, VK_SLASH);
            case ' ' -> doType(VK_SPACE);
            default -> throw new IllegalArgumentException("Cannot type character " + character);
        }


    }

    private void typeNumPad(int digit) {
        switch (digit) {
            case 0 -> doType(VK_NUMPAD0);
            case 1 -> doType(VK_NUMPAD1);
            case 2 -> doType(VK_NUMPAD2);
            case 3 -> doType(VK_NUMPAD3);
            case 4 -> doType(VK_NUMPAD4);
            case 5 -> doType(VK_NUMPAD5);
            case 6 -> doType(VK_NUMPAD6);
            case 7 -> doType(VK_NUMPAD7);
            case 8 -> doType(VK_NUMPAD8);
            case 9 -> doType(VK_NUMPAD9);
        }
    }

    private void doType(int... keyCodes) {
        doType(keyCodes, 0, keyCodes.length);
    }

    private void doType(int[] keyCodes, int offset, int length) {
        if (length == 0) {
            return;
        }

        bot.keyPress(keyCodes[offset]);
        doType(keyCodes, offset + 1, length - 1);
        bot.keyRelease(keyCodes[offset]);
    }


}







