public class Contact{
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    public Contact(Contact contact) {
         this.name = contact.name;
        this.phoneNumber = contact.phoneNumber;
        this.birthDate = contact.birthDate;
        this.age = contact.age;
    }

    public Contact(String name, String phoneNumber, String birthDate, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = age;
    }

    

    
}