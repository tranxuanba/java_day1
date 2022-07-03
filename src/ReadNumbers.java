import java.util.Scanner;

public class ReadNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number;
        String t;
        String c;
        String d;
        System.out.println("moi nhap so can doc:");
        number = sc.nextLine();
        System.out.println(number + "  doc la:" +t+c+d);
            switch (t) {
//                case 0:
//                    System.out.println("khong");break;
                case "1":
                    System.out.println("mot tram");break;
                case "2":
                    System.out.println("hai tram");break;
                case "3":
                    System.out.println("ba tram");break;
                case "4":
                    System.out.println("bon tram");break;
                case "5":
                    System.out.println("nam tram");break;
                case "6":
                    System.out.println("sau tram");break;
                case "7":
                    System.out.println("bay tram");break;
                case "8":
                    System.out.println("tam tram");break;
                case "9":
                    System.out.println("chin tram");break;
                default:
                    System.out.println("out of ability");
            }
        switch (c) {
                case "0": if (t != "0") {
                    System.out.println("linh");break;
                }
            case "1":
                System.out.println("muoi");break;
            case "2":
                System.out.println("hai muoi");break;
            case "3":
                System.out.println("ba muoi");break;
            case "4":
                System.out.println("bon muoi");break;
            case "5":
                System.out.println("nam muoi");break;
            case "6":
                System.out.println("sau muoi");break;
            case "7":
                System.out.println("bay muoi");break;
            case "8":
                System.out.println("tam muoi");break;
            case "9":
                System.out.println("chin muoi");break;
            default:
                System.out.println("out of ability");
        }
        switch (d) {
            case "1":
                System.out.println("mot");break;
            case "2":
                System.out.println("hai");break;
            case "3":
                System.out.println("ba");break;
            case "4":
                System.out.println("bon");break;
            case "5":
                System.out.println("nam");break;
            case "6":
                System.out.println("sau");break;
            case "7":
                System.out.println("bay");break;
            case "8":
                System.out.println("tam");break;
            case "9":
                System.out.println("chin");break;
            default:
                System.out.println("out of ability");
        }
    }
}
