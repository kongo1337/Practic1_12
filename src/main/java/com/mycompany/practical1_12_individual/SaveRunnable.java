/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical1_12_individual;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author KonGo
 */
public class SaveRunnable implements Runnable {
    
    private Doctor doctor;
    

    public SaveRunnable(Doctor doctor) {
        this.doctor = doctor;
        
    }
    
    @Override 
    public void run(){
        if(doctor != null){
            FileOutputStream fos;
            try{
                fos = new FileOutputStream("C:\\doctor.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(doctor);
                oos.close();
                fos.close();
                System.out.println("Объект сохранен в файл C:\\doctor.ser");
            }catch (IOException ex) {
                System.out.println("ERROR saving object to path: C:\\doctor.ser");
                ex.printStackTrace();
            }
        }
    }
    
}
