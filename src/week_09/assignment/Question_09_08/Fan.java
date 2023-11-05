package week_09.assignment.Question_09_08;

public class Fan {
//           ------------------------------------
//           |             Fan                  |
//           ------------------------------------
//           | - SLOW: int                      |
//           | - MEDIUM: int                    |
//           | - FAST: int                      |
//           | - speed: int                     |
//           | - on: boolean                    |
//           | - radius: double                 |
//           | - color: String                  |
//           ------------------------------------
//           | + Fan()                          |
//           | + getSpeed(): int                |
//           | + setSpeed(speed: int): void     |
//           | + isOn(): boolean                |
//           | + setOn(on: boolean): void       |
//           | + getRadius(): double            |
//           | + setRadius(radius: double): void|
//           | + getColor(): String             |
//           | + setColor(color: String): void  |
//           | + toString(): String             |
//           ------------------------------------
   private final int SLOW = 1 ;
   private final int MEDIUM = 2;
   private final int FAST = 3;
   private int speed;
   private boolean on;
   private double radius;
   private String color;
   public Fan(){
      this.speed = SLOW;
      this.on = false;
      this.radius = 5;
      this.color = "blue";
   }
   public int getSpeed(){
      return speed;
   }
   public void setSpeed(int speed){
      this.speed = speed;
   }

   public boolean isOn() {
      return on;
   }

   public void setOn(boolean on) {
      this.on = on;
   }

   public double getRadius() {
      return radius;
   }

   public void setRadius(double radius) {
      this.radius = radius;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }
   public String toString(){
      if(on){
         return "Fan speed" + speed + ", color: " + color + ", radius: " + radius;
      }
      else{
         return "Fan color: " + color + ", radius: " + radius + ", fan is off";
      }
   }
}
