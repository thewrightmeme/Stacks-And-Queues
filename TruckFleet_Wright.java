import java.util.*;
import java.util.concurrent.LinkedTransferQueue;


public class TruckFleet_Wright {
    private ArrayList<Truck_Wright> trucks;
    private final Queue<Package_Wright> packageQueue;
    public TruckFleet_Wright() {
        this.trucks = new ArrayList<>();
        this.packageQueue = new LinkedTransferQueue<>();
    }

    public void addTruck(Truck_Wright truck){
        trucks.add(truck);
    }
    public void addPackage(Package_Wright pkg){
        packageQueue.add(pkg);
        for(Truck_Wright truck : trucks){
          if(truck.getLocation().equals("Warehouse")){
                truck.loadPackage(pkg);
          }
        }
    }
    public void searchTruck(Truck_Wright area){
        for(Truck_Wright truck: trucks){
            if(truck.getLocation().equals("Warehouse")&&truck.getWeightCarrying()==0){
                System.out.println("Trucks for "+ area+ " is located");
            }
        }
        System.out.println("no available truck for that area");
    }
    public void searchPackage(String destinationAddress){
        for(Package_Wright pack: packageQueue){
            if(pack.getDestinoAddress().equals(destinationAddress)){
                System.out.println("Package found at " +pack.getDestinoAddress());
            }
        }
        System.out.println("Package not found with address: " + destinationAddress);
    }
//yuh
    public void declarePackageAsDelivered(String destinationAddress){
        for(Truck_Wright truck: trucks){
            if(truck.getLocation().equals(destinationAddress)){
                truck.deliverPackages();
            }
        }
    }
    public void setLocationWarehouse(Truck_Wright locationWarehouse){
        locationWarehouse.setLocation("Warehouse");
    }


    public Integer test(){
        return null;
    }
}
