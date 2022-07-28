public class PersonMain {
  
    public static void main(String[] args) {
 
        Person person = new Person("Arnesh Das", "Indian", "08/05/2009", 5);
 
        if (person.applyPassport() == true) {
            person.setPassport();
        }
 
        System.out.println(person);
    }
  
}
