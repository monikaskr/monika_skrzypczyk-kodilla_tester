package com.kodilla.bank.homework;

public class CashMachine {
    private int[] values;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.values = new int[0];
    }

    public void add(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
    }

    public int getSuma() {
        int sum = 0;
        for (int i = 0; i < this.values.length; i++) {
            sum += this.values[i];
        }
        return sum;
    }

    public int getTransaction() {
        int transaction = this.values.length;
        return transaction;
    }

    public int getTransactionPutOut() {
        int counter = 0;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] < 0)
            counter++;
        }
        return counter;
    }

    public int getTransactionPutIn() {
        int counter = 0;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] > 0)
                counter++;
        }
        return counter;
    }
    public int getAvgPutOut() {
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] < 0);
            return sum = this.values[i];
        }
        return avg=sum/getTransactionPutOut();
    }
    public int getAvgPutIn() {
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] > 0);
            return sum = this.values[i];
        }
        return avg=sum/getTransactionPutIn();
    }
}

