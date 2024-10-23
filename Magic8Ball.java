import java.util.Scanner;

public class Magic8Ball {
   public static void main(String[] args) {

     // Tell the user to enter a question
     Scanner scan = new Scanner(System.in);
     System.out.println("Welcome to the Magic 8 Ball!");
     System.out.print("Enter a yes-no question and I will answer it: ");
     String question = scan.nextLine();
    int x = (int)((Math.random()*6)+1);
    if (x==1){
      System.out.println("Outlook good");
    }
    if (x==2){
      System.out.println("It is certain");
    }
    if (x==3){
      System.out.println("Concentrate and ask again");
    }
    if (x==4){
      System.out.println("Better not tell you now");
    }
    if (x==5){
      System.out.println("Outlook not good");
    }
    if (x==6){
      System.out.println("Don't count on it");
    }
     // Write a little program here to randomly choose
     // one of six responses to the user's yes-no question!
     scan.close();
   }
}
