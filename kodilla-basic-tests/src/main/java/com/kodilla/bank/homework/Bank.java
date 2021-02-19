package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] values;
    private int size;

    public Bank() {
        this.size = 0;
        this.values = new CashMachine[0];
    }

    public void add(CashMachine value) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
    }
    public int allBilance(){
        int sum = 0;
        for (int i = 0; i < values.length; i++){
            sum = sum + values[i].getSuma();
        }
        return sum;
    }
    public int getAllTransactionPutOut() {
        int counter = 0;
        for (int i = 0; i < this.values.length; i++) {
            if (values[i].getTransactionPutOut() < 0)
                counter++;
        }
        return counter;
    }
    public int getAllTransactionPutIn() {
        int counter = 0;
        for (int i = 0; i < this.values.length; i++) {
            if (values[i].getTransactionPutIn() > 0)
                counter++;
        }
        return counter;
    }
    public int getAllAvgPutOut() {
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < this.values.length; i++) {
            if (values[i].getTransactionPutOut() < 0);
            return sum = values[i].getTransactionPutOut();
        }
        return avg=sum/getAllTransactionPutOut();
    }
    public int getAllAvgPutIn() {
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < this.values.length; i++) {
            if (values[i].getTransactionPutIn() < 0);
            return sum = values[i].getTransactionPutIn();
        }
        return avg=sum/getAllTransactionPutIn();
    }
}

