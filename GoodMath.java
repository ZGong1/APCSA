import java.util.Scanner;

public class GoodMath {

  private int num1, num2, num3, num4, num5;
  
  private int highNum, lowNum, sumNum, prodNum;
  
  private double quotNum;
  
  public GoodMath() {
   num1 = 8;
   num2 = 4;
   num3 = 40;
   num4 = 2;
   num5 = 1;
   highNum = 0;
   lowNum = 0;
   sumNum = 0;
   prodNum = 0;
   quotNum = 0.0;
  }
  
  public int highest(int a, int b, int c, int d, int e) {
  int highest = Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));
  highNum = highest;
  return highest;
  }
  
  public int lowest(int a, int b, int c, int d, int e) {
   int lowest = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
   lowNum = lowest;
   return lowest;
  }
  
  // highest divided by lowest
  
  public double divide() {
   quotNum = (double)highNum/lowNum;
  }
  
  // product of all
  
  //sum of all
  
  public static void main(String[] args) {
   GoodMath morth = new GoodMath();
   System.out.println(morth.highest(1, 5, 50, 20, 4));
   System.out.println(morth.lowest(3, 5, 50, 20, 18));
  }

  
  
}