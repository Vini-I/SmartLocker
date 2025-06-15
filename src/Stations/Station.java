/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stations;
import Lockers.LockerSize;
import Lockers.LockerStatus;
import Lockers.Locker;

public class Station {
    
    private int id;
    //capacidad = cuantos Lockers tengo
    private int maxCapacity;
    private String location;
    private int Locker[];

    public int getId() {
        return id;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public String getLocation() {
        return location;
    }
    
      public int[] getLocker() {
        return Locker;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Station(int id, int maxCapacity, String location) {
        this.id = id;
        this.maxCapacity = maxCapacity;
        this.location = location;
        this.Locker = new int [maxCapacity];
    }
    
    public Locker addLocker(int id, LockerSize size) {
        if (id > 0){
            Locker locker = new Locker(id, size, LockerStatus.FREE,null,null);
            return locker;
        }
        return null;
    }
    
    public int countLockers(){
        int cont = 0;
        for (int i = 0; i < maxCapacity; i++) {
             if (Locker[i]!=0){
                cont++;
             }
        }
        return cont;
    }
    
    @Override
    public String toString() {
        return "Station Id: " + this.id + " Max package capacity: " + this.maxCapacity + " Location: " + this.location;
    }
}