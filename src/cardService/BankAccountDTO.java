package cardService;

import java.math.BigDecimal;

public class BankAccountDTO {
    private int id;
    private BigDecimal balance;
    private String cardNumber;
    private String pin;
    private String cvv;
    private String endDate;

    public BankAccountDTO(int id, BigDecimal balance, String cardNumber, String pin, String cvv, String endDate) {
        this.id = id;
        this.balance = balance;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.cvv = cvv;
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
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

    @Override
    public String toString() {
        return "BankAccountDTO{" +
                "id=" + id +
                ", balance=" + balance +
                ", cardNumber='" + cardNumber + '\'' +
                ", pin='" + pin + '\'' +
                ", cvv='" + cvv + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
