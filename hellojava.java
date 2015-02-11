import java.io.Console;

public class hellojava {

    public static void main(String []args) {
      Console console = System.console();
// -------GAME SELECTION MENU------------
      console.printf("Welcome to the...\n");
      console.printf("    ____________\n");
      console.printf("    ||  Hello ||\n");
      console.printf("    ||  Java  ||\n");
      console.printf("    || Arcade ||\n");
      console.printf("    ------------\n\n");
      console.printf("    ----Games---\n");
      console.printf("1. Rock, Paper, Scissors\n");
      console.printf("2. Mad Libs\n");
      console.printf("   --More to come!--\n\n");
      console.printf("-Select By Typing Number-\n");
      String userResponse = console.readLine("> ");
    }
}
