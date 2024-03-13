class Fibbonacci {
    public static void main(String[] args) {
        int n=10;
        int firstno=0;
        int secondno=1;
        
        for(int i=0;i<n;i++){
            int result=firstno+secondno;
            firstno=secondno;
            secondno=result;
        
        System.out.println(result);
        }
    }
}

\\output:
1
2
3
5
8
13
21
34
55
89
