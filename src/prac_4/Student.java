package prac_4;

public class Student extends Person implements CanHaveParty, Movable{

    public Student(String name){
        super(name);
    }

    @Override
    public void move(){
        System.out.println(name + "is movfing to the part");
    }

    @Override
    public void dance(){
        System.out.println(name + "is dancing!");
    }


}
