package Assessment;

public class DailyWorker extends Worker {

	private int workHours;
	DailyWorker(String n, float s,int h){
		super(n,s);
		workHours = h;
	}
	@Override
	float pay() {
		// TODO Auto-generated method stub
		int days=workHours/24;
		float finalSalary = salary*days;
		return finalSalary;
	}
}
