package com.esprit.workshop.services;

import com.esprit.workshop.entities.Stock;
import com.esprit.workshop.repositories.StockRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IStockServiceImp implements IStockService{
    private final StockRepository stockRepository;
    @Override
    public List<Stock> retrieveAllStocks() {
        return stockRepository.findAll();
    }

    @Override
    public Stock addStock(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public Stock updateStock(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public Stock retrieveStock(Long idStock) {
        return stockRepository.findById(idStock).orElse(null);
    }
}
