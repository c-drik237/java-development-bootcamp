public class Person {
    
    String name;
    String nationality;
    String dateOfBirth;
    String[] passport;
    int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        // set fields equal to parameters here.
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.seatNumber = seatNumber;
    }
 
}
