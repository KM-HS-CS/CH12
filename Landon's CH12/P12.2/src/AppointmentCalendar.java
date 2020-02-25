import java.util.ArrayList;

//CAN'T HAVE SCANNER OR PRINTSTREAM CLASSES HERE
public class AppointmentCalendar {
	private ArrayList<Appointment> appointments = new ArrayList<Appointment>();
	
	
	public void addAppointment(int year, int month, int day, String startTime, String endTime, String name) {
		appointments.add(new Appointment(year, month, day, startTime, endTime, name));
	}
	
	public void addAppointment(Appointment app) {
		appointments.add(app);
	}
	
	public String toString() {
		String str = "";
		for (Appointment item: appointments) {
			str += (appointments.indexOf(item) + 1) + ". " + item + " \n";
		}
		if (str.equals("")) {
			return "No Appointments in this calendar yet!!!"; 
		}
		return str;
	}
	
	public void removeAppointment(int index) {
		try  {
			appointments.remove(index);
		} catch(Exception thing) {
		}
	}
	
	public String occursOn(int year, int month, int day) {
		String ret = "\n ";
		for (Appointment item: appointments) {
			if (item.occursOn(year, month, day)) {
				ret += item + " \n ";
			}
		}
		if (ret.equals("")) {
			return "No Appointments on " + year + "/" + month + "/" + day; 
		}
		return ret;
	}
	
	
}
