package wk3personproject;

/**
 * @author lhebe
 */
public class Person implements Weighable {
    private String firstName;
    private String lastName;
    private int age;
    private double weight = 0;
    private double accChange = 0;
    private int idNumber;
    
    static int personNumber = 0;
    
    public Person(){};
   
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        personNumber ++;
        this.idNumber = personNumber;
    }
    
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        personNumber ++;
        this.idNumber = personNumber;
    }
    
    public Person(String firstName, String lastName, int age, double startWeight){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = startWeight;
        personNumber ++;
        this.idNumber = personNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    @Override
    public void addWeight(double pounds){
        this.weight += pounds;
        this.accChange += pounds;
    }
    
    @Override
    public void loseWeight(double pounds){
        this.weight -= pounds;
        this.accChange -= pounds;
    }
    
    @Override
    public String toString(){
        String str;
        str = "Name: " + firstName
                + " " + lastName
                + "\tage: "+ age
                + "\tID: " + idNumber
                + "\tWeight: " + weight
                + "\tnet change: " + accChange;
        
        return str;
    }
}
