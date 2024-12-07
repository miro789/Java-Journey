public class SampleOverloading {
    // Overloading: same name method, different parameters and different datatype

    // change numbers of arguments
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // change data types
    public float add(float a, float b)
    {
        return a + b;
    }

    public String print(){
        return "Hello World";
    }

    public String print(String name)
    {
        return "Hello " + name;
    }

    public String print(float value)
    {
        System.out.println("lala");
        return "Hi " + value;
    }


    // If the same method, same parameter, cannot return different datatype
//    public float print(float value)
//    {
//        System.out.println("lala");
//        return a + b;
//    }


}
