import java.sql.SQLOutput;
import java.util.Scanner;

public class Experiments {
    public static void main(String[] args) {
        //Done on 8-9-18 // GitHub 8-10-18 first day
        String plants = "Butterfly flower is Yellow tips with Green Leafs";
        String trees = "Holly American is a medium size tree Evergreen leaf";
        String birds = "Red Bird, Blue Bird";
        String water = "Everything NEEDS water, for plants, trees, birds";
        String trim = "remove leading and trailing whitespace";
        String test = "test length";


        plants = plants.toUpperCase(); // String plants
        System.out.println("plants = " + plants);

        trees = trees.toLowerCase(); // String trees
        System.out.println("trees = " + trees);

        int index = water.indexOf("NEEDS"); //String water
        System.out.println("indexOf NEEDS = " + index);

        index = birds.lastIndexOf("Bird"); // String birds
        System.out.println("indexOf Blue Bird =" + index);

        boolean didItStartWith = water.endsWith("birds");  //String water
        System.out.println("didItStartWith =" + didItStartWith);

        boolean didItendsWith = water.endsWith("Everything"); //String water
        System.out.println("didItendsWith =" + didItendsWith);

        trim = "     l e a d i n g      ";
        System.out.println("trim = leading" + trim.trim() + ".");

        int x = test.length();
        System.out.println("The length of the test String is;" + x);
        index = test.indexOf('g');

        String myClass = "Java Programming Language";
        String newStr = myClass.replace('a', '_');
        System.out.println("newStr =" + newStr);
        newStr = myClass.replaceFirst("a", "_");
        System.out.println("newStr = " + newStr);

        int number;
        number = (int) (Math.random() * 10);  // generate # between 0 - 9
        number = (int) (Math.random() * 2);              // coin toss – 0 or 1
        number = (int) (Math.random() * 100) + 100;        // generate # between 100 - 199
        System.out.println("random" + number * 100);


        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a string ");
            String what = sc.nextLine();
            if (what.endsWith("."))
                break;
            System.out.println(what);
            System.out.println("Length = " + what.length());
            System.out.println("How many words? " + what.split(" ").length);
            System.out.println("Does it start with a X? " + what.startsWith("X"));
            System.out.println("Do you see a J in the phrase? " + what.contains("J") + " where was it " + what.indexOf("J"));
        }

    }
}
