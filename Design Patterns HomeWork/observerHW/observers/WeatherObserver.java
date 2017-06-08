package observers;

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
		if(<=5){ print(true)}
		else{print(false)}
	}
}
