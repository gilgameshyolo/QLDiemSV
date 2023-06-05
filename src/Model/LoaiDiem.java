/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class LoaiDiem {
    private int maLoai;
    private String tenLoai;

    public int getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public LoaiDiem(int maLoai, String tenLoai) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
    }

    public LoaiDiem() {
    }

    @Override
    public String toString() {
        return "LoaiDiem{" + "maLoai=" + maLoai + ", tenLoai=" + tenLoai + '}';
    }
    
    
}
