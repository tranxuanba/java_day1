import java.util.Scanner;

public class BodyMass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double weight, height, bmi;
        System.out.println("moi nhap vao can nang");
        weight = sc.nextDouble();
        System.out.println("moi nhap vao chieu cao");
        height = sc.nextDouble();
        System.out.println("chi so bmi la:");
        bmi = weight/(height * height);
        if (bmi < 18) {
            System.out.println("Underweight");
        }else {
            if (bmi < 25) {
                System.out.println("Normal");
            }else {
                if (bmi < 30) {
                    System.out.println("Overweight");
                }else {
                    System.out.println("Obese");
                }
            }
        }
    }
}
