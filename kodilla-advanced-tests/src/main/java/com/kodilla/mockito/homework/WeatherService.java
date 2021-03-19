package com.kodilla.mockito.homework;

import com.kodilla.notification.Notification;

import java.util.*;

public class WeatherService {
    private Map<Weather, Set<User>> base = new HashMap<>();

    public void addSubscriber(User user, Weather weather) {
        if (base.containsKey(weather)) {
            Set<User> users = base.get(weather);
            users.add(user);
        } else {
            Set<User> usersnext = new HashSet<>();
            usersnext.add(user);
            base.put(weather, usersnext);
        }
    }

    public void sendNotification (Notification notification, Weather weather) {
        if (base.containsKey(weather)){
            Set<User> users = base.get(weather);
            for(User user: users)
                user.receive(notification);
        }
    }

    public void removeSubscriberFromLocation(User user, Weather weather) {
        if (base.containsKey(weather)) {
            Set<User> users = base.get(weather);
            users.remove(user);
        }
    }
}
