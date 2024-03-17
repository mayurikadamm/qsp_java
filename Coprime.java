public class Coprime {

    public static void main(String[] args) {
        int num1 = 14;
        int num2 = 15;
        int a=Math.min(num1, num2);
        int x=0;

         for (int i = 1; i <=a; i++) {
             if(num1 % i == 0 && num2 % i== 0){
                 x=i;
             }
             
         }
            if (x==1) {
              System.out.println("they are coprime.");
              
        } 
        else {
            System.out.println("they are not coprime.");
            
        }    
        
    }
}
//output:they are coprime
