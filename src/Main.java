
public class Main {
    public static void main(String[] args) {

        ICEV icev = new ICEV();
        CombustionEngine engine1 = new CombustionEngine();
        Manufacture manufacture1 = new Manufacture();
        manufacture1.setModel("BMW");
        manufacture1.setYear(2000);
        manufacture1.setRegistrationNumber("321434234");

        icev.setManufacture(manufacture1);
        icev.setEngine(engine1);//polymorphism

        //////

        BEV bev = new BEV();
        ElectricEngine engine2 = new ElectricEngine();
        Manufacture manufacture2 = new Manufacture();
        manufacture2.setModel("BMW");
        manufacture2.setYear(2010);
        manufacture2.setRegistrationNumber("67834");

        bev.setManufacture(manufacture2);
        bev.setEngine(engine2);//polymorphism

        ////////

        HybridV hybridV = new HybridV();
        HybridEngine engine3 = new HybridEngine();
        Manufacture manufacture3 = new Manufacture();
        manufacture3.setModel("BMW");
        manufacture3.setYear(1999);
        manufacture3.setRegistrationNumber("86784");

        hybridV.setManufacture(manufacture3);
        hybridV.setEngine(engine3);//polymorphism

        Vehicle[] vehicles = new Vehicle[3];

        //using polymorphism
        vehicles[0] = icev;
        vehicles[1] = bev;
        vehicles[2] = hybridV;

        for(Vehicle v : vehicles)
        {
            v.ShowCharacteristics();
        }
    }
}