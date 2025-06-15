/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Lockers;

/**
 *
 * @author rodol
 */
public enum LockerSize {
    
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");
    
    private final String size;

    private LockerSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return size;
    }
}
