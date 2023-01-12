import java.util.Scanner;

public class TestLease {
    static String tenantsName;
    static int aptNumber;
    static int rentAmount;
    static int leaseInMonths;


    public static void main(String[] args) {
        Lease lease1 = getData();
        showValues(lease1);

        Lease lease2 = getData();
        showValues(lease2);

        Lease lease3 = getData();
        showValues(lease3);
        lease3.addPetFee();
        showValues(lease3);

        Lease lease4 = new Lease();
        showValues(lease4);

    }

    public static void showValues(Lease ls)
    {
        System.out.println("\n\nYour lease results:" +
                "\nName      : " + ls.getTenantsName() +
                "\nApartment : " + ls.getAptNumber() +
                "\nRent      : " + ls.getRentAmount() +
                "\nTerm      : " + ls.getLeaseInMonths() + "\n");
    }

    public static Lease getData() {
        Lease sample = new Lease();

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String sampleName = userInput.nextLine();
        sample.setTenantsName(sampleName);

        System.out.println("Please enter your apartment number:");
        int sampleAptNumber = userInput.nextInt();
        sample.setAptNumber(sampleAptNumber);

        System.out.println("Please enter your monthly rent amount:");
        double sampleRent = userInput.nextDouble();
        sample.setRentAmount((int) sampleRent);

        System.out.println("Please enter the term of your lease in months:");
        int sampleTerm = userInput.nextInt();
        sample.setLeaseInMonths(sampleTerm);
        userInput.nextLine();

        return sample;
/*
        Lease firstLease = new Lease();
        Lease secondLease = new Lease();
        Lease thirdLease = new Lease();
        Lease fourthLease = new Lease();

        firstLease = getdata(firstLease);
        secondLease = getdata(secondLease);
        thirdLease = getdata(thirdLease);

        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter tenants name >>");
        tenantsName = keyboard.nextLine();
        System.out.println("Enter apartment number >>");
        aptNumber = keyboard.nextInt();
        System.out.println("Enter rent amount >> ");
        rentAmount = keyboard.nextInt();
        System.out.println("Enter the number of months for lease >>");
        leaseInMonths = keyboard.nextInt();




    }

    private static Lease getdata(Lease firstLease) {

        return firstLease;
    }

    public static void showValues(Lease lease)
    {
        System.out.println("Lease name " + lease.getTenantsName());
        System.out.println("Lease apartment number " + lease.getAptNumber());
        System.out.println("Lease rent " + lease.getRentAmount());
        System.out.println("Lease term " + lease.getLeaseInMonths());




    }

*/
    }
}
