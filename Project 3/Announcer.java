import java.util.*;
public class Announcer{

    public String display_Day(int x){
        return "Day: " + x;
    }
    //NEED A DAY TO GET ALL (MAYBE A LIST)
    public String display_Completerentals(ArrayList<Rented> cur){
        String lol = "Complete Rentals: " + cur.size() + "\r\nComplete Rentals List\r\n"; 
        for(Rented rec:cur)
            lol += "Car Type: " + rec.car.getClass().getName() + " Rented by: " + rec.client.name + " Licence Plate: " + rec.car.Licence + "\r\n"; 
        return lol;
    }
    public String display_activeRentals(ArrayList<Rented> cur){
        String lol = "Active Rentals Count: " + cur.size() + "\r\nActive Rentals List\r\n"; 
        for(Rented rec:cur)
            lol += "Car Type: " + rec.car.getClass().getName() + " Rented by: " + rec.client.name + " Licence Plate: " + rec.car.Licence + "\r\n"; 
        return lol;
    }
    public String display_AvailableCars(ArrayList<Car> Ava){ //Better to add Availiblelist class then call funtion to add lol
        String lol = "Avalaible Car Count: " + Ava.size() + "\r\nList of Cars:\r\n";
        for(Car car:Ava)
            lol += car.Licence + "\r\n";
        return lol;
    }
    //DONE, THIS PRINTS THE CUSTOMERS THAT CAME IN AND THE REVENUE MADE
    public String display_History(History hist){

        return "Casuals in 35 days: " + hist.cusrented + "\r\nBusiness in 35 days : " + hist.busrented + 
        "\r\nRegulars in 35 days: " + hist.regrented + "\r\nTotal in 35 days: " + hist.rented + 
        "\r\nTotal money made in 35 days: " + hist.revenue;
    }
    public String display_todayrevenue(Double i){
        return "Revenue for today: " + i + "\r\n \r\n";
    }
    public String display_newday(int i){
        return "Day: " + i + "\r\n";
    }

}