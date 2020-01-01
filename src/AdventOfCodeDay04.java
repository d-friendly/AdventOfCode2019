import java.util.ArrayList;

public class AdventOfCodeDay04 {


  public static boolean ruleCheck(String password) {
    char adjacentChar=password.charAt(0);
    int adjacentLength=1;
    ArrayList<Integer> adjacentLengths = new ArrayList<Integer>();
    
    for (int i = 0; i < password.length() - 1; i++) {
      char currentChar = password.charAt(i);
      char nextChar = password.charAt(i + 1);
      if (adjacentChar == nextChar) {
        adjacentLength++;
        if(i==password.length()-2) {
          adjacentLengths.add(adjacentLength);
        }
      }else {
        adjacentLengths.add(adjacentLength);
        adjacentChar=nextChar;
        adjacentLength=1;
      }
      
      if (currentChar > nextChar ) {
        return false; //if password is descending
      }
    }
    if(adjacentLengths.contains(2)) { 
      return true;
    }
    return false;
  }
  
  public static int findValidPasswords() {
    int amountOfPasswords = 0;
    for (int i = 165432; i <= 707912; i++) {
      String password = "" + i;
      if (ruleCheck(password)) {
        amountOfPasswords++;
      }
    }
    return amountOfPasswords;
  }
  
  public static void main(String[] args) {
    System.out.println("There are " + findValidPasswords()+ " valid passwords.");
  }

}
