import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double usd;
        final Double rate = 23000d;
        System.out.println("moi nhap vao tien usd");
        usd = sc.nextDouble();
        System.out.println("so tien ra vnd la:" + rate * usd);
    }
}
