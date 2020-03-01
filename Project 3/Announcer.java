import java.util.*;
public class Announcer{



    public String display_Day(int x){
        return "Day: " + x;
    }
    //NEED A DAY TO GET ALL (MAYBE A LIST)
    public String display_Completerentals(Car car, Customer cust, int x){
        String lol = "Completed Rentals: " + x;

        return lol;
    }
    public String display_activeRentals(ArrayList<Rented> cur){
        String lol = "Active Rentals Count: " + cur.size() + "\\"; //Still need the print of list
        //String lol += inv.printlist
        return lol;
    }
    public String display_AvailableCars(ArrayList<Car> Ava){ //Better to add Availiblelist class then call funtion to add lol
        String lol = "Avalaible Car Count: " + Ava.size() + "\\List of Cars:\\";
        //String lol; nothing for now
        return "";
    }
    public String display_History(History hist){

        return "Cusuals in 35 days: " + hist.cusrented + "\\Business in 35 days : " + hist.busrented + 
        "\\Regulars in 35 days: " + hist.regrented + "\\Total in 35 days" + hist.rented + 
        "\\Total money made in 35 days: " + hist.revenue;
    }
    public String display_newday(){
        return "";
    }

}