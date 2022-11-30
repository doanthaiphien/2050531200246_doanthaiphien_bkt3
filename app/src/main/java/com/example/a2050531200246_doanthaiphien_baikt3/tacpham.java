package com.example.a2050531200246_doanthaiphien_baikt3;

public class tacpham {
    String tenTacPham;
    int hinhAnh;

    public tacpham(String tenTacPham,int hinhAnh) {
        this.tenTacPham = tenTacPham;
        this.hinhAnh = hinhAnh;

    }

    public String getTenTacPham() {
        return tenTacPham;
    }

    public void setTenTacGia(String tenTacPham) {
        this.tenTacPham = tenTacPham;
    }
    public int getHinhAnh() {
        return hinhAnh;
    }
    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
