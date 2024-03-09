package Core;
// for GitHub example
class Car {
 String color, model, transmission;
 int price;


 public Car(String color, String model, String transmission, int price) {
  this.color = color;
  this.model = model;
  this.transmission = transmission;
  this.price = price;
 }

 public Car() {
 }
 public void print() {
  System.out.println(model +" "+ color +" "+ transmission + " "+ price);
 }
}

