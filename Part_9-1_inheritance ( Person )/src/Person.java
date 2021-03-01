public class Person {

    String name;
    String  address;

    Person(String name, String address){
        this.name = name;
        this.address= address;
    }


    @Override
    public String toString(){
        return name + "\n" + "  " + address;
    }
}
