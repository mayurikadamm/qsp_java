
class NeonNumber{
    public static void main(String[ ]args){
       int n=9;
       int result=0;
       int sqr=n*n;

       while (sqr>0) {
        int rem=n%10;
        n=n/10;
        result+=rem;

        if(result==n){
            System.out.println("Neon number");

        }
        else{
            System.out.println("not neon number");

        }
       }
   }
   }
   
//output;neon number
