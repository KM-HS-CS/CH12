import java.util.Scanner;


public class Tester {

	
	public static void main(String[] args) {
		AppointmentCalendar test = new AppointmentCalendar();
		//test.addAppointment(2020, 3, 4, "0:00", "23:59", "Landon's Birthday");
		//System.out.println(test);
		
		try (Scanner in = new Scanner(System.in)) {
			boolean done = false;
		
			while (done == false) {
				System.out.printf("\n Would you like to: \n "
						+ "1. add appointments \n "
						+ "2. remove canceled appointments \n "
						+ "3. print out a list of appointments for a particular day \n "
						+ "4. Exit \n \n");
				try {
					int temp = in.nextInt();
					if (temp == 1) { //add appointment
						try { //could add a check for the end and start times for formatting
							System.out.printf("\n Enter a year: ");
							int year = in.nextInt();
							System.out.printf("\n Enter a month: ");
							int month = in.nextInt();
							System.out.printf("\n Enter a day: ");
							int day = in.nextInt();
							System.out.printf("\n Enter a Start time (xx:xx format): ");
							String startTime = in.nextLine();
							System.out.printf("\n Enter an end time (xx:xx format): ");
							String endTime = in.nextLine();
							System.out.printf("\n Enter a name for the appointment: ");
							String name = in.nextLine();
							test.addAppointment(year, month, day, startTime, endTime, name);
							System.out.printf("\n \n \n \n APPOINTMENT ADDED \n \n");
						} catch (Exception err) {
							in.reset();
							System.out.println("INPUT ERROR");
						}
					} else if (temp == 2) { //remove appointment
						System.out.printf("\n \n \n " + test + "\n \n Please choose an index: ");
						try {
							test.removeAppointment(in.nextInt() - 1);
						} catch (Exception err) {
							in.reset();
							System.out.println("INPUT ERROR");
						}
					} else if (temp == 3) { //print appointment on a day
						try { 
							System.out.printf("\n Enter a year: ");
							int year = in.nextInt();
							System.out.printf("\n Enter a month: ");
							int month = in.nextInt();
							System.out.printf("\n Enter a day: ");
							int day = in.nextInt();
							System.out.printf("\n \n " + test.occursOn(year, month, day) + "\n \n");
							
						} catch (Exception err) {
							in.reset();
							System.out.println("INPUT ERROR");
						}
					}else if (temp == 4) { //exit
						done = true;
						System.out.printf("\n Have a wonderful rest of the day!!! \n");
					} else {
						System.out.println("INPUT ERROR");
					}
					
					
				} catch (Exception err) {
					in.reset();
					System.out.println("INPUT ERROR");
				}
			
			
			}
		}
	}
}
