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
      console.printf("1. Mad Libs\n");
      console.printf("2. Rock, Paper, Scissors (WIP)\n");
      console.printf("   --More to come!--\n\n");
      console.printf("-Select By Typing Number-\n");

      // grab the user input
      String userResponseAsString = console.readLine("> ");
      // parse it into a number
      int userResponseAsInt = Integer.parseInt(userResponseAsString);

      console.printf(userResponseAsString + "\n");
      console.printf(userResponseAsInt + "\n");

    }
}
