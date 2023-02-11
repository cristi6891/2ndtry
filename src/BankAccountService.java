import java.awt.*;
import java.time.LocalTime;
import java.util.ArrayList;

public class BankAccountService {

    public static void main(String[] args) {

        UserDetails userDetails = new UserDetails();
        userDetails.setFirstName("Ion");
        userDetails.setLastName("Popescu");
        userDetails.setEmail("popescu@gmail.com");

        UserBankAccount userBankAccount = new UserBankAccount();
        userBankAccount.setUsername("cristi");
        userBankAccount.setBic("F34GBG");
        userBankAccount.setBalance(2656465.65);
        userBankAccount.setIban("ING7657657876JHGJ897698");
        userBankAccount.setUserDetails(userDetails);

        double balance = userBankAccount.getBalance();
        double amountSpent = 988.55;
        double overflowAmount = 99999999651.65;

        BankAccountService bankAccountService = new BankAccountService();
        double valueAfterAtmWithdraw = bankAccountService.atmWithdrawMoney(balance, amountSpent);
        userBankAccount.setBalance(valueAfterAtmWithdraw);
        System.out.println("Updated balance after ATM withdraw:" + userBankAccount.getBalance());


    }


    public double atmWithdrawMoney(double balance, double amountWithdraw) {
        if (amountWithdraw > balance) {
            System.out.println("You don t have enough money!");
            return balance;
        }
        double remainingAmount = balance - amountWithdraw;
        System.out.println("succes!" + remainingAmount);
        return remainingAmount;

    }

    public double bankWithdrawMoney(String currentDay, int currentHour, double balance, double amountWithdraw) {
        List workingDays = new ArrayList<>();
        workingDays.add("Monday");
        workingDays.add("Tuesday");
        workingDays.add("Wednesday");
        workingDays.add("Thursday");
        workingDays.add("Friday");

        if (!workingDays.contains(currentDay)) {
            System.out.println("Pls come back another time");
            return balance;
        }

        LocalTime currentTime = LocalTime.now();
        LocalTime morningTime = LocalTime.of(8, 0);
        LocalTime afternoonTime = LocalTime.of(16, 0);
        if (currentTime.isBefore(morningTime) || currentTime.isAfter(afternoonTime)) {
            System.out.println("bla bla");
        }


    }
}
