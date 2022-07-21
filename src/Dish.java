//Dish java test
public class Dish(){
  private String dishName;
  private int nutrition;
  private double price;
  
  
  //constructor
  public Dish(String dishName, int nutrition, double price){
    this.dishName = dishName;
    this.nutrition = nutrition;
    this.price = price;
  }
  
  //getter and setter 
  public String getDishName(){
    return dishName;
  }
  
  public int getNutrition(){
    return nutrition;
  }
  
  public double getPrice(){
    return price;
  }
  
  public void changePrice(double newPrice){
    this.price = newPrice;
  }
}
