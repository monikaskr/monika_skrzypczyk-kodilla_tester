package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Order> items = new ArrayList<>();

    public void addItem(Order order) {
        this.items.add(order);
    }

    public List<Order> getOrderBetvenDwoDate(LocalDate start, LocalDate end) {
        List<Order> zamowienie = new ArrayList<>();
        for(int i = 0 ; i < items.size() ;i++ ){
            Order order = items.get(i);
            if(order.getData().isBefore(end) && order.getData().isAfter(start)){
                zamowienie.add(order);
            }
        }
        return zamowienie;
    }

    public List<Order> getMinMaxPrice(int min, int max) {
        List<Order> zamowienie = new ArrayList<>();
        for(int i = 0 ; i < items.size() ;i++ ){
            Order order = items.get(i);
            if(order.getWartoscZamowienia() > min && order.getWartoscZamowienia() < max){
                zamowienie.add(order);
            }
        }
        return zamowienie;
    }

    public int getSize() {
        return this.items.size();
    }

    public double addSumOfWartoscZamowienia() {
        double sum = 0.0;
        for (int i = 0; i < this.items.size() ;i++) {
            sum = sum + this.items.get(i).getWartoscZamowienia();
        }
        return sum ;
    }
}
