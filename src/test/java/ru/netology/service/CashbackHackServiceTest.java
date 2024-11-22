package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {

    @Test
    public void testRemainWhenAmountIsMultipleOfBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected, "Ожидаемый остаток должен быть 0.");
    }

    @Test
    public void testRemainWhenAmountIsLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;
        int actual = service.remain(amount);
        int expected = 300;
        Assert.assertEquals(actual, expected, "Ожидаемый остаток должен быть 300.");
    }

    @Test
    public void testRemainWhenAmountIsMoreThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1200;
        int actual = service.remain(amount);
        int expected = 800;
        Assert.assertEquals(actual, expected, "Ожидаемый остаток должен быть 800.");
    }

    @Test
    public void testRemainWhenAmountIsZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        Assert.assertEquals(actual, expected, "Ожидаемый остаток должен быть 1000.");
    }
}
