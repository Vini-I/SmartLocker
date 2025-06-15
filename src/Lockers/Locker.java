/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lockers;
import Packages.Package;
import Persons.User;

public class Locker {
    
    private int id;
    private LockerStatus status;
    private LockerSize size;
    private Package packageId;
    private User userId;

    public int getId() {
        return id;
    }

    public LockerStatus getStatus() {
        return status;
    }

    public LockerSize getSize() {
        return size;
    }

    public Package getPackageId() {
        return packageId;
    }

    public User getUserId() {
        return userId;
    }

    public void setStatus(LockerStatus status) {
        this.status = status;
    }

    public void setSize(LockerSize size) {
        this.size = size;
    }

    public Locker(int id, LockerSize size, LockerStatus status, Package packageId, User userId) {
        this.id = id;
        this.size = LockerSize.LARGE;
        this.status = LockerStatus.FREE;
        this.packageId = packageId;
        this.userId = userId;
    }
    

    @Override
    public String toString() {
        return "Locker: " + " Id: " + id + " Size: " + size + " Status: " + status + " Package Id: " + packageId + " User Id: " + userId;
    }
}
