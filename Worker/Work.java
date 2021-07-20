package Assessment;

import java.util.ArrayList;
import java.util.List;

import Assessment.DailyWorker;

class Work
{
    public static void main(String args[])
    {
    	DailyWorker d = new DailyWorker("ketan",1000,50);
    	SalariedWorker z = new SalariedWorker("prasad",5000,350);
    	DailyWorker s = new DailyWorker("nikhil",2000,50);
    	SalariedWorker x = new SalariedWorker("mayuresh",7000,350);
    	
    	System.out.println(d.name+" : "+d.pay());
    	System.out.println(s.name+" : "+s.pay());
    	System.out.println(z.name+" : "+z.pay());
    	System.out.println(x.name+" : "+x.pay());
    	
    }
}
