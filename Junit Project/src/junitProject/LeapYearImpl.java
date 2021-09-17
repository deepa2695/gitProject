package junitProject;

public class LeapYearImpl {
	public boolean isLeapYear(Integer year) {
		if(year == null){
			throw new NullPointerException("The year is null");
		}
		if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
			return true;
		} else {
			return false;
		}
	}
}
