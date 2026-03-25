package objects;

public class WeatherReportDemo {

	public static void main(String[] args) {

		WeatherReport wr = new WeatherReport(); 
		
		wr.temperature = 32 ;
		wr.humidity = 75 ;
		wr.windSpeed = 18 ;
		wr.forecast = "Partly Cloudy";
		wr.location = "Mumbai, Maharashtra " ;

		System.out.println("Temperature in degree celsius = " +wr.humidity);
		System.out.println("Humidity in percentage = " +wr.humidity);
		System.out.println("Wind Speed in km/h = " +wr.windSpeed);
		System.out.println("Fore Castforecast = " +wr.forecast);
		System.out.println("Location = " +wr.location);
		
		System.out.println("-------Methods Call-------");
		wr.updateReport();
		wr.displayReport();
		wr.checkRainPrediction();
		wr.alertForStorm();
	}

}




/*
Temperature in degree celsius = 75
Humidity in percentage = 75
Wind Speed in km/h = 18
Fore Castforecast = Partly Cloudy
Location = Mumbai, Maharashtra 
-------Methods Call-------
The IMD updated Mumbai’s weather report to predict heavy rain. 
The Weather app showed real-time temperature and humidity.
Can check the rain Prediction based on current data
The IMD issued a red alert for a cyclone in Maharashtra.
*/