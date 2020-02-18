import java.util.Scanner;

class take_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Your name is: " + name);
    }
}
