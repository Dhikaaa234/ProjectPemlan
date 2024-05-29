/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ANDHIKA ANANTA PUTRA
 */
public class mLogin {
    public String user;
    public String password;
    
    public Object[] toArray(){
        Object[] a = new Object[2];
        a[0]= user;
        a[1]= password;
        return a;
    }
}
