package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Command extends Console {
    private String command;
    private final Output output = new Print();
    static Undo history = Undo.getInstance();

    public Command() throws IOException {
        setCommand();
    }

    public static void history(String command) {
        history.addCommand(command);
    }

    public void setCommand() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        output.Print("New Console: ");

        exitLoop:
        while (true) {
            output.Print("> ");
            String input = bufferedReader.readLine();
            switch (input){
                case "ls":
                    //
                    break;
                case "history":
                    List<String> historyList = history.getHistory();
                    for (int i = 0; i < historyList.size(); i++) {
                        output.Print(i + ": " + historyList.get(i));
                    }
                    break;
                case "exit":
                    break exitLoop;
            }

            history.addCommand(input);
        }

    }

}
