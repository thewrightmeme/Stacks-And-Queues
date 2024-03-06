public class Package_Wright {
    private double weight;
    private String destinoArea;
    private String destinoAddress;
    private String status;

    public Package_Wright(double weight, String destinoArea, String destinoAddress, String status){
        this.weight = weight;
        this.destinoArea = destinoArea;
        this.destinoAddress = destinoAddress;
        this.status = status;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getDestinoArea(){
        return destinoArea;
    }

    public void setDestinoArea(String destinoArea) {
        this.destinoArea = destinoArea;
    }

    public String getDestinoAddress(){
        return destinoAddress;
    }

    public void setDestinoAddress(String destinoAddress) {
        this.destinoAddress = destinoAddress;
    }
    public String getStatus(){
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "This package weighs " + weight +", its destination area is " + destinoArea +", its destination address is " + destinoAddress + ", and its current status is " + status + ".";
    }
}
