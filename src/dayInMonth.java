import java.util.Scanner;

public class dayInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mow nhap vao so thang muon tra");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("thang 1 co 28 hoac 29 ngay");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("thang " + month + "co 30 ngay");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("thang " + month + "co 31 ngay");
                break;
            default:

        }
    }
}
