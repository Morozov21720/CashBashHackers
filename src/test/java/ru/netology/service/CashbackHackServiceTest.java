package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    @Test
    public void testRemainWhenAmountIsMultipleOfBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals("Ожидаемый остаток должен быть 0.", expected, actual);
    }

    @Test
    public void testRemainWhenAmountIsLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        Assert.assertEquals("Ожидаемый остаток должен быть 100.", expected, actual);
    }

    @Test
    public void testRemainWhenAmountIsMoreThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;
        Assert.assertEquals("Ожидаемый остаток должен быть 900.", expected, actual);
    }

    @Test
    public void testRemainWhenAmountIsZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        Assert.assertEquals("Ожидаемый остаток должен быть 1000.", expected, actual);
    }
}
