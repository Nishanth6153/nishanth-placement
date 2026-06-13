class Bus {

    private String busNo;
    private String currentLocation;
    private String lastStop;
    private int passengersIn;
    private int passengersOut;
    private int currentPassengers;

    public Bus(String busNo,
               String currentLocation,
               String lastStop) {

        this.busNo = busNo;
        this.currentLocation = currentLocation;
        this.lastStop = lastStop;
        this.currentPassengers = 0;
    }

    public void passengerEntry(int count) {
        passengersIn += count;
        currentPassengers += count;
    }

    public void passengerExit(int count) {
        passengersOut += count;
        currentPassengers -= count;
    }

    public void displayStatus() {

        System.out.println("\n========== BUS STATUS ==========");

        System.out.println("Bus Number          : " + busNo);
        System.out.println("Current Location    : " + currentLocation);
        System.out.println("Last Stop           : " + lastStop);

        System.out.println("Passengers In       : " + passengersIn);
        System.out.println("Passengers Out      : " + passengersOut);

        System.out.println("Current Passengers  : "
                + currentPassengers);

        System.out.println("================================");
    }
}

public class BusManagementSystem {

    public static void main(String[] args) {

        Bus bus = new Bus(
                "TN-40-N-6153",
                "London",
                "Coimbatore");

        bus.passengerEntry(25);
        bus.passengerExit(8);

        bus.displayStatus();
    }
}


