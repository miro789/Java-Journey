// When class implement Interface, it needs to overide all the abstract method in that interface
public class ChildIClass implements ChildInterface{

    @Override
    public void getChildName() {

    }

    @Override
    public void sayHi() {

    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void getName() {

    }

    @Override
    public void printName() {
        ChildInterface.super.printName();
    }
}
