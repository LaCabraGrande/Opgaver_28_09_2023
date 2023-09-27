//Task 4
import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    ArrayList<String> actions = new ArrayList<String>();
    GameMenu gamemenu = new GameMenu(actions);
    actions.add("1) Start game");
    actions.add("2) Resume game");
    actions.add("3) Pause game");
    actions.add("4) End game");
    gamemenu.displayMenu();
    
  }

}

              

