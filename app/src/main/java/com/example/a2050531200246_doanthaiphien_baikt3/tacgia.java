package com.example.a2050531200246_doanthaiphien_baikt3;

public class tacgia {
    String tenTacGia;
    String tacpham1, tacpham2;
    int hinhAnh;

    public tacgia(String tenTacGia,int hinhAnh,String tacpham1,String tacpham2) {
        this.tenTacGia = tenTacGia;
        this.hinhAnh = hinhAnh;
        this.tacpham1=tacpham1;
        this.tacpham2=tacpham2;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }
    public int getHinhAnh() {
        return hinhAnh;
    }
    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
    public String gettacpham1() {
        return tacpham1;
    }

    public void settacpham1(String tenTacGia) {
        this.tacpham1 = tacpham1;
    }
    public String gettacpham2() {
        return tacpham2;
    }

    public void settacpham2(String tacpham2) {
        this.tacpham2 = tacpham2;
    }
}
