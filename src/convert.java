import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the length in cm :");
        float cm =in.nextFloat();
        float inch=cm/2.54f;
        int feet=(int)inch/12;
        inch=inch%12;
        System.out.println(cm+"cm = "+feet+"ft "+inch+"inches");
    }
}
