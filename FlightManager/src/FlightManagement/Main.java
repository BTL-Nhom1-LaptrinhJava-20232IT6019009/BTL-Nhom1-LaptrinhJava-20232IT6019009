package FlightManagement;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException  {
        File accouFile = new File("account.txt") ;
        File flightFile = new File("flight.txt") ;
        accouFile.createNewFile();
        flightFile.createNewFile();
        new LoginForm().setVisible(true);
    }
}
