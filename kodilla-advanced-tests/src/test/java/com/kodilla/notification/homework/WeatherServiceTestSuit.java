package com.kodilla.notification.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherServiceTestSuit {
    WeatherService weatherService = new WeatherService();
    User user = Mockito.mock(User.class);
    Weather weather = Mockito.mock(Weather.class);

    @Test
    public void oneNotSubscribedUserShouldNotReceiveWeather() {
        weatherService.sendWeather(weather);
        Mockito.verify(user, Mockito.never()).receive(weather);
    }
    @Test
    public void twoSubscribedUserShouldReceiveWeather() {
        weatherService.addSubscriber(user);
        weatherService.sendWeather(weather);
        Mockito.verify(user, Mockito.times(1)).receive(weather);
    }
    @Test
    public void thirdSubscribedUserShouldClearNotificationWeather() {
        weatherService.addSubscriber(user);
        weatherService.removeSubscriber(user);

        weatherService.sendWeather(weather);
        Mockito.verify(user, Mockito.never()).receive(weather);
    }
    @Test
    public void fourShouldSendOnlyToSpecifiedLocation() {
        weatherService.addSubscriber(user);
        Weather firstLoc = Mockito.mock(Weather.class);
        Weather secondLoc = Mockito.mock(Weather.class);
        Weather thirdLoc = Mockito.mock(Weather.class);
        weatherService.addLocation(firstLoc);
        weatherService.addLocation(secondLoc);
        weatherService.addLocation(thirdLoc);

        weatherService.sendNotification(user);
        Mockito.verify(firstLoc, Mockito.times(1)).receiveLocation(user);
        Mockito.verify(secondLoc, Mockito.times(1)).receiveLocation(user);
        Mockito.verify(thirdLoc, Mockito.times(1)).receiveLocation(user);
    }
    @Test
    public void fiveWeatherShouldBeSentToAllSubscribedUsers() {
        User firstClient = Mockito.mock(User.class);
        User secondClient = Mockito.mock(User.class);
        User thirdClient = Mockito.mock(User.class);
        weatherService.addSubscriber(firstClient);
        weatherService.addSubscriber(secondClient);
        weatherService.addSubscriber(thirdClient);

        weatherService.sendWeather(weather);
        Mockito.verify(firstClient, Mockito.times(1)).receive(weather);
        Mockito.verify(secondClient, Mockito.times(1)).receive(weather);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(weather);
    }
    @Test
    public void sixReceiveLocationOfWeather() {
        Weather firstLoc = Mockito.mock(Weather.class);
        Weather secondLoc = Mockito.mock(Weather.class);
        Weather thirdLoc = Mockito.mock(Weather.class);
        weatherService.addLocation(firstLoc);
        weatherService.addLocation(secondLoc);
        weatherService.addLocation(thirdLoc);
        weatherService.removeLocation(secondLoc);
    }
}
