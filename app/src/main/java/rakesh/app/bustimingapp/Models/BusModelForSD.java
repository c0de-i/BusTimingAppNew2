package rakesh.app.bustimingapp.Models;

public class BusModelForSD {
    public BusModelForSD(){

    }
    private String busNumber,busSourceOrDestination,busDestinationOrSource;

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

    public String getBusDestinationOrSource() {
        return busDestinationOrSource;
    }

    public void setBusDestinationOrSource(String busDestinationOrSource) {
        this.busDestinationOrSource = busDestinationOrSource;
    }

    public BusModelForSD(String busNumber, String busSourceOrDestination, String busDestinationOrSource) {
        this.busNumber = busNumber;
        this.busSourceOrDestination = busSourceOrDestination;
        this.busDestinationOrSource = busDestinationOrSource;
    }
}
