import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void AssertThrowWithNegativeBalance() {
        assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount("Owner", -20.0);
        });
    }

    @Test
    void getBalanceShouldReturnBalance() {
        double expected = 20.0;
        BankAccount bank = new BankAccount("Owner", expected);
        double actual = bank.getBalance();
        assertEquals(expected, actual);
    }

    @Test
    void getOwner() {
        String expected = "Owner";
        BankAccount bank = new BankAccount(expected, 20.0);
        String actual = bank.getOwner();
        assertEquals(expected, actual);
    }

    @Test
    void depositShouldThrowWithNegAmout() {
        BankAccount bank = new BankAccount("Owner", 20.0);

        assertThrows(IllegalArgumentException.class, () -> {
            bank.deposit(-10);
        });
    }

    @Test
    void depositShouldThrowWithZeroAmout() {
        BankAccount bank = new BankAccount("Owner", 20.0);

        assertThrows(IllegalArgumentException.class, () -> {
            bank.deposit(0);
        });
    }

    @Test
    void depositShouldAddCorrectDeposit() {
        double expected = 30;
        BankAccount bank = new BankAccount("Owner", 20.0);
        bank.deposit(10);
        assertEquals(expected, bank.getBalance());
    }

    @Test
    void withdrawShouldThrowWhenAmoutIsNegative() {
        BankAccount bank = new BankAccount("Owner", 20.0);

        assertThrows(IllegalArgumentException.class, () -> {
            bank.withdraw(-10);
        });
    }

    @Test
    void withdrawShouldThrowWhenAmoutIsZero() {
        BankAccount bank = new BankAccount("Owner", 20.0);

        assertThrows(IllegalArgumentException.class, () -> {
            bank.withdraw(0);
        });
    }

    @Test
    void withdrawShouldThrowWhenAmoutIsSuperiorToBalance() {
        BankAccount bank = new BankAccount("Owner", 20.0);

        assertThrows(IllegalArgumentException.class, () -> {
            bank.withdraw(100);
        });
    }

    @Test
    void withdrawShouldWorkCorrectly() {
        double expected = 50;
        BankAccount bank = new BankAccount("Owner", 200.0);
        bank.withdraw(150);
        assertEquals(expected, bank.getBalance());
    }
}