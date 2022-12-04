package entity;

import java.time.LocalDate;

public class Customer {
    private String customerName;

    private int visitsNum;

    private LocalDate visitsDate;

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", visitsNum=" + visitsNum +
                ", visitsDate=" + visitsDate +
                '}';
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getVisitsNum() {
        return visitsNum;
    }

    public void setVisitsNum(int visitsNum) {
        this.visitsNum = visitsNum;
    }

    public LocalDate getVisitsDate() {
        return visitsDate;
    }

    public void setVisitsDate(LocalDate visitsDate) {
        this.visitsDate = visitsDate;
    }
}
