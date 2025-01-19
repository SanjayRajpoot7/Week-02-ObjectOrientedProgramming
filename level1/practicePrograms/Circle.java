public class Circle {
    double radius;


    public Circle(){
        this.radius = 12;
    }
    public void display(){
        System.out.println("Radius is: "+radius);
    }
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.display();
    }
}


