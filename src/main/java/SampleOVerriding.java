public class SampleOVerriding extends SampleAbstractClass{
    @Override
    public void printName() {
        super.printName();
    }

    @Override
    public int calculate(int a, int b) {
        return super.calculate(a, b);
    }

    @Override
    public void sayHello() {

    }

    @Override
    public void getName() {
        super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void sayHi() {
        super.sayHi();
    }

    public SampleOVerriding() {
        super();
    }
}
