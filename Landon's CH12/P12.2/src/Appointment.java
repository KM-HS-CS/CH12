


//THESE ARE ALL ONETIME
public class Appointment {
	private int year_;
	private int month_;
	private int day_;
	private String name_;
	private String startTime_;
	private String endTime_;
	
	
	//Thought was this could be a super constructor that other appointment types could implement
	public Appointment(int year, int month, int day, String startTime, String endTime, String name) {
		year_ = year;
		month_ = month;
		day_ = day;
		name_ = name;
		startTime_ = startTime;
		endTime_ = endTime;
	}
	
	
	//The child classes would override this
	public boolean occursOn(int year, int month, int day) {
		return year == year_ && month_ == month && day_ == day;
	}
	
	public String toString() {
		return name_ + ": " + year_ + "/" + month_ + "/" + day_ + " " + startTime_ + " " + endTime_;
	}
}
