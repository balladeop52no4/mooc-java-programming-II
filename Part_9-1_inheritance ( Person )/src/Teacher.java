public class Teacher extends Person{

    private double salary;

    Teacher(String name, String address, double salary){
        super(name, address);
        this.salary = salary;
    }


    @Override
    public String toString(){
        return name + "\n" + "  " + address + "\n" + "  salary  " + salary + " euro/month";
    }


}
