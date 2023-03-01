package cardService;

import java.math.BigDecimal;

public class BankAccountDTOString {
    private String id;
    private String balance;
    private String cardNumber;
    private String pin;
    private String cvv;
    private String endDate;

    public BankAccountDTOString(String id, String balance, String cardNumber, String pin, String cvv, String endDate) {
        this.id = id;
        this.balance = balance;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.cvv = cvv;
        this.endDate = endDate;
    }

    public BankAccountDTOString() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
