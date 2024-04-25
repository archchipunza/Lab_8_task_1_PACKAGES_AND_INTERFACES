import java.util.Scanner;

public class Staff extends Person implements Salary {
    private String education;
    private String position;

    public void initialize1() {
        initialize();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter education: ");
        education = scanner.nextLine();
        System.out.print("Enter position: ");
        position = scanner.nextLine();
    }

    public void print1() {
        print();

        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }

    @Override
    public double chipunza59644salaryToPay(int hours, double rate) {
        return hours * rate;
    }
}