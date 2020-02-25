
public class ProblemGet {
	private int max;
	private char type_; //addition or subtraction 
	private int answer;
	
	
	public ProblemGet(char type, int max_) {
		max = max_;
		type_ = type;
	}
	
	public String Next() {
		int ran1 = getRan(max);
		int ran2 = getRan(ran1); //ran2 is always less than or equal to ran1
		if (type_ == '+') { //is addition
			answer = ran1 + ran2;
			return ran1 + " + " + ran2;
		} else { //is subtraction
			answer = ran1 - ran2;
			return ran1 + " - " + ran2;
		}
	}
	
	public boolean isTrue(int check) {
		if (check == answer) {
			return true;
		}
		return false;
	}
	
	private int getRan(int max) { //returns a positive number always
		return (int) Math.round(Math.random() * max);
	}
}
