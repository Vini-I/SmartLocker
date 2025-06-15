/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Lockers;

/**
 *
 * @author rodol
 */
public enum LockerStatus {
    FREE ("Free"),
    BUSY ("Busy"),
    OUTOFSERVICE("Out of Service");
    
    private final String status;

    private LockerStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return status;
    }
    
    
}
