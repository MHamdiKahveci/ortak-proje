/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MHamd
 */
public class Users {
    String Name;
    String Lastname;
    String Title;
    
    public void User(String Name,String Lastname,String Title){
        this.Name=Name;
        this.Lastname=Lastname;
        this.Title=Title;
    }
    public String getName(){
        return Name;
    }
    public String getLastname(){
        return Lastname;
    }
    public String getTitle(){
        return Title;
    }
}
