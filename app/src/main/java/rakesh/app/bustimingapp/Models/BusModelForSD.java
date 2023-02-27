package rakesh.app.bustimingapp.Models;

public class BusModelForSD {
    public BusModelForSD(){

    }
    private String busNumber,busSourceOrDestination;

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getBusSourceOrDestination() {
        return busSourceOrDestination;
    }

    public void setBusSourceOrDestination(String busSourceOrDestination) {
        this.busSourceOrDestination = busSourceOrDestination;
    }

    public BusModelForSD(String busNumber, String busSourceOrDestination) {
        this.busNumber = busNumber;
        this.busSourceOrDestination = busSourceOrDestination;
    }
}
