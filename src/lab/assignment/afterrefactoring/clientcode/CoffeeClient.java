package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.AmericanoMaker;
import lab.assignment.afterrefactoring.CapuccinoMaker;
import lab.assignment.afterrefactoring.CoffeeMaker;
import lab.assignment.afterrefactoring.MochaMaker;

public class CoffeeClient {

  public static void main(String[] args) {
    CoffeeMaker starbuzz = new MochaMaker();
    starbuzz.prepareCoffee();
    System.out.println("********************");

    starbuzz = new CapuccinoMaker();
    starbuzz.prepareCoffee();
    System.out.println("********************");

    starbuzz = new AmericanoMaker();
    starbuzz.prepareCoffee();
  }

}
