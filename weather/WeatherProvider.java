package weather;

import Aircraft.Coordinates;

import java.util.Random;

public class WeatherProvider {
   public static WeatherProvider weatherProvider;
   public String[] weather = {"SUN", "SNOW", "RAIN", "FOG"};

   private WeatherProvider()
   {
       weatherProvider = this;
   }

    public static WeatherProvider getProvider() {
       new WeatherProvider();
        return weatherProvider;
    }

    public  String getCurrentWeather(Coordinates coordinates){
        int rnd = new Random().nextInt(weather.length);
        return weather[rnd];
    }
}
