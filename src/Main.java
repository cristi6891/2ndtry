public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        int y = 2;
        int z = --y;
        double x = 3 + 6 * z;
        System.out.println(x);

        String firstName = "Maria";
        String lastName = "Georgescu";
        System.out.println(firstName + lastName);

        firstName += lastName;
        System.out.println(firstName);


        if (100 % 10 == 0)
            System.out.println("test");

        int t = 10;
        int f = 10;
        for (int i = 0; i < 10; i++) {

            System.out.println("post++ " + t++);
            System.out.println("pre++ " + ++f);
        }

        boolean a = true;
        boolean b = !a;
        System.out.println(b);


        if (!true) {
            System.out.println("hello");
        } else {
            System.out.println("it was false!");
        }


        int counter = 0;
        for (int i = 0; i < 5; i++) {
            counter++;
            if (counter >= 3) {
                System.out.println("user is not allowed to...");
            }
        }

    }
}