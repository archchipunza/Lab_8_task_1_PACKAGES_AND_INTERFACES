public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff();

        staff.initialize1();

        staff.print1();

        int hours = 40;
        double rate = 20.0;
        double salary = staff.chipunza59644salaryToPay(hours, rate);
        System.out.println("Salary to pay: " + salary);

        double overtimeSalary = staff.chipunza59644salaryForOvertime(10, 30.0);
        System.out.println("Overtime salary: " + overtimeSalary);

        int yearsOfExperience = 7;
        boolean shouldReceiveBonus = Salary.chipunza59644shouldReceiveBonus(yearsOfExperience);
        System.out.println("Should receive bonus: " + shouldReceiveBonus);
    }
}