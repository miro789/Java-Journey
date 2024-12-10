package string;

public class StringCheck {
    public static void main(String[] args)
    {
        String s1 = "Welcome to the world"; // literal >> String pool
        // char charAt(int index)
        System.out.println(s1.charAt(0));

        // format(String format, Object... args)
        String name = "Messi";
        int age = 37;
        String s2 = String.format("Welcome %s is %d years old.", name, age);
        System.out.println(s2);

        // Substring
        String subs = s2.substring(1, 5);
        System.out.println(subs);

        // contains
        if (s2.contains("Messi"))
        {
            System.out.println("Hello, Messi");
        }
        else {
            System.out.println("Goodbye, Messi");
        }

        // Join

        // equal
        if (s1.equals("Welcome to the world")){
            System.out.println("Hello");
        }


    }
}
