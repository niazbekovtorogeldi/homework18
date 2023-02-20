import java.net.http.HttpClient;

public class Main {
    public static void main(String[] args) {
       Hotel hotel = new Hotel(2,5000);
       Gostinisa gostinisa = new Gostinisa(3,4000,600);
       House house  = new House(5,700);
       Deictvie[]deictvies={hotel,gostinisa,house};
        for (Deictvie a:deictvies) {
            System.out.println(a.toString());

        }



    }
}