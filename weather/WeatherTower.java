package weather;

import Aircraft.*;

public class WeatherTower extends Tower{

    private String weather;

    public String getWeather(Coordinates coordinates)
    {
        WeatherProvider provider = WeatherProvider.getProvider();
        weather = provider.getCurrentWeather(coordinates);
        return weather;
    }

    protected void changeWeather()
    {
        this.conditionsChanged();//change weather
        //call conditionsChanged
    }
}
