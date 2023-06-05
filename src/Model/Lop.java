/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class Lop {
    private int maLop;
    private String tenLop;

    public int getMaLop() {
        return maLop;
    }

    public void setMaLop(int maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public Lop() {
    }

    public Lop(int maLop, String tenLop) {
        this.maLop = maLop;
        this.tenLop = tenLop;
    }

    @Override
    public String toString() {
        return "Lop{" + "maLop=" + maLop + ", tenLop=" + tenLop + '}';
    }
    
    
}
