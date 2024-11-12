public class Book {
    int maSach;
    String tenSach;
    String tenTacGia;
    int namSanxuat;
    String tomTatNoiDung;
    double giaTien;

    public Book() {

    }

    public Book(String tenSach, int maSach, String tenTacGia, String tomTatNoiDung, int namSanxuat, double giaTien) {
        this.tenSach = tenSach;
        this.maSach = maSach;
        this.tenTacGia = tenTacGia;
        this.tomTatNoiDung = tomTatNoiDung;
        this.namSanxuat = namSanxuat;
        this.giaTien = giaTien;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public int getNamSanxuat() {
        return namSanxuat;
    }

    public void setNamSanxuat(int namSanxuat) {
        this.namSanxuat = namSanxuat;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getTomTatNoiDung() {
        return tomTatNoiDung;
    }

    public void setTomTatNoiDung(String tomTatNoiDung) {
        this.tomTatNoiDung = tomTatNoiDung;
    }

    @Override
    public String toString() {
        return "Book{" +
                "maSach=" + maSach +
                ", tenSach='" + tenSach + '\'' +
                ", tenTacGia='" + tenTacGia + '\'' +
                ", namSanxuat=" + namSanxuat +
                ", tomTatNoiDung='" + tomTatNoiDung + '\'' +
                ", giaTien=" + giaTien +
                '}';
    }
    public void display() {
        System.out.println(this);
    }
}
