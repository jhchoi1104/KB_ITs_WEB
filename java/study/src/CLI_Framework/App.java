package CLI_Framework;

import CLI_Framework.command.*;
import ch07.sec07.exam02.Parent;
import ch08.sec09.InterfaceC;

import java.util.Scanner;

public class App {
    Menu menu;
    Command[] commands;

    public App() {
        menu = new Menu();
        commands = new Command[] {
                new InitScoresCommand(),
                new GetScoresCommand(),
                new PrintScoreCommand(),
                new AnalizeCommand(),
                new ExitCommand()
        };
    }

    public b


    public void executeCommand(int selectNo) {
        Command command = commands[selectNo-1];
        command.execute();
    }

    public void run() {
        while(run) {
            menu.printMenu();
            int selectNo = menu.getSelect();
            executeCommand(selectNo);
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}
