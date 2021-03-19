package com.kodilla.mockito.homework;

import com.kodilla.notification.Notification;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherServiceTestSuit {
    WeatherService weatherService = new WeatherService();
    User user = Mockito.mock(User.class);
    Weather weather = Mockito.mock(Weather.class);
    Notification notification = Mockito.mock(Notification.class);

    @Test
    public void one_NotSubscribedUserShouldNotReceiveNotificationWeather() {
        weatherService.sendNotification(notification,weather);
        Mockito.verify(user, Mockito.never()).receive(notification);
    }
    @Test
    public void two_SubscribedUserShouldReceiveNotificationWeather() {
        weatherService.addSubscriber(user,weather);
        weatherService.sendNotification(notification,weather);
        Mockito.verify(user, Mockito.times(1)).receive(notification);
    }
    @Test
    public void third_SubscribedUserShouldClearNotificationWeather() {
        weatherService.addSubscriber(user,weather);
        weatherService.removeSubscriberFromLocation(user, weather);

        weatherService.sendNotification(notification,weather);
        Mockito.verify(user, Mockito.never()).receive(notification);
    }
    @Test
    public void four_ShouldSendOnlyToSpecifiedLocation() {
        weatherService.addSubscriber(user, weather);
        Weather firstLoc = Mockito.mock(Weather.class);
        Weather secondLoc = Mockito.mock(Weather.class);
        Weather thirdLoc = Mockito.mock(Weather.class);
        weatherService.addSubscriber(user, firstLoc);
        weatherService.addSubscriber(user, secondLoc);
        weatherService.addSubscriber(user,thirdLoc);

        weatherService.sendNotification(notification,weather);
        Mockito.verify(user, Mockito.times(1)).receive(notification);
    }
    @Test
    public void five_NotificationShouldBeSentToAllSubscribedUsers() {
        User firstClient = Mockito.mock(User.class);
        User secondClient = Mockito.mock(User.class);
        User thirdClient = Mockito.mock(User.class);
        weatherService.addSubscriber(firstClient, weather);
        weatherService.addSubscriber(secondClient, weather);
        weatherService.addSubscriber(thirdClient, weather);

        weatherService.sendNotification(notification,weather);
        Mockito.verify(firstClient, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);
    }
    @Test
    public void six_ReceiveLocationOfWeather() {
        Weather firstLoc = Mockito.mock(Weather.class);
        Weather secondLoc = Mockito.mock(Weather.class);
        Weather thirdLoc = Mockito.mock(Weather.class);
        weatherService.addSubscriber(user, firstLoc);
        weatherService.addSubscriber(user, secondLoc);
        weatherService.addSubscriber(user, thirdLoc);
        weatherService.removeSubscriberFromLocation(user, secondLoc);

        User firstClient = Mockito.mock(User.class);
        User secondClient = Mockito.mock(User.class);
        User thirdClient = Mockito.mock(User.class);
        weatherService.addSubscriber(firstClient, weather);
        weatherService.addSubscriber(secondClient, weather);
        weatherService.addSubscriber(thirdClient, weather);

        weatherService.sendNotification(notification, weather);
        Mockito.verify(firstClient, Mockito.times(1)).receive(notification);
        Mockito.verify(secondClient, Mockito.times(1)).receive(notification);
        Mockito.verify(thirdClient, Mockito.times(1)).receive(notification);
    }
}
