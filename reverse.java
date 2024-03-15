class reverse {
    public static void main(String[] var) {
int b=21798;
int rev=0;

      do{
        int rem=b%10;
        rev=rev*10+rem;
        b=b/10;
      }while(b>0);
    System.out.println(rev);
    }
 }
 //output:89712
