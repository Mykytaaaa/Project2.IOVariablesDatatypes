import java.util.Scanner;

public class Dialog {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ask the data
        System.out.println("Enter your name, please");
        String name = input.nextLine();
        System.out.println("And lastname");
        String lastname = input.nextLine();
        System.out.println("How old are you?");
        int age = input.nextInt();
        System.out.println("Are you a student (true/false)?");
        boolean student = input.nextBoolean();
        boolean teacher = false;
        String studentProgram = "";
        if (!student) {
            System.out.println("Are you a teacher then (true/false)?");
            teacher = input.nextBoolean();
        }
        else {
            System.out.println("Which program are you in?");
            input.nextLine();
            studentProgram = input.nextLine();
        }

        System.out.println("Where do you live?");
        String city = input.nextLine();
        System.out.println("What's your e-mail?");
        String email = input.nextLine();
        System.out.println("What's your phone?");
        String phone = input.nextLine();
        System.out.println("Do you have any pets (true/false)?");
        boolean haspets = input.nextBoolean();
        input.nextLine();
        System.out.println("Why AUK?");
        String whyAUK = input.nextLine();

        input.nextLine();

        //Show the results
        System.out.println("Name");
        System.out.println(name);
        System.out.println("Lastname");
        System.out.println(lastname);
        System.out.println("You are " + age + " years old");

        if (teacher) {
            System.out.println("You are a teacher");
        }
        else {
            System.out.println("You are a student of the " + studentProgram + " program");
        }

        System.out.println("You live in " + city);

        if (phone.startsWith("+")) {
            System.out.println("Your phone is " + phone);
        }
        else {
            System.out.println("Your phone is incorrect");
        }

        if (email.contains("@")) {
            System.out.println("You e-mail is " + email);
        }
        else {
            System.out.println("Your e-mail is incorrect");
        }

        if (haspets) {
            System.out.println("You have pets");
        }
        else {
            System.out.println("You don't have pets");
        }

        System.out.println("You have chosen AUK because " + whyAUK);

        System.out.println();
        System.out.println("Thanks!");
    }
}
