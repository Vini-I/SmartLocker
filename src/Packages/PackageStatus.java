/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Packages;

/**
 *
 * @author rodol
 */
public enum PackageStatus {
    PENDING ("Pending"),
    DELIVERED ("Delivered"),
    COLLECTED("Collected");
    
    private final String status;

    private PackageStatus(String status) {
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
