package lesson37.data;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;

public class Order {

    private int orderNumber;
    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDateTime orderDate;

    public Order(int orderNumber, LocalDateTime orderDate) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order [orderNumber=" + orderNumber + ", orderDate=" + orderDate + "]";
    }

}
