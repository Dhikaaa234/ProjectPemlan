/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.mLogin;

/**
 *
 * @author ANDHIKA ANANTA PUTRA
 */
public class cLogin {
    mLogin data = new mLogin();
    
    
    public cLogin() {
        data.user="mamang";
        data.password="benar";
    }
    
    public boolean CekLogin (String nama, String pass) {
        if (data.user.equals(nama)&&data.password.equals(pass))
            return true;
        else
            return false;
    }
}
