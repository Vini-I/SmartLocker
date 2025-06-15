/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons;

/**
 *
 * @author rodol
 */
public class Technician extends Person{
    
    private String speciality;
    
    public String getSpeciality(){
        return speciality;
    }
    
    public void setSpeciality(String speciality){
        this.speciality = speciality;
    }

    public Technician(String speciality, int id, String name, String email) {
        super(id, name, email);
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Technician: " + super.toString() +  " Speciality: " + speciality;
    }
    
    
    
}
