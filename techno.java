class techno {
    techno() {
    }
 
    public static void main(String[] var0) {
       int var1 = 2025;
       int var2 = var1;
 
       int var4;
       for(var4 = 0; var1 > 0; var1 /= 10) {
          ++var4;
       }
 
       if (var4 % 2 == 0) {
          int var5 = 1;
 
          int var6;
          for(var6 = 0; var6 < var4 / 2; ++var6) {
             var5 *= 10;
          }
 
          var6 = var2 / var5;
          int var7 = var2 % var5;
          int var8 = var6 + var7;
          int var9 = var8 * var8;
          if (var9 == var2) {
             System.out.println("Tech number");
          } else {
             System.out.println("not tech number");
          }
       } else {
          System.out.println("the digit is not even");
       }
 
    }
 }
 //output:Tech number
