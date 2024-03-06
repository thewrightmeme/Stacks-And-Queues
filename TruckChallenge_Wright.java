public class TruckChallenge_Wright {
    public static void main(String[] args) {
        TruckFleet_Wright warehouse = new TruckFleet_Wright();
        Truck_Wright truck1 = new Truck_Wright(15,200,"Freehold");
        Truck_Wright truck2 = new Truck_Wright(7,100,"Manalapan");
        Truck_Wright truck3 = new Truck_Wright(2,75,"Colts Neck");
        Truck_Wright truck4 = new Truck_Wright(25,300,"Howell");
        Truck_Wright truck5 = new Truck_Wright(21,250,"Marlboro");

        warehouse.addTruck(truck1);
        warehouse.addTruck(truck2);
        warehouse.addTruck(truck3);
        warehouse.addTruck(truck4);
        warehouse.addTruck(truck5);

        Package_Wright package1 = new Package_Wright(20,"Manalapan","101 Road St","Delivered");
        Package_Wright package2 = new Package_Wright(100,"Manalapan", "300 Street Rd","Delivered");
        Package_Wright package3 = new Package_Wright(150, "Freehold", "32 Avenue Rd","Delivered");
        Package_Wright package4 = new Package_Wright(10, "Freehold", "1 Main St","Delivered");
        Package_Wright package5 = new Package_Wright(15, "Freehold", "15 Temple Rd","Delivered");
        Package_Wright package6 = new Package_Wright(16, "Freehold", "3 My Rd","Delivered");
        Package_Wright package7 = new Package_Wright(1,"Marlboro", "4 Goldstein Way","Delivered");
        Package_Wright package8 = new Package_Wright(15,"Marlboro", "15 Goldstein Way","Delivered");
        Package_Wright package9 = new Package_Wright(35,"Freehold", "53 CompSci Ct","Delivered");
        Package_Wright package10 = new Package_Wright(54,"Marlboro","32 ColtsNeck Rd","Delivered");

        warehouse.addPackage(package1);
        warehouse.addPackage(package2);
        warehouse.addPackage(package3);
        warehouse.addPackage(package4);
        warehouse.addPackage(package5);
        warehouse.addPackage(package6);
        warehouse.addPackage(package7);
        warehouse.addPackage(package8);
        warehouse.addPackage(package9);
        warehouse.addPackage(package10);

        System.out.println("The locaton of truck 1 is: " + truck1.getLocation());
        System.out.println("The locaton of truck 2 is: " + truck2.getLocation());
        System.out.println("The locaton of truck 3 is: " + truck3.getLocation());
        System.out.println("The locaton of truck 4 is: " + truck4.getLocation());
        System.out.println("The locaton of truck 5 is: " + truck5.getLocation());

        warehouse.declarePackageAsDelivered("Freehold");
        warehouse.declarePackageAsDelivered("Manalapan");
        warehouse.declarePackageAsDelivered("Colts Neck");
        warehouse.declarePackageAsDelivered("Howell");
        warehouse.declarePackageAsDelivered("Marlboro");

        warehouse.test();

        System.out.println(package1.getStatus());
        System.out.println(package2.getStatus());
        System.out.println(package3.getStatus());
        System.out.println(package4.getStatus());
        System.out.println(package5.getStatus());
        System.out.println(package6.getStatus());
        System.out.println(package7.getStatus());
        System.out.println(package8.getStatus());
        System.out.println(package9.getStatus());
        System.out.println(package10.getStatus());


    }
}
