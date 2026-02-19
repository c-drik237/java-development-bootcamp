
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person cedric = new Person();
        System.out.println(cedric.name);
        System.out.println(cedric.nationality);
        System.out.println(cedric.dateOfBirth);
        System.out.println(cedric.passport);
        System.out.println(cedric.seatNumber);

        cedric.name = "Cedric Kamdem";// a String
        cedric.nationality = "Camerounais"; // a String
        cedric.dateOfBirth = "02/09/1995";// a String
        cedric.passport = new String[] {"CK", "Makaya"}; // Array that stores: {person.name, person.nationality, person.dateOfBirth}
        cedric.seatNumber = 24; // an Integer

        System.out.println(cedric.name);
        System.out.println(cedric.nationality);
        System.out.println(cedric.dateOfBirth);
        System.out.println(Arrays.toString(cedric.passport));
        System.out.println(cedric.seatNumber);
        
        
    }
}
