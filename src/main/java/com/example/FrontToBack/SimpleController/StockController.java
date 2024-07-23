package com.example.FrontToBack.SimpleController;


import com.example.FrontToBack.model.StockData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StockController {

    @GetMapping("/stock-data")
    public String getStockData(Model model) {
        List<StockData> stocks = new ArrayList<>();
        stocks.add(new StockData("AAPL", 100, 150.0, "2024-07-22"));
        stocks.add(new StockData("GOOG", 5000, 2500.0, "2024-07-21"));
        stocks.add(new StockData("IBM", 500, 350.0, "2024-07-21"));
        stocks.add(new StockData("GM", 700, 56.0, "2024-07-21"));
        // ... populate stocks list with data ...
        model.addAttribute("stocks", stocks);
        return "stockData"; // Name of the Thymeleaf template
    }
}
