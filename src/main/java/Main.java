public class Main {
    public static void main(String[] args) {
        Highway highway = new Highway();
        highway.vehicleEntry("GA 123", CarType.OSOBOWY);
        highway.vehicleEntry("GD 123", CarType.CIEZAROWY);
        highway.vehicleEntry("WA 777", CarType.MOTOCYKL);

        highway.searchVehicle("ZZZ", CarType.MOTOCYKL);
        highway.searchVehicle("GD 123", CarType.CIEZAROWY);


    }

}


