package subjects;

import java.awt.List;

import observers.Observer;

public class WeatherPublisher implements Subject {
    
	private List<Observer> observers;
	private int waterTemperature;
	private int windSpeed;
	private int waveHeigth;
	
	public WeatherPublisher(){
		observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer o) {
		observers.add(newObserver);
		
	}

	@Override
	public void unregister(Observer o) {
		// Get the index of the observer to delete
		
				int observerIndex = observers.indexOf(deleteObserver);
				
				// Print out message (Have to increment index to match)
				
				System.out.println("Observer " + (observerIndex+1) + " deleted");
				
				// Removes observer from the ArrayList
				
				observers.remove(observerIndex);
		
	}

	@Override
	public void notifyObserver() {
		// Cycle through all observers and notifies them of
				// price changes
				
				for(Observer observer : observers){
					
					observer.update();
		
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
