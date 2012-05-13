package cardsPackage;

import java.util.Set;


// здесь информация по каждому пику
public class Peaks {
	protected double theta;
	protected double intensity;
	protected boolean maximum = false;
	
	public Peaks (){
	}
	
	public Peaks (double t, double i){
		this.theta = t;
		this.intensity = i;
		
	}

}

