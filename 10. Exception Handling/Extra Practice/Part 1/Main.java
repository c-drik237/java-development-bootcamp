public class Main {
    public static void main(String[] args) {
        Magazine magazine1 = new Magazine("Magazine 1", "Publisher 1", 1, 2020);
        System.out.println(magazine1.getTitle());
        
        
        // Uncomment the following line to test invalid input for setTitle method
        magazine1.setTitle("Jeune Afrique");
        System.out.println(magazine1.getTitle());
        
        
        // Uncomment the following line to test invalid input for setPublisher method
        magazine1.setPublisher("Edition Afrique");
        System.out.println(magazine1.getPublisher());
        
        
        // Uncomment the following line to test invalid input for setIssueNumber method
        magazine1.setIssueNumber(5);
        System.out.println(magazine1.getIssueNumber());
        
        
        // Uncomment the following line to test invalid input for setPublicationYear method
        magazine1.setPublicationYear(1995);
        System.out.println(magazine1.getPublicationYear());
        
        
        // Uncomment the following line to test invalid input for the constructor
        Magazine magazine2 = new Magazine("", "Publisher 2", -2, 2020);
    }
}