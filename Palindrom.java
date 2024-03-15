class Palindrom {
    public static void main(String[] var) {
int a=121;
int r=0;
int a1=a; 
while(a>0){ 
    int rem=a%10;
    r=r*10+rem;
    a=a/10;
}

if(a1==r){
    System.out.println("palindrom");

}
else{
    System.out.println("not palindrom");

}
    }
 }
