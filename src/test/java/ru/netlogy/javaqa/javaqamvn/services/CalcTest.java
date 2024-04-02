package ru.netlogy.javaqa.javaqamvn.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;
public class CalcTest {
    @Test
    public void Calctest(int income, int expenses, int money) {
        WorkCalcService service = new WorkCalcService();

       int count = 0;
        money = service.calculate(income = 10000, expenses = 3000);

        Assertions.assertEquals(count,money);
}}
