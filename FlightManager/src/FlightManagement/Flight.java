package FlightManagement;

import java.io.Serializable;

public class Flight implements Serializable {

    private String soHieu;
    private String ngayBay;
    private String thoiGian;
    private String changBay;
    private String loaiMayBay;
    private String thoiGianBay;
    private String quangDuong;
    private String giaVe;

    public Flight() {
    }

    public Flight(String soHieu, String ngayBay, String thoiGian, String changBay, String loaiMayBay, String thoiGianBay, String quangDuong, String giaVe) {
        this.soHieu = soHieu;
        this.ngayBay = ngayBay;
        this.thoiGian = thoiGian;
        this.changBay = changBay;
        this.loaiMayBay = loaiMayBay;
        this.thoiGianBay = thoiGianBay;
        this.quangDuong = quangDuong;
        this.giaVe = giaVe;
    }

    public String getSoHieu() {
        return soHieu;
    }

    public void setSoHieu(String soHieu) {
        this.soHieu = soHieu;
    }

    public String getNgayBay() {
        return ngayBay;
    }

    public void setNgayBay(String ngayBay) {
        this.ngayBay = ngayBay;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getChangBay() {
        return changBay;
    }

    public void setChangBay(String changBay) {
        this.changBay = changBay;
    }

    public String getLoaiMayBay() {
        return loaiMayBay;
    }

    public void setLoaiMayBay(String loaiMayBay) {
        this.loaiMayBay = loaiMayBay;
    }

    public String getThoiGianBay() {
        return thoiGianBay;
    }

    public void setThoiGianBay(String thoiGianBay) {
        this.thoiGianBay = thoiGianBay;
    }

    public String getQuangDuong() {
        return quangDuong;
    }

    public void setQuangDuong(String quangDuong) {
        this.quangDuong = quangDuong;
    }

    public String getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(String giaVe) {
        this.giaVe = giaVe;
    }

    @Override
    public String toString() {
        return soHieu + ","
                + ngayBay + ","
                + thoiGian + ","
                + changBay + ","
                + loaiMayBay + ","
                + thoiGianBay + ","
                + quangDuong + ","
                + giaVe ;
    }

}
