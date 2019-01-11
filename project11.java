import java.util.*;
public class project11 {
  
  private static ArrayList<String> input = new ArrayList<String>();
    
    //make one that gets rid of duplicates
    
  public static ArrayList<String> convert(ArrayList<String> toConvert) {
    ArrayList<String> output = new ArrayList<String>();
    for(int i = 0; i < 10; i++) {
      if(toConvert.get(i).equals("1")) {
        output.add("One");
      }
      else if(toConvert.get(i).equals("2")) {
        output.add("Two");
      }
      else if(toConvert.get(i).equals("3")) {
        output.add("Three");
      }
      else if(toConvert.get(i).equals("4")) {
        output.add("Four");
      }
      else if(toConvert.get(i).equals("5")) {
        output.add("Five");
      }
      else if(toConvert.get(i).equals("6")) {
        output.add("Six");
      }
      else if(toConvert.get(i).equals("7")) {
        output.add("Seven");
      }
      else if(toConvert.get(i).equals("8")) {
        output.add("Eight");
      }
      else if(toConvert.get(i).equals("9")) {
        output.add("Nine");
      }
      else if(toConvert.get(i).equals("10")){
        output.add("Ten");
      }
      else {
       output.add(toConvert.get(i)); 
      }
    }  
    return output;
  }
  
  
  public static ArrayList<String> duplicates(ArrayList<String> toDelete) {
    ArrayList<String> toReturn = new ArrayList<String>();
      for(String str : toDelete) {
        if(toDelete.indexOf(str) == toDelete.lastIndexOf(str) || !toReturn.contains(str)) {
         toReturn.add(str);
        }
      }
    
    
    
    return toReturn;
  }
    
    
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.println("Input 10 numbers 1-10");
    for(int i = 0; i < 10; i++) {
      input.add(kb.nextLine());
    }
    
    input = convert(input);
    input = duplicates(input);
    
    System.out.println(input);
  }
  
  
}
