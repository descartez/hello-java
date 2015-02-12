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

      // ---------Mad Libs Game---------
    if (userResponseAsInt == 1) {
      console.printf("You chose Mad Libs! Excellent choice!\n");
      String name = console.readLine("Enter your name:  ");
      String adjective = console.readLine("Enter an adjective:  ");
      String noun = console.readLine("Enter a noun:  ");
      boolean censorWord = (noun.equalsIgnoreCase("dork") ||
        noun.equalsIgnoreCase("jerk"));
      do {
        if (censorWord) {
          console.printf("Watch your language poonslayer. Try again\n\n");
        };
      } while(censorWord);

      String adverb = console.readLine("Enter an adverb:  ");
      String verb = console.readLine("Enter a verb ending in -ing:  ");

      console.printf("%s is a %s %s. ", name, adjective, noun);
      console.printf("They are always %s %s.\n", adverb, verb);
    }

    if (userResponseAsInt == 2) {
      console.printf("You chose Rock, Paper, Scissors!\n Welcome brave warrior!\n");
      console.printf(" 0      []        X\n");
      console.printf("ROCK?  PAPER?  SCISSORS?\n");

      String userChoice = console.readLine("> ");

      if (userChoice.equalsIgnoreCase("rock") || userChoice.equals("0")) {
        console.printf("You chose rock! Strength and Honor!\n");
      } else if (userChoice.equalsIgnoreCase("paper") || userChoice.equals("[]")) {
        console.printf("You chose paper! Wisdom and Adaptability!\n");
      } else if (userChoice.equalsIgnoreCase("scissors") || userChoice.equalsIgnoreCase("X")) {
        console.printf("You chose scissors! Truth and Justice!\n");
      } else {
        console.printf("None of those are choices, brave warrior.\n");
      }

    }

    else {
      console.printf("None of those are options!\nPlease select by using the number of the game you want.\n");
    }
  }
}
