import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Здраствуйте, как вас зовут?");
        String username = s.nextLine();
        System.out.println("Приятно познакомиться "+username);
        System.out.println("Как у вас дела?");
        String userfeeling = s.nextLine();
        System.out.println("Понятно, а сколько вам лет?");
        int userage = s.nextInt();
        System.out.println("Ого целых "+userage);

    }
}
