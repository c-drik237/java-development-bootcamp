import java.util.ArrayList;
import java.util.List;

public class Main {

    Person john = new Person("John", 30);
    Person amy = new Person("Amy", 28);
    Person sasha = new Person("Sasha", 29)
    
    
    List<Person> personList = new ArrayList<>();
    personList.add(john);
    personList.add(amy);
    personList.add(sasha);
                                             // target 
    boolean isPresent = personList.contains(new Person("John", 30)); 
    System.out.println(isPresent);
    
}
