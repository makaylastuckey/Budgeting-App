import javax.swing.*;

public class Transaction {
    private String description;
    private double amount;
    private String date;

    public Transaction(){
        description = "";
        amount = 0.0;
        date = "";
    }

    public Transaction(String description, double amount, String date){
        this.description = description;
        this.amount = amount;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
