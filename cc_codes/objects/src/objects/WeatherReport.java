package objects;

public class WeatherReport {

	int temperature ;
	int humidity ;
	int windSpeed ;
	String forecast ;
	String location ;

	public void updateReport() {
		System.out.println("The IMD updated Mumbai’s weather report to predict heavy rain. ");
	}
	public void displayReport() {
		System.out.println("The Weather app showed real-time temperature and humidity.");
	}
	public void checkRainPrediction() {
		System.out.println("Can check the rain Prediction based on current data");
	}
	public void alertForStorm() {
		System.out.println("The IMD issued a red alert for a cyclone in Maharashtra.");
	}
}


	