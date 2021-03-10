package com.kodilla.notification.homework;

import java.util.HashSet;
import java.util.Set;

public class WeatherService {
    private Set<User> users = new HashSet<>();
    private Set<Weather> weathers = new HashSet<>();

    public void addSubscriber(User user) {
        this.users.add(user);
    }
    public void sendWeather(Weather weather) {
        this.users.forEach(user -> user.receive(weather));
    }
    public void removeSubscriber(User user) {
        this.users.remove(user);
    }
    public void addLocation(Weather weather) {
        this.weathers.add(weather);
    }
    public void sendNotification(User user) {
        this.weathers.forEach(weather -> weather.receiveLocation(user));
    }
    public void removeLocation(Weather weather) {
        this.weathers.remove(weather);
    }

}
