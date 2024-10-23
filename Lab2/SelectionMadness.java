package Lab2;

public class SelectionMadness {

    // no instance variables //
    
    public SelectionMadness() { }
  
    /* Returns 1 of 5 randomly generated fortunes as a string;
       you should write your own 5 fortunes! (see output for examples)
     */
    public String fortune() {
      int roll = (int)((Math.random()*5)+1);
      if (roll==1){
         return("Elon Musk will give you $1B today.");
       }
       if (roll==2){
         return("Mr. Beast will spawn in your house and ask you to spell \"million\" to win a million dollars.");
       }
       if (roll==3){
         return("Your car will get a flat tire today.");
       }
       if (roll==4){
         return("WW3 will start today.");
       }
       else{
         return("AI will take your job tomorrow.");
       }
   }
  
    /* Returns the largest of three provided integers: num1, num2, or num3
     */
    public int largest(int num1, int num2, int num3) {
       if ((num1>=num2) && (num1>=num3)){
         return num1;
       }
       if ((num2>=num1)&&(num2>=num3)){
         return num2;
       }
       else{
         return num3;
       }
    }
  
  }
  