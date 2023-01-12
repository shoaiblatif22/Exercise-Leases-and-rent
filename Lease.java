public class Lease {



    private String tenantsName;
    private int aptNumber;
    private int rentAmount;
    private int leaseInMonths;
    private final double PET_FEE = 10.0;

    public Lease(){
        this("XXX", 0, 1000, 12);
    }


    public Lease(String name, int apt, int rent, int lease) {
        tenantsName = name;
        aptNumber = apt;
        rentAmount = rent;
        leaseInMonths = lease;


    }
    public void setTenantsName(String tenantsName){
        this.tenantsName = tenantsName;

    }

    public void setAptNumber(int aptNumber){
        this.aptNumber = aptNumber;

    }

    public void setRentAmount(int rentAmount){
        this.rentAmount = rentAmount;

    }
    public void setLeaseInMonths(int leaseInMonths){
        this.leaseInMonths = leaseInMonths;
    }

    public String getTenantsName() {
        return tenantsName;
    }

    public int getAptNumber() {
        return aptNumber;
    }

    public int getRentAmount() {
        return rentAmount;
    }

    public int getLeaseInMonths() {
        return leaseInMonths;
    }

    public String addPetFee(){
        double newRent = this.rentAmount + this.PET_FEE;
        String petPolicy = explainPetPolicy() + PET_FEE;
        return petPolicy;

    }
    public static String explainPetPolicy(){
        String expl = " Because you have a pet, the following amount has been added to your rent $";
        return expl;
    }


}

