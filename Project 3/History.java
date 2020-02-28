public class History{
    int rented = 0;
    int cusrented = 0;
    int busrented = 0;
    int regrented = 0;
    int revenue = 0;

    void addCus(){
        rented++;
        cusrented++;
    }

    void addBus(){
        rented++;
        busrented++;
    }

    void addReg(){
        rented++;
        regrented++;
    }

    void addRev(int rev){
        revenue += rev;
    }

    void getHistory(){
        // SEND TO ANNOUNCER
    }

}