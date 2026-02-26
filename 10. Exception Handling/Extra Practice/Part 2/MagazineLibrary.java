
import java.util.ArrayList;

public class MagazineLibrary {
    
    private ArrayList<Magazine> magazines;

    public MagazineLibrary() {
        this.magazines = new ArrayList<>();
    }

    public Magazine getMagazine(int index) {
        String title = magazines.get(index).getTitle();
        String publisher = magazines.get(index).getPublisher();
        int issueNumber = magazines.get(index).getIssueNumber();
        int publicationYear = magazines.get(index).getPublicationYear();
        return new Magazine(title, publisher, issueNumber, publicationYear);
    }

    public void setMagazine(Magazine magazine, int index) {
        String title = magazine.getTitle();
        String publisher = magazine.getPublisher();
        int issueNumber = magazine.getIssueNumber();
        int publicationYear = magazine.getPublicationYear();
        Magazine updateMagazine = new Magazine(title, publisher, issueNumber, publicationYear);
        this.magazines.set(index, updateMagazine);
    }

        public void addMagazine(Magazine magazine) {
        String title = magazine.getTitle();
        String publisher = magazine.getPublisher();
        int issueNumber = magazine.getIssueNumber();
        int publicationYear = magazine.getPublicationYear();
        Magazine newMagazine = new Magazine(title, publisher, issueNumber, publicationYear);
        this.magazines.add(newMagazine);
    }

    

}
