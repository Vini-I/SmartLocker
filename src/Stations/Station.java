 package Stations;

import Lockers.Locker;

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
    
    public Locker addLocker(int id, int size) {
        if (id > 0) {
            if (size <= 3 && size >= 1) {
                Locker locker = new Locker(id, size);
                return locker;
            }
        }
        return null;
    }
    
    public String toString() {
        return "\nStation:\nId: " + this.id + "\nMax package capacity: " + this.maxCapacity + "\nAddress: " + this.address;
    }
}
