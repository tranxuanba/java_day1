import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("moi nhap vao so nam");
        year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + "la nam nhuan");
                }else {
                    System.out.println(year + "khong la nam nhuan");
                }
            }
        }else {
            System.out.println(year + "khong la nam nhuan");
        }
    }
}
