package observers;

import subjects.Subject;

public class WeatherObserver implements Observer {
     
	private int waterTemperature;
	private int windSpeed;
	private int waveHeigth;
	
	private static int observerIDTracker=0;
	private int observerID;
	
	private Subject weatherPublisher;
	
	public WeatherObserver(Subject weatherPublisher){
		
		this.weatherPublisher = weatherPublisher ;

		this.observerID = ++observerIDTracker;

		System.out.println("New Observer " + this.observerID);

		weatherPublisher .register(this);
	}

	@Override
	public void update(int waterTemperature, int windSpeed, int waveHeigth) {
		 this.waterTemperature = waterTemperature;
		 this.windSpeed = windSpeed; 
		 this.waveHeigth = waveHeigth;

		 printConclusion();
		
	}
	
	public void printConclusion(){
		if(waterTemperature<=5 || windSpeed<=5 || waveHeigth<=5){ 
			System.out.println("Time to go to the beach");
			System.out.println("Life is a beach");
			}
		else{
			System.out.println("Don't to the beach");
			System.out.println("Life is a beach");
			}
	}
}
