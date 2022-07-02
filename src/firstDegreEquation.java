import java.util.Scanner;


public class firstDegreEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double a;
        Double b;
        Double c;
        System.out.println("nhap vao a");
        a = scanner.nextDouble();
        System.out.println("nhap vao b");
        b = scanner.nextDouble();
        System.out.println("nhap vao c");
        c = scanner.nextDouble();
        if (a != 0) {
            Double x = (c - b)/a;
            System.out.println(x);
        }else {
            if (b == c) {
                System.out.println("phuong trinh vo so nghiem");
            }else {
                System.out.println("phuong trinh vo nghiem");
            }
        }
    }
}
