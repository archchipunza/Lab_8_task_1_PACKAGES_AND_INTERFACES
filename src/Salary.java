public interface Salary {
    double chipunza59644salaryToPay(int hours, double rate);

    default double chipunza59644salaryForOvertime(int hours, double rate) {
        return hours * rate * 1.5;
    }

    static boolean chipunza59644shouldReceiveBonus(int yearsOfExperience) {
        return yearsOfExperience >= 5;
    }
}