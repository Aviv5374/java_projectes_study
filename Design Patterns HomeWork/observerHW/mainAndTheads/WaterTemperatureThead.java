package mainAndTheads;

import subjects.WeatherPublisher;

public class WaterTemperatureThead implements Runnable {

	private int startTime;
	private String nameOfPrameter;
	
	public WaterTemperatureThead(int startTime, String nameOfPrameter){
		this.startTime = startTime;
		this.nameOfPrameter = nameOfPrameter;
	}
	
	
	@Override
	public void run() {
		for(int i = 1; i <= 20; i++){
			
			try{
				Thread.sleep(startTime * 1000);
			}
			catch(InterruptedException e)
			{}
			
		
			int randNum =  (int) Math.random()+11;
			
			
			if(nameOfPrameter == "waterTemperature") WeatherPublisher.getInstance().setWaterTemperature(randNum);
			if(nameOfPrameter == "windSpeed") WeatherPublisher.getInstance().setWindSpeed(randNum);
			if(nameOfPrameter == "waveHeigth") WeatherPublisher.getInstance().setWaveHeigth(randNum);
			
			System.out.println();
		
	}

}
