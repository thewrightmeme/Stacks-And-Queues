import java.util.*;

public class Truck_Wright {
    private int maxCapacity;
    private int maxWeight;
    private Stack<Package_Wright> load;
    private String location;

    public Truck_Wright(int maxCapacity, int maxWeight, String location){
        this.maxCapacity = maxCapacity;
        this.maxWeight = maxWeight;
        this.load= new Stack<>();
        this.location = location;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public void setMaxCapacity(int maxCapacity){
        this.maxCapacity = maxCapacity;
    }
    public int getMaxCapacity(){
        return maxCapacity;
    }
    public void setMaxWeight(int maxWeight){
        this.maxWeight = maxWeight;
    }
    public int getMaxWeight(){
        return maxWeight;
    }
    public int getNumPackages(){
        return load.size();
    }

    //create variable to keep track of weight
    public double getWeightCarrying(){
        double totalWeight = 0;
        for(Package_Wright getDaWeight: load){
            totalWeight += getDaWeight.getWeight();
        }
        return totalWeight;
    }
    public  void loadPackage(Package_Wright randomPackage){
        load.push(randomPackage);
    }
    public void unloadPackage(){
        load.peek();
        load.pop();
    }
    public void deliverPackages(){
        while(!load.isEmpty()){
            Package_Wright pack = load.pop();
            pack.setStatus("Delivered");
            System.out.println("Package delivered to: " + pack.getDestinoAddress());
        }
        location = "Warehouse";
    }
    public boolean isFull(){
        return getNumPackages() >= maxCapacity||getWeightCarrying() >= maxWeight;
    }

}
