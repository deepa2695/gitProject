package junitProject;

public class LeapYearImpl {
	public boolean isLeapYear(Integer year) {
		if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
			return true;
		} else {
			return false;
		}
	}
}
