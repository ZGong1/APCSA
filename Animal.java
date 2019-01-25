import java.util.*;

public class Animal {
 private String name; 
 private int height;
 public Animal(String name, int height) {
  this.name = name;
  this.height = height;
 }
 
 public static void main(String[] args) {
  
 }
}

class Reptile extends Animal {
 private boolean livesUnderWater;
 public Reptile(String name, int height, boolean livesUnderWater) {
  super(name, height);
  this.livesUnderWater = livesUnderWater;
 }
}

class Alligator extends Reptile {
 private int killCount;
 public Alligator(String name, int height, boolean livesUnderWater, int killCount) {
  super(name, height, livesUnderWater);
  this.killCount = killCount;
 }
}

class Snake extends Reptile {
 private boolean isPoisonous;
 public Snake(String name, int height, boolean livesUnderWater, boolean isPoisonous) {
  super(name, height, livesUnderWater);
  this.isPoisonous = isPoisonous;
 }
}












class Mammal extends Animal {
 private boolean standsOnTwoLegs;
 public Mammal(String name, int height, boolean standsOnTwoLegs) {
  super(name, height);
  this.standsOnTwoLegs = standsOnTwoLegs;
 }
}

class Human extends Mammal {
 private int iq;
 public Human(String name, int height, boolean standOnTwoLegs, int iq) {
   super(name, height, standOnTwoLegs);
   this.iq = iq;
 }
}

class Tiger extends Mammal {
 private int tailLength;
 public Tiger(String name, int height, boolean standOnTwoLegs, int tailLength) {
  super(name, height, standOnTwoLegs);
  this.tailLength = tailLength;
 }
}








class Bird extends Animal {
  private int numberOfFeathers;
  public Bird(String name, int height, int numberOfFeathers) {
    super(name, height);
    this.numberOfFeathers = numberOfFeathers;
  }
}

class Owl extends Bird {
 private int headRotation;
 public Owl(String name, int height, int numberOfFeathers, int headRotation) {
   super(name, height,  numberOfFeathers);
   this.headRotation = headRotation;
 }
}

class Parrot extends Bird {
 private int wordsLearned;
 public Parrot(String name, int height, int numberOfFeathers, int wordsLearned) {
  super(name, height, numberOfFeathers);
  this.wordsLearned = wordsLearned;
 }
}

