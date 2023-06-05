/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class DSDiem {
    String maSV;
    String tenSV;
    String tenLop;
    int maMH;
    String tenMH;
    int maLoai;

    public int getMaMH() {
        return maMH;
    }

    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }
    String tenLoai;
    float diem;

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public DSDiem(String maSV, String tenSV, String tenLop, int maMH, String tenMH, int maLoai, String tenLoai, float diem) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.tenLop = tenLop;
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "DSDiem{" + "maSV=" + maSV + ", tenSV=" + tenSV + ", tenLop=" + tenLop + ", maMH=" + maMH + ", tenMH=" + tenMH + ", maLoai=" + maLoai + ", tenLoai=" + tenLoai + ", diem=" + diem + '}';
    }

}
