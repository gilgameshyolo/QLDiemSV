/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class Diem {
    private String maSV;
    private int maLoai;
    private int maMH;
    private float diem;

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public int getMaMH() {
        return maMH;
    }

    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public Diem() {
    }

    public Diem(String maSV, int maLoai, int maMH, float diem) {
        this.maSV = maSV;
        this.maLoai = maLoai;
        this.maMH = maMH;
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "Diem{" + "maSV=" + maSV + ", maLoai=" + maLoai + ", maMH=" + maMH + ", diem=" + diem + '}';
    }
    
    
}
