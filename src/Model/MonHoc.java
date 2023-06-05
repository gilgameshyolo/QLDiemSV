/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class MonHoc {
    private int maMH;
    private String tenMH;

    public int getMaMH() {
        return maMH;
    }

    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public MonHoc() {
    }

    public MonHoc(int maMH, String tenMH) {
        this.maMH = maMH;
        this.tenMH = tenMH;
    }

    @Override
    public String toString() {
        return "MonHoc{" + "maMH=" + maMH + ", tenMH=" + tenMH + '}';
    }
    
    
}
