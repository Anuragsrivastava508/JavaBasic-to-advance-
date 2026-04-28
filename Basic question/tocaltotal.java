import java.util.*;
public class tocaltotal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Float pen = sc.nextFloat();
        Float pencil = sc.nextFloat();
        Float earser = sc.nextFloat();
        Float totalbill = pen + pencil + earser;
        System.out.println(totalbill);

        Float newTotal =totalbill+ (0.18f*totalbill);
        System.out.println("Bill with 18% tax : "+newTotal);
    }
}
