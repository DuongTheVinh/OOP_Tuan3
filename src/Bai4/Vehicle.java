package Bai4;

public class Vehicle {
	private String chuXe;
	private String loaiXe;
	private double giaXe;
	private int dungTich;
	public Vehicle(String chuXe, String loaiXe, double giaXe, int dungTich) {
	setChuXe(chuXe);
	setLoaiXe(loaiXe);
	setGiaXe(giaXe);
	setDungTich(dungTich);
	}
	public Vehicle() {
		chuXe="chua xac dinh";
		loaiXe="chua xac dinh";
		giaXe=0;
		dungTich=0;
	}
	/**
	 * @return the chuXe
	 */
	public String getChuXe() {
		return chuXe;
	}
	/**
	 * @param chuXe the chuXe to set
	 */
	public void setChuXe(String chuXe) {
		if(chuXe == null || chuXe.trim().isEmpty())
		{
			throw new IllegalArgumentException(" ten chu xe khong duoc rong");
		}
		this.chuXe = chuXe;
	}
	/**
	 * @return the loaiXe
	 */
	public String getLoaiXe() {
		return loaiXe;
	}
	/**
	 * @param loaiXe the loaiXe to set
	 */
	public void setLoaiXe(String loaiXe) {
		if(loaiXe == null || loaiXe.trim().isEmpty())
		{
			throw new IllegalArgumentException(" loai xe khong duoc rong");
		}
		this.loaiXe = loaiXe;
	}
	/**
	 * @return the giaXe
	 */
	public double getGiaXe() {
		return giaXe;
	}
	/**
	 * @param giaXe the giaXe to set
	 */
	public void setGiaXe(double giaXe) {
		if(giaXe<0) {
			throw new IllegalArgumentException(" gia xe phai lon hon 0");
		}
		this.giaXe = giaXe;
	}
	/**
	 * @return the dungtichXilanh
	 */
	public int getDungTich() {
		return dungTich;
	}
	/**
	 * @param dungtichXilanh the dungtichXilanh to set
	 */
	public void setDungTich(int dungTich) {
		if(dungTich<0) {
			throw new IllegalArgumentException(" dung tich xy lanh phai lon hon 0");
		}
		this.dungTich = dungTich;
	}
	public double thueXe() {
		if(dungTich < 100) {
			return giaXe * 0.01;
		}else if (dungTich >=100 && dungTich < 200){
			return giaXe * 0.03;
		}
		else  {
			return giaXe* 0.05;
		}
	}
	
}
