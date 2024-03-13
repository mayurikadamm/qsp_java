class ArmstrongNumber {
    public static void main(String[] args) {
      int result=0;
      int num=153;
      int num1=num;
      int num2=num;
      
      int count=0;
      while(num>0){
          count ++;
          num=num/10;
      }
      
      while(num1>0){
          int rem=num1%10;
          int pow=1;
          for(int i=1;i<=count;i++){
              pow=pow*rem;
          }
          result=result+pow;
          num1=num1/10;
      }
     
      if(result==num2){
          System.out.println("armstrong number");
      }
      else{
          System.out.println("not an armstrong numberr");
      }
    }
}
//output:armstrong number
