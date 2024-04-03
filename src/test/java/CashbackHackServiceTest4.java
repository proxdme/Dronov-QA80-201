import org.junit.Test;
import org.junit.Assert;


public class CashbackHackServiceTest4 {
    @Test
    public void testRemainAmountLessBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900; // amount меньше границы
        int expectedRemain = 100; // Ожидаемый остаток

        int actualRemain = cashbackHackService.remain(amount);

        Assert.assertEquals(actualRemain, expectedRemain);
    }

    @Test
    public void testRemainAmountEqualBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000; // amount равно границе
        int expectedRemain = 0; // Ожидаемый остаток

        int actualRemain = cashbackHackService.remain(amount);

        Assert.assertEquals(actualRemain, expectedRemain);
    }

    @Test
    public void testRemainAmountHighBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1500; // amount больше границы
        int expectedRemain = 500; // Ожидаемый остаток

        int actualRemain = cashbackHackService.remain(amount);

        Assert.assertEquals(actualRemain, expectedRemain);
    }
}

