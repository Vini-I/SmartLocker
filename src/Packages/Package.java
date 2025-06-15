/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Packages;

/**
 *
 * @author rodol
 */
public class Package {
    private int id;
    private PackageStatus status;
    private PackageSize size;
    private String remitter;
    
    public int getId(){
        return id;
    }

    public PackageStatus getStatus() {
        return status;
    }

    public PackageSize getSize() {
        return size;
    }
    
    public String getRemitter(){
        return remitter;
    }

    public void setStatus(PackageStatus status) {
        this.status = status;
    }

    public void setSize(PackageSize size) {
        this.size = size;
    }
    
    //Metodo constructor de la clase
    public Package(int id, PackageSize size, PackageStatus status,  String remitter){
        this.id = id;
        this.size = PackageSize.LARGE;
        this.status = PackageStatus.PENDING;
        this.remitter = remitter;
    }
    
    @Override
    public String toString(){
        return "Package: " + " Id: " + id + " Size: " + size + " Status: " + status + " Remitter: " + remitter;
    }
}
