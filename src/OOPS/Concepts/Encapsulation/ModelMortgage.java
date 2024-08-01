package OOPS.Concepts.Encapsulation;

public class ModelMortgage {


    private int principal;
    private int rateOfInterest;
    private int noOfYears;

    ModelMortgage(int principal, int rateOfInterest, int noOfYears){
        this.principal=principal;
        this.rateOfInterest=rateOfInterest;
        this.noOfYears=noOfYears;
    }

    public int getPrincipal() {
        return principal;
    }

    public void setPrincipal(int principal) {
        this.principal = principal;
    }

    public int getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(int rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public int getNoOfYears() {
        return noOfYears;
    }

    public void setNoOfYears(int noOfYears) {
        this.noOfYears = noOfYears;
    }


}
