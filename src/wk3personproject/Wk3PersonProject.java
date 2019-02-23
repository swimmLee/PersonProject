package wk3personproject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lhebe
 */
public class Wk3PersonProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Person> crew = new ArrayList<>();
        
        crew.add(new Person("Lee","Jones"));
        crew.get(0).setWeight(150);
        crew.get(0).addWeight(3.5);
        crew.get(0).loseWeight(5.1);
        crew.get(0).setAge(45);
        
        crew.add(new Person("Mark","Dow", 32));
        crew.get(1).setWeight(175);
        crew.get(1).addWeight(10.5);
        crew.get(1).loseWeight(5.1);
        
        crew.add(new Person("Jon","David", 27, 204));
        crew.get(2).addWeight(10.5);
        crew.get(2).loseWeight(5.1);
        crew.get(2).loseWeight(2.0);
        
        crew.add(new Person());
        crew.get(3).setFirstName("Bill");
        crew.get(3).setLastName("Quinn");
        crew.get(3).setWeight(186);
        crew.get(3).addWeight(10.5);
        crew.get(3).addWeight(.5);
        crew.get(3).loseWeight(5.1);
        crew.get(3).loseWeight(2.0);
        
        for(int count=0; count < crew.size(); count++){
            System.out.println(crew.get(count));
            //System.out.println("\n");
        }
        
    }
    
}
