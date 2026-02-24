public class Main {

    public static void main(String[] args) {

        Contact contact1 = new Contact("Alice", "123-456-7890", "1990-01-01");
        Contact contact2 = new Contact("Bob", "234-567-8901", "1992-02-02");
        Contact contact3 = new Contact("Charlie", "345-678-9012", "1994-03-03");
        Contact cedric = new Contact("David", "456-789-0123", "1995-09-02");
        Contact copyContact1 = new Contact(contact1);
        Contact copyContact2 = new Contact(contact3);
        System.out.println(cedric.getAge());
    
    }

}
