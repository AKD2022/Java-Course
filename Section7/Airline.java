public class Airline {
    
    Person[] seats;

    public void setSeats(Person[] seats) {
        this.seats = new Person[11];
    }

    public Person getPerson(int index){
        return new Person(this.seats[index]);
    }
    
    public void setPerson(Person person){
        this.seats[person.getSeatNumber() - 1] = new Person(person);
    }

}
