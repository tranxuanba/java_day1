import java.util.Scanner;

public class Wellcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ten cua ban");
        String name = sc.nextLine();
        System.out.println("xin chao " + name);
    }
}
