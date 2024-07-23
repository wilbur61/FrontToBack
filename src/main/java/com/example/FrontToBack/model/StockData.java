package com.example.FrontToBack.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StockData {
    private String ticker;
    private int qty;
    private double price;
    private String tradeDate;
}
