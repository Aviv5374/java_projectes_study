package subjects;

import java.util.ArrayList;

import observers.Observer;

public class WeatherPublisher implements Subject {

	private static WeatherPublisher instance = null;
	
	private ArrayList<Observer> observers;
	private int waterTemperature = 6;
	private int windSpeed = 6;
	private int waveHeigth = 6;

	private WeatherPublisher() {
		observers = new ArrayList<Observer>();
	}
	
	public static WeatherPublisher getInstance() {
		if (instance == null)
			return instance = new WeatherPublisher();
		else
			return instance;
	}

	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);

	}

	@Override
	public void unregister(Observer deleteObserver) {
		int observerIndex = observers.indexOf(deleteObserver);
		System.out.println("Observer " + (observerIndex + 1) + " deleted");
		observers.remove(observerIndex);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(waterTemperature, windSpeed, waveHeigth);
		}
	}

	public void setWaterTemperature(int waterTemperature) {
		this.waterTemperature = waterTemperature;
		notifyObserver();
	}

	public void setWindSpeed(int windSpeed) {
		this.windSpeed = windSpeed;
		notifyObserver();
	}

	public void setWaveHeigth(int waveHeigth) {
		this.waveHeigth = waveHeigth;
		notifyObserver();
	}
}