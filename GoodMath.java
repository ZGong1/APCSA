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
  
  public int highest() {
  int returnNum = Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4, num5))));
  highNum = returnNum;
  return returnNum;
  }
  
  public int lowest() {
   int returnNum = Math.min(num1, Math.min(num2, Math.min(num3, Math.min(num4, num5))));
   lowNum = returnNum;
   return returnNum;
  }
  
  public double divide() {
   quotNum = (double)highNum/lowNum;
   return quotNum;
  }
  
  public int multiply() {
   prodNum = num1*num2*num3*num4*num5;
   return prodNum;
  }
  
  public int add() {
   sumNum = num1+num2+num3+num4+num5;
   return sumNum;
  }
  
  public static void main(String[] args) {
   GoodMath morth = new GoodMath();
   Scanner k = new Scanner(System.in);
   System.out.println("Enter five integers.");
   morth.num1 = k.nextInt();
   morth.num2 = k.nextInt();
   morth.num3 = k.nextInt();
   morth.num4 = k.nextInt();
   morth.num5 = k.nextInt();
   
   System.out.println(morth.highest() + " is the highest number.");
   System.out.println(morth.lowest() + " is the lowest number.");
   System.out.println(morth.multiply() + " is all of the numbers multiplied.");
   System.out.println(morth.divide() + " is the highest divided by the lowest.");
   System.out.println(morth.add() + " is all of the numbers added.");
   
  }
// highest lowest multiply divide add
  
  
}
