package Assessment;

public class SalariedWorker extends Worker {
	private int workHours;
	SalariedWorker(String n, float s,int h){
		super(n,s);
		workHours = h;
	}
	@Override
	float pay() {
		// TODO Auto-generated method stub
		int weeks=workHours/(24*7);
		float finalSalary = salary*weeks;
		return finalSalary;
	}
}
