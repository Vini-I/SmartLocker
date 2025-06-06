package Stations;



public class Station {
    private int id;
    private int maxCapacity;
    private String address;

    public int getId() {
        return id;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public String getAddress() {
        return address;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Station(int id, int maxCapacity, String address) {
        this.id = id;
        this.maxCapacity = maxCapacity;
        this.address = address;
    }
}
