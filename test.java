public class test {
    public test(){}
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if(speed<=60){
          return 0;
        }
        if(isBirthday=true){
          if(speed<=65){
            return 0;
          }
          if((speed>65) && (speed<=80)){
            return 1;
          }
        }
        if(isBirthday=false){
          if((speed>=61) && (speed<=80)){
            return 1;
          }
          if(speed>80){
            return 2;
          }
        }
        return 111;
      }
}
