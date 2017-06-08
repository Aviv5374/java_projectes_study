package observers;

import subjects.Subject;
import subjects.WeatherPublisher;

public class WeatherObserver implements Observer {

	private int waterTemperature;
	private int windSpeed;
	private int waveHeigth;

	private static int observerIDTracker = 0;
	private int observerID;


	public WeatherObserver() {

		this.observerID = ++observerIDTracker;

		System.out.println("New Observer " + this.observerID);

		WeatherPublisher.getInstance().register(this);
	}

	@Override
	public void update(int waterTemperature, int windSpeed, int waveHeigth) {
		this.waterTemperature = waterTemperature;
		this.windSpeed = windSpeed;
		this.waveHeigth = waveHeigth;

		printConclusion();

	}

	public void printConclusion() {
		if (waterTemperature <= 5 && windSpeed <= 7 && waveHeigth <= 3) {
			System.out.println("Time to go to the beach");
			System.out.println("Life is a beach");
		} else {
			System.out.println("Don't to the beach");
			System.out.println("Life is a beach");
		}
	}
}
