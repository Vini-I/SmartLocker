/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons;
import Packages.Package;

public class User extends Person {
    
    private String phoneNumber;
  
            // valida el numero con el que inicia y 7 digitos mas
    private static final String phoneRegex = "^[245678]\\d{7}$";
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    // validar con Regex que sea como un numero de telefono de CR
    public void setPhoneNumber(String phoneNumber){
        if (validatePhone(phoneNumber)){
            this.phoneNumber = phoneNumber;
        }
    }
    
    private static boolean validatePhone(String phoneNumber){
        return phoneNumber.matches(User.phoneRegex);
    }
    
    public User (int id, String name, String phoneNumber, String email){
        super(id,name,email);
        if (validatePhone(phoneNumber)){
            this.phoneNumber = phoneNumber;
        }
    }
    
    public boolean retirarPackage(int id, Package pck) {
        if (id > 0) {
            if (id == pck.getId()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString (){
        return "User: " + super.toString() + " Phone Number: " + this.phoneNumber;
    }       
            
}
