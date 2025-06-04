// Source code is decompiled from a .class file using FernFlower decompiler.
public class MathUtils {
   int add(int a,int b){
    return a+b;
   }

   double add(double a, double b) {
      return a + b;
   }
   int add(int a, int b, int c) {
      return a + b + c;
   }
        public static void main(String[] args) {
            MathUtils mu=new MathUtils();
            System.out.println(mu.add( 2, 3));
            System.out.println(mu.add( 2.5, 3.5));
            System.out.println(mu.add( 5,  4, 3));
        }
   }

