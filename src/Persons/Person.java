/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons;

/**
 *
 * @author rodol
 */
public abstract class Person {
      private int id;
      private String name;
      private String email;
      private static final String  emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
      
      public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
     public String getEmail(){
        return email;
    }
     
     // validar con Regex que sea como un correo electronico
    public void setEmail(String email){
        if (validateEmail(email)){
            this.email = email;
        }
    }
    
    private static boolean validateEmail(String email){
        return email.matches(emailRegex);
    }

    public Person(int id, String name,  String email) {
         this.id = id;
        this.name = name;
         if (validateEmail(email)){
            this.email = email;
        }
    }

    @Override
    public String toString() {
        return " Id: " + id + " Name: " + name + " Email: " + email;
    }
    
    
}
