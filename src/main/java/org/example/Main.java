package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
        singleton.getId();

        Singleton singleton2 = Singleton.getInstance();
        singleton2.showMessage();
        singleton2.getId();

        Singleton singleton3 = new Singleton();
        singleton3.showMessage();
        singleton3.getId();

         */

        try {
            Undo undo1 = Undo.getInstance();
            history(undo1);
            Undo undo2 = Undo.getInstance();
            history(undo2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void history(Undo undo) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        System.out.println("New Console: ");
        while (true) {
            System.out.print("> ");
            input = bufferedReader.readLine();
            if (input == null || input.equalsIgnoreCase("exit")) break;
            undo.addCommand(input);
            if (input.equalsIgnoreCase("history")) {
                List<String> history = undo.getHistory();
                for (int i = 0; i < history.size(); i++) {
                    System.out.println(i + ": " + history.get(i));
                }
            }
        }
    }
}