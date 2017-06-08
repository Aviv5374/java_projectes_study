package mainAndTheads;

import observers.WeatherObserver;
import subjects.WeatherPublisher;

public class WetherTest {

	public static void main(String[] args) {
		
		WeatherObserver weatherObserver1 = new WeatherObserver();
		
		WeatherPublisher.getInstance().setWaterTemperature(3);
		WeatherPublisher.getInstance().setWaveHeigth(3);
		WeatherPublisher.getInstance().setWindSpeed(3);

	}

}
