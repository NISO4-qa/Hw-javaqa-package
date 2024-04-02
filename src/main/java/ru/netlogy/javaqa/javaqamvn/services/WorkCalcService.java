package ru.netlogy.javaqa.javaqamvn.services;

public class WorkCalcService {
    public int calculate(int income, int expenses, int treshold) {
        int money = 0; // количество денег на счету
        int count = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= treshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses;
                money = money / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
