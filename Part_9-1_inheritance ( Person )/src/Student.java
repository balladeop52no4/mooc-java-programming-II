public class Student extends Person{

    private int credit;

    Student(String name, String address){
        super(name, address);
        this.credit = credit;
    }

    public void study(){
        credit += 1;
    }

    public int credits(){
        return credit;
    }

    @Override
    public String toString(){
        return name + "\n" + "  " + address + "\n" + "  Study credits " + credit;
    }


}
