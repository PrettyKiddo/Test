import java.util.Scanner;
 class DoWhile {
    public static void main(String[] args) {
        Scanner w= new Scanner(System.in);
        int value;
        do{
            System.out.println("write 5");
            value = w.nextInt();

        } while(value!=5);


        System.out.println("Вы написали 5");


    }
}
