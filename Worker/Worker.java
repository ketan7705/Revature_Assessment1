package Assessment;

import java.util.Scanner;

public abstract class Worker {
	String name;
	float salary;
	Worker(String n,float s){
		name = n;
		salary = s;
	}
	abstract float pay();
}


