package Task;

class Afritada {
  public void showIngredients() {
    String[] Ingredients = {"Tomato Sauce","Meat"};
    System.out.println("Afritada = "+java.util.Arrays.toString(Ingredients)+"🍲 \n");
  }
}

class  Mechado {
  public void showIngredients() {
    String[] Ingredients = {"Tomato Sauce","Meat", "Potatoes & Carrots", "Tomato Paste"};
    System.out.println("Afritada = "+java.util.Arrays.toString(Ingredients)+"🍲 \n");
  }
}

class Menudo {
  public void showIngredients() {
    String[] Ingredients = {"Tomato Sauce","Meat", "Potatoes & Carrots", "Liver Spread", "Raisins", "Hotdog", "Siling Labuyo"};
    System.out.println("Afritada = "+java.util.Arrays.toString(Ingredients)+"🍲 \n");
  }
}

// extend Afritada Class here
class Caldereta extends Afritada {
  public void showIngredients() {
    String[] Ingredients = 
      {"Tomato Sauce",
       "Meat",
       "Potatoes & Carrots",
       "Tomato Paste",
       "Liver Spread",
       "Raisins",
       "Hotdog",
       "Siling Labuyo",
       "Cheese"};
    System.out.println("Caldereta = "+java.util.Arrays.toString(Ingredients)+"🍲 \n");
  }
}

//main method
public class Task131 {
    public static void main(String[] args) {
      // add 4 meal$ objects here and set the type as the extended Afritada class
      // display all ingredients at every object
        Afritada meal1 = new Afritada();
        meal1.showIngredients();

        Mechado meal2 = new Mechado();
        meal2.showIngredients();


        Menudo meal3 = new Menudo();
        meal3.showIngredients();
      
        Afritada meal4 = new Caldereta();
        meal4.showIngredients();

      
        
    }
}


