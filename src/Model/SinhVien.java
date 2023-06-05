/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class SinhVien {
    private String maSV;
    private String tenSV;
    private String ngaysinh;
    private boolean gioitinh;
    private String diachi;
    private int maLop;

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

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public boolean getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getMaLop() {
        return maLop;
    }

    public void setMaLop(int maLop) {
        this.maLop = maLop;
    }

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenSV, String ngaysinh, boolean gioitinh, String diachi, int maLop) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.maLop = maLop;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", tenSV=" + tenSV + ", ngaysinh=" + ngaysinh + ", gioitinh=" + gioitinh + ", diachi=" + diachi + ", maLop=" + maLop + '}';
    }
    
    
    
}
