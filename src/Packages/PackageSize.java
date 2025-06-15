/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Packages;

/**
 *
 * @author rodol
 */
public enum PackageSize {
    
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");
    
    private final String size;

    private PackageSize(String size) {
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
