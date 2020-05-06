package learn2;

public class Casting {
    public static void main(String[] args) {
        int intValue = 128;
        float floatValue = intValue;
        double doubleValue = 128.87;
        long longValue = (int) doubleValue; //Wont round-off just cuts-off decimal part
        System.out.println(intValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(longValue);
        byte byteValue = (byte) intValue;
        System.out.println(byteValue); //prints wrong asnwer as input is more than the size of Byte

        //To get the min and max value that a data-type can support
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        //To round-off float or double

        System.out.println(Math.round(128.87));

        
        String s = new String();
        s+=35;


        int i=Integer.parseInt(s);
        System.out.println(i);

        String k = String.valueOf(25);
        System.out.println(k);

        byte b = 12;
        System.out.println(b);
    }
}