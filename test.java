import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Здраствуйте, как вас зовут?");
        String string = s.nextLine();
        System.out.println("Приятно познакомиться " + string);
        System.out.println("Как у вас дела?");
        string = s.nextLine();
        System.out.println("Понятно, а сколько вам лет?");
        int q = s.nextInt();
        System.out.println("Ого целых " + q);
    }
