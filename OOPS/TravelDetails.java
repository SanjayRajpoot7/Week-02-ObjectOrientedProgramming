import java.util.Scanner;
public class TravelDetails {
    String fromCity, toCity;
    double distance;

    TravelDetails(String fromCity, String toCity, double distance){
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.distance = distance;
    }

    void displayTravelInfo(){
        System.out.println("From "+fromCity+" to "+toCity+" total distance is: "+distance);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name of the city from where: ");
        String fromCity = scanner.nextLine();

        System.out.println("Enter name of the city to : ");
        String toCity = scanner.nextLine();

        System.out.println("Enter the total distance: ");
        double distance = scanner.nextDouble();

     TravelDetails td = new TravelDetails(fromCity,toCity,distance);
     td.displayTravelInfo();
    }
}
