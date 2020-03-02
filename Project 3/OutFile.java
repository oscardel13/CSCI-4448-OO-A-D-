import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OutFile {
    File file;
    PrintWriter pw;
    public OutFile(){
        try{
            //file = new File("Project 3/P3Out");
            //^^^ for Oscars end, vvv for Colins end
            file = new File("P3Out");
            pw = new PrintWriter(file);
            LocalDateTime datet = LocalDateTime.now();
            DateTimeFormatter datef = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String date = datet.format(datef);
            file.createNewFile();
            pw.println("Oscar Delgado and Colin Murphy Project 3");
            pw.println("Update: " + date + "\r\n");

        } catch (IOException e){
            System.out.println("Error with out file");
        }
    }

    public void printOut(String st){
        pw.println(st);
    }


    public void stopWriting(){
        pw.close();
    }
}