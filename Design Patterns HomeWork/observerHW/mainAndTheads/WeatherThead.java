package mainAndTheads;

import java.util.Random;

import subjects.WeatherPublisher;

public class WeatherThead implements Runnable {

	private int startTime;
	private String nameOfPrameter;

	public WeatherThead(int startTime, String nameOfPrameter) {
		this.startTime = startTime;
		this.nameOfPrameter = nameOfPrameter;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {

			try {
				Thread.sleep(startTime * 1000);
			} catch (InterruptedException e) {
			}
            
			Random r = new Random();
		
			int randNum = r.nextInt(11);

			if (nameOfPrameter == "waterTemperature")
				WeatherPublisher.getInstance().setWaterTemperature(randNum);
			if (nameOfPrameter == "windSpeed")
				WeatherPublisher.getInstance().setWindSpeed(randNum);
			if (nameOfPrameter == "waveHeigth")
				WeatherPublisher.getInstance().setWaveHeigth(randNum);

			System.out.println();

		}

	}
}
