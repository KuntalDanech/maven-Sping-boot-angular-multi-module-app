package com.danech.util;

import com.danech.model.Student;

public interface StudentUtil {
	public static void doCalculation(Student student) {
		var fees = student.getStdFees();
		var gst = fees*18/100;
		var disc = fees*10/100;
		student.setDiscount(disc);
		student.setGst(gst);
	}
}
