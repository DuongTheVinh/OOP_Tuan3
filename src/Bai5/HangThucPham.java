package Bai5;


import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {

    // Attributes
    private String maHang;
    private String tenHang;
    private double donGia;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;

    // Constructor mặc định
    public HangThucPham() {
        this.maHang = "";
        this.tenHang = "";
        this.donGia = 0.0;
        this.ngaySanXuat = LocalDate.now();
        this.ngayHetHan = LocalDate.now();
    }

    // Constructor đầy đủ tham số
    public HangThucPham(String maHang, String tenHang, double donGia,
                        LocalDate ngaySanXuat, LocalDate ngayHetHan)
            throws Exception {

        setMaHang(maHang);
        setTenHang(tenHang);
        setDonGia(donGia);
        setNgaySanXuat(ngaySanXuat);
        setNgayHetHan(ngayHetHan);
    }

    // Constructor chỉ có mã hàng
    public HangThucPham(String maHang) throws Exception {
        setMaHang(maHang);

        this.tenHang = "";
        this.donGia = 0.0;
        this.ngaySanXuat = LocalDate.now();
        this.ngayHetHan = LocalDate.now();
    }

    // Getter - Setter mã hàng
    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) throws Exception {
        if (maHang != null && !maHang.trim().equals("")) {
            this.maHang = maHang;
        } else {
            throw new Exception("Lỗi: Mã hàng rỗng!");
        }
    }

    // Getter - Setter tên hàng
    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if (tenHang != null && !tenHang.trim().equals("")) {
            this.tenHang = tenHang;
        } else {
            this.tenHang = "";
        }
    }

    // Getter - Setter đơn giá
    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia >= 0) {
            this.donGia = donGia;
        } else {
            this.donGia = 0.0;
        }
    }

    // Getter - Setter ngày sản xuất
    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        if (ngaySanXuat != null) {
            this.ngaySanXuat = ngaySanXuat;
        } else {
            this.ngaySanXuat = LocalDate.now();
        }
    }

    // Getter - Setter ngày hết hạn
    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        // Ngày hết hạn phải sau ngày sản xuất
        if (ngayHetHan != null && 
            ngayHetHan.isAfter(this.ngaySanXuat)) {
            this.ngayHetHan = ngayHetHan;
        } else {
            this.ngayHetHan = this.ngaySanXuat;
        }
    }

    // Kiểm tra hàng hết hạn
    public boolean hetHan() {
        return ngayHetHan.isBefore(LocalDate.now());
    }
// toString
    @Override
    public String toString() {

        DecimalFormat df = new DecimalFormat("#,##0.00");
        DateTimeFormatter dtf =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String ghiChu = hetHan() ? "Hàng hết hạn" : "";

        return String.format(
                "%-8s %-15s %15sVND %15s %15s %-15s",
                maHang,
                tenHang,
                df.format(donGia),
                ngaySanXuat.format(dtf),
                ngayHetHan.format(dtf),
                ghiChu
        );
    }
}

