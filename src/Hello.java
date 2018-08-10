import jdk.nashorn.api.tree.NewTree;

import java.util.Date;

public class Hello {

//    public String substring(int beginIndex,
//                            int endIndex)
    /*
    this module was created as sample code
    for the Summer Java class in 2018
    */
    //notes for me(Vickey) Variable Types - Primitives are
    // int = are whole numbers 1, 0, 42, -199, 2000000
    // Floating Point (float) = decimal numbers, Also float (32-bit) and double (64-bit)
    // Boolean = is it TURE or FALSE ....just one choose
    // Text = any single character 'a', 'b', '9' '_', (One type (char) only
    // Underscore (_) can be used to replace commas in numbers 5,235 (USED this way 5_235)

    // \t	Insert a tab in the text at this point.
    // \b	Insert a backspace in the text at this point.
    // \n	Insert a newline in the text at this point.
    //  \r	Insert a carriage return in the text at this point.
    // \f	Insert a formfeed in the text at this point.
    // \'	Insert a single quote character in the text at this point.
    //    \"	Insert a double quote character in the text at this point.
    //   \\	Insert a backslash character in the text at this point.


    public static void main(String[] args) {//message in code... not seen in console
        System.out.println("Hello Victoria");
        System.out.println("Java 1st Day of Class");
        System.out.println("The current date is " + new Date()); //Starts with the double forward slashes and ends here

        int age;
        Date today;
        String myName;
        float bodyTemp;

        age = 56;
        today = new Date();
        myName = "M R Victoria";
        bodyTemp = 98.6f;
        boolean isLightOn = true;
        System.out.println("My name is " + myName + " my age is " + age + " and today is: " + today);

        int year;
        Date time;
        String myLast;

        year = 2018;
        time = new Date();
        myLast = "Rodela";
        System.out.println("My last name is " + myLast + " this is true " + time + " What a year, " + year);

        long hour;
        short height;
        double day;
        String worked;

        hour = 12;
        height = 5;
        day = 6;
        System.out.println("I've worked for " + hour + " hour days " + height + " days a week, starting at " + day + "am");

        int press;
        Date Hour;
        String NewsTimes;

        press = 2018;
        Hour = new Date();
        NewsTimes = "Paper";
        System.out.println("News Print " + NewsTimes + " true the date and time is true " + Hour + " Morning 6AM, " + press);

        System.out.println("year = " + year); //soutv = system.outprinIn("last system printout")
        System.out.println("She said \"Hello!\" to me."); // backslash will help use a double quote in the string
        System.out.println("She said \n \t \"Hello!\" to me"); // \n insert a newline in the text \t insert a tab in the text

        int tall = 5;
        System.out.println("My height is " + tall + " feet tall");

        int address = 4000;
        System.out.println("My address is " + address + " N Crump");

        byte youth = 56;
        System.out.println("My age is " + youth);

        double pi = Math.PI;
        System.out.println("What is PI " + pi);
        int number = 4;
        System.out.println("Math" + number);

        char character = 'M';
        System.out.println("My middle initial is " + character);
        System.out.println("my middle name start with " + character + ", My height is " + tall + " feet tall, " + "my age is " + youth + ", i live at " + address + " N Crump");

//        String substring(int beginIndex);
//        "unhappy".substring(2) returns "happy";
//        "Harbison".substring(3) returns "bison";
//        "emptiness".substring(9) returns "" (an empty string);
//
//        String substring(int beginIndex,;
//        int endIndex);
//        "hamburger".substring(4, 8) returns "urge";
//        "smiles".substring(1, 5) returns "mile";
//
//        String concat(String str);
//        "cares".concat("s") returns "caress";
//        "to".concat("get").concat("her") returns "together";
//
//        String replace(char oldChar,
//        char newChar)
//        "mesquite in your cellar".replace('e', 'o');
//        returns "mosquito in your collar";
//        "the war of baronets".replace('r', 'y');
//        returns "the way of bayonets"
//        "sparring with a purple porpoise".replace('p', 't');
//        returns "starring with a turtle tortoise";
//        "JonL".replace('q', 'x') returns "JonL" (no change);

        int texasPopulation = 27_470_000;
        int texasArea = 268_830;
        int earthRadius = 6_371;
        System.out.println("What underscore does" + texasPopulation + texasArea + earthRadius);



    }
}
