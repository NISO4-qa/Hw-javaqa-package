package ru.netlogy.javaqa.javaqamvn.services;
public class WorkCalcServiceTest {
    public int calculate(int income, int expenses) {
        int treshold = 20_000; // если больше отдыхем
        int money = 0; // количество денег на счету
        int count =0;
        for (int month = 0; month < 12; month++) {
            if (money >= treshold) { // можем ли отдыхать?
                money = money - expenses;
               count++; // увеличиваем счётчик месяцев отдыха
            } else {
                money = money + income;
            }
        }
        return count;
    }
}