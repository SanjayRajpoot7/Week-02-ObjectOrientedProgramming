package level1;
public class areaOfCircle {

   public void findAreaOfCircle( float radius){
       double totalArea = radius * radius * 3.142;
       double circumference = 2 * 3.142 * radius;
       System.out.println("Total area of circle: "+totalArea);
       System.out.println("Total area of cicumference: "+circumference);

   }
    public static void main(String[] args) {
    areaOfCircle ac = new areaOfCircle();
    ac.findAreaOfCircle(7);

    }
}
