/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author ANDHIKA ANANTA PUTRA
 */

import GUI.JFPegawai
import Model.mPegawai;

public class cPegawai {
    private defaultTableModel model;
    private mPegawai pegawai = new mPegawai(); 
    
    public cPegawai(){
        model = new DefaultTableModel();
        model.addColumn("Nama");
        model.addColumn("kategori");
    }
    
}
