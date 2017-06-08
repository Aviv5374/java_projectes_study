package mainAndTheads;

import observers.WeatherObserver;
import subjects.WeatherPublisher;

public class WetherTest {

	public static void main(String[] args) {
		
		WeatherPublisher weatherPublisher = new WeatherPublisher();
		
		WeatherObserver weatherObserver1 = new WeatherObserver(weatherPublisher);

	}

}
