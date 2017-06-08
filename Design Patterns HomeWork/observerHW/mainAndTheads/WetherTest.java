package mainAndTheads;

import observers.WeatherObserver;

public class WetherTest {

	public static void main(String[] args) {
		
		WeatherObserver weatherObserver1 = new WeatherObserver();
		
		Runnable waterTemperatureThread = new WeatherThead(2,"waterTemperature");
		Runnable windSpeedThread = new WeatherThead(1,"windSpeed");
		Runnable waveHeigthThread = new WeatherThead(3,"waveHeigth");
		
		new Thread(waterTemperatureThread).start();
		new Thread(windSpeedThread).start();
		new Thread(waveHeigthThread).start();
		
		
		

	}

}
