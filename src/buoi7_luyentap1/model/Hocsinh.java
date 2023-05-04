/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi7_luyentap1.model;

import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class Hocsinh implements Serializable{
    private String hoten,ngoaiNgu;
    private int tuoi;

    public Hocsinh() {
    }

    public Hocsinh(String hoten, String ngoaiNgu, int tuoi) {
        this.hoten = hoten;
        this.ngoaiNgu = ngoaiNgu;
        this.tuoi = tuoi;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgoaiNgu() {
        return ngoaiNgu;
    }

    public void setNgoaiNgu(String ngoaiNgu) {
        this.ngoaiNgu = ngoaiNgu;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "Hocsinh{" + "hoten=" + hoten + ", ngoaiNgu=" + ngoaiNgu + ", tuoi=" + tuoi + '}';
    }
    public String getStatus(int tuoi){
         if(tuoi<18){
            return "Hoc sinh";
        }else if(tuoi<65){
            return "Tuoi lao dong";
        }else{
            return "Tuoi gia";
        }
    }
    
}
