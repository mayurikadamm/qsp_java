public class Amicable {

    public static void main(String[] args) {
        int num1 = 220;
        int num2 = 284;
        int sumnum1=0;
        int sumnum2=0;

         for (int i = 1; i <num1; i++) {
             if(num1 % i == 0){
                 sumnum1+=i;
             }
         }
        
          for (int i = 1; i <num2; i++) {
             if(num2 % i == 0){
                 sumnum2+=i;
             }
             
         }
            if ((sumnum1==num2)&&(sumnum2==num1)) {
              System.out.println("they are amicable");
              
        } 
        else {
              System.out.println("they are not amicable");

        }    
        
    }
    }

//output:they are amicable
