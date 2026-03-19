package service;

import java.math.BigDecimal;

import pojo.MarginAccount;
import pojo.TradeAccount;
import repository.TradeAccountRepository;

public class MarginAccountService implements TradeAccountService{

    private TradeAccountRepository tradeAccountRepository;
    

    public MarginAccountService(TradeAccountRepository tradeAccountRepository) {
        this.tradeAccountRepository = tradeAccountRepository;
    }

    @Override
    public void deposit(String id, BigDecimal amount){
        MarginAccount marginAccount = retrieveTradeAccount(id);
        marginAccount.setMargin(marginAccount.getMargin().add(amount));
        updateTradeAccount(marginAccount);
    }

    @Override
    public void withdraw(String id, BigDecimal amount){
        MarginAccount marginAccount = retrieveTradeAccount(id);
        marginAccount.setMargin(marginAccount.getMargin().subtract(amount));
        updateTradeAccount(marginAccount);
    }

    public void createTradeAccount(MarginAccount marginAccount){
        tradeAccountRepository.createTradeAccount(marginAccount);
    }

    public MarginAccount retrieveTradeAccount(String id){
        return (MarginAccount)tradeAccountRepository.retrieveTradeAccount(id);
    }

    public void updateTradeAccount(MarginAccount marginAccount){
        tradeAccountRepository.updateTradeAccount(marginAccount);
    }

    public void deleteTradeAccount (String id){
        tradeAccountRepository.deleteTradeAccount(id);
    }


}