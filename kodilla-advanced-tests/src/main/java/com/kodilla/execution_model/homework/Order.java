package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Order {
    private int wartoscZamowienia;
    private LocalDate data;
    private String login;

    public Order(int wartoscZamowienia, LocalDate data, String login) {
        this.wartoscZamowienia = wartoscZamowienia;
        this.data = data;
        this.login = login;
    }
    public int getWartoscZamowienia(){
        return wartoscZamowienia;
    }
    public LocalDate getData(){
        return data;
    }
    public String getLogin(){
        return login;
    }

    @Override
    public String toString() {
        return "Order{" +
                "wartoscZamowienia=" + wartoscZamowienia +
                ", data=" + data +
                ", login=" + login +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return wartoscZamowienia == order.wartoscZamowienia && Objects.equals(data, order.data) && Objects.equals(login, order.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wartoscZamowienia, data, login);
    }
}
