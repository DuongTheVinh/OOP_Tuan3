package Bai4;

public class test_vehicle {
	public static void main(String[] args) {

	    Vehicle xe1 = new Vehicle(
	            "Nguyen Thu Loan",
	            "Wave",
	            10000000,
	            110);

	    Vehicle xe2 = new Vehicle(
	            "Nguyen Thu Thuy",
	            "Vario",
	            40000000,
	            150);

	    Vehicle xe3 = new Vehicle(
	            "Pham Tien Dung",
	            "Airblade",
	            50000000,
	            160);

	    System.out.printf("%25s %20s %15s %20s %15s%n",
	            "Ten chu xe",
	            "Loai xe",
	            "Gia xe",
	            "Dung tich xylanh",
	            "Thue");

	    System.out.printf("%25s %20s %,15.0f %20d %,15.0f%n",
	            xe1.getChuXe(),
	            xe1.getLoaiXe(),
	            xe1.getGiaXe(),
	            xe1.getDungTich(),
	            xe1.thueXe());

	    System.out.printf("%25s %20s %,15.0f %20d %,15.0f%n",
	            xe2.getChuXe(),
	            xe2.getLoaiXe(),
	            xe2.getGiaXe(),
	            xe2.getDungTich(),
	            xe2.thueXe());

	    System.out.printf("%25s %20s %,15.0f %20d %,15.0f%n",
	            xe3.getChuXe(),
	            xe3.getLoaiXe(),
	            xe3.getGiaXe(),
	            xe3.getDungTich(),
	            xe3.thueXe());
	}

	
}
