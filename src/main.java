import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		ArrayList<Integer> yil = new ArrayList<Integer>();
		ArrayList<String> tarih = new ArrayList<String>();
		ArrayList<String> date = new ArrayList<String>();
		// 01.12.1990
		int a = 0;
		for (int i = 1900; i < 2000; i++) {
			yil.add(i);
			for (int j = 1; j <= 12; j++) {
				if (j == 4 || j == 6 || j == 9 || j == 11) {// nisan-haziran-eylül-kasým
															// ->30 günden
					if (j == 11) {
						for (int k = 1; k < 31; k++) {
							if (k < 10) {
								tarih.add("0" + k + "." + j + "." + i);// 1
							} else {
								tarih.add(k + "." + j + "." + i);// 1
							}
							a++;
						}
					} else {
						for (int k = 1; k < 31; k++) {
							if (k < 10) {
								tarih.add("0" + k + ".0" + j + "." + i);// 1
							} else {
								tarih.add(k + ".0" + j + "." + i);// 1
							}
							a++;
						}
					}

				} else if (j == 2) {
					if (i % 4 == 0 && i % 100 != 0) {
						for (int k = 1; k < 30; k++) {
							if (k < 10) {
								tarih.add("0" + k + ".0" + j + "." + i);// 1
							} else {
								tarih.add(k + ".0" + j + "." + i);// 1
							}
							a++;
						}
					} else {
						for (int k = 1; k < 29; k++) {
							if (k < 10) {
								tarih.add("0" + k + ".0" + j + "." + i);// 1
							} else {
								tarih.add(k + ".0" + j + "." + i);// 1
							}
							a++;
						}
					}

				} else {
					if (j > 9) {
						for (int k = 1; k < 32; k++) {
							if (k < 10) {
								tarih.add("0" + k + "." + j + "." + i);// 1
							} else {
								tarih.add(k + "." + j + "." + i);// 1
							}
							a++;
						}
					} else {
						for (int k = 1; k < 32; k++) {
							if (k < 10) {
								tarih.add("0" + k + ".0" + j + "." + i);// 1
							} else {
								tarih.add(k + "." + j + ".0" + i);// 1
							}
							a++;
						}
					}
				}
			}
		}
		int count = 1;
		int c = 0;
		for (int w = 0; w < tarih.size(); w++) {

			if (count == 1) {
				date.add(tarih.get(w) + " 1");
				count++;
			} else if (count == 2) {
				date.add(tarih.get(w) + " 2");
				count++;
			} else if (count == 3) {
				date.add(tarih.get(w) + " 3");
				count++;
			} else if (count == 4) {
				date.add(tarih.get(w) + " 4");
				count++;
			} else if (count == 5) {
				date.add(tarih.get(w) + " 5");
				count++;
			} else if (count == 6) {
				date.add(tarih.get(w) + " 6");
				count++;
			} else if (count == 7) {
				date.add(tarih.get(w) + " 7");
				count = 1;
			}
			if (date.get(w).substring(0, 2).toString().equals("01") && date.get(w).toString().substring(11, 12).equals("7")) {// ayýn
				c++;
				System.out.println(date.get(w)+" "+c);
			}
		}
	}
}
