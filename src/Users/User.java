package Users;

import Packages.Package;

public class User {
    private int id;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getEmail(){
        return email;
    }
    
    //Agregar metodos set
    
    //Tarea, hacer una funcion que valide el formato de un numero telefonico costarrisence. USAR REGEX
    public void setPhone(String phone) {
        if (verifyPhone(phone)) {
            this.phoneNumber = phone;
        }
    }
    
    public static boolean verifyPhone(String phone) {
        String regex = "^[245678]\\d{7}$";
        return phone.matches(regex);
    }
            
    public void setAdress(String address) {
        this.address = address;
    }
    
    //Tarea, hacer una funcion que valide que el formato del correo electronico. USAR REGEX
    public void setEmail(String email) {
        if (verifyEmail(email)) {
            this.email = email;
        }
    }
    
    public static boolean verifyEmail(String email) {
        String regex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(regex);
    }

    public User (int id, String name, String address, String phoneNumber, String email){
        this.id = id;
        this.name = name;
        this.address = address;
        if (verifyPhone(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        }
        if (verifyEmail(email)) {
            this.email = email;
        }
    }
    
    public boolean retrievePackage(int id, Package mypk) {
        if (id > 0) {
            if (id == mypk.getId()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString (){
        return "\nUser:\nUser id: " + this.id + "\nUser name: " + this.name + "\nUser address: " + this.address + "\nUser phone number: " + this.phoneNumber + "\nUser email: " + this.email ;
    }
}
