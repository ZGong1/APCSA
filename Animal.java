import java.util.*;

public class Animal {
 private String name; 
 private int height;
 public Animal(String name, int height) {
  this.name = name;
  this.height = height;
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



class Mammal extends Animal {
 private boolean standsOnTwoLegs;
 public Mammal(String name, int height, boolean standsOnTwoLegs) {
  super(name, height);
  this.standsOnTwoLegs = standsOnTwoLegs;
 }
}

class Bird extends Animal {
  private int numberOfFeathers;
  public Bird(String name, int height, int numberOfFeathers) {
    super(name, height);
    this.numberOfFeathers = numberOfFeathers;
  }
}
