import java.sql.SQLOutput;
import java.util.Date;

public class Assignment5 { // did quiz 5 on Aug 8 2018
    public static void main(String[] args) {

        String[] classNames = new String[4];
        classNames[0] = "Jayme";
        classNames[1] = "Arianne";
        classNames[2] = "Samuel";
        System.out.println(classNames[2]);
        int[] myNumbers = new int[19];
        float[] myFloats = new float[30];
        long[] myLongs = new long[19];
        double[] myMoney = new double[11];

        String[] str = new String[4];
        str[0] = "Jayme";
        str[1] = "Arianne";
        str[2] = "Samuel";
        System.out.println("student in class is " + str[0]);
        System.out.println("student in class is " + str[1]);
        System.out.println("student in class is " + str[2]);

        int[] myarray = new int[20];
        myarray[5] = 5;
        myarray[10] = 10;
        myarray[15] = 15;
        myarray[19] = 20;
        System.out.println("is " + myarray[15]);

        float[] dollar = new float[30];
        dollar[5] = 5;
        dollar[10] = 10;
        dollar[15] = 15;
        dollar[20] = 20;
        System.out.println("my array " + dollar[10]);

        float[] myfloats = new float[30];
        myFloats[0] = 99.99f;
        myFloats[myFloats.length - 1] = 99.99f;

        for (int x = 0; x < classNames.length; x++)
            x = 15;

    }
}
