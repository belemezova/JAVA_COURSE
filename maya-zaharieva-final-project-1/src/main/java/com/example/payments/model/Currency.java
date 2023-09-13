package com.example.payments.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Currency
{

  private int    currencyId;
  private String symbol;
  private String     name;
  private BigDecimal exchangeRateBgn;
  private BigDecimal reverseRateOneBgn;

  public Currency()
  {
  }

  public Currency(int currencyId, String symbol, String name, BigDecimal exchangeRateBgn, BigDecimal reverseRateOneBgn)
  {
    this.currencyId = currencyId;
    this.symbol = symbol;
    this.name = name;
    this.exchangeRateBgn = exchangeRateBgn;
    this.reverseRateOneBgn = reverseRateOneBgn;
  }

  public int getCurrencyId()
  {
    return currencyId;
  }

  public void setCurrencyId(int currencyId)
  {
    this.currencyId = currencyId;
  }

  public String getSymbol()
  {
    return symbol;
  }

  public void setSymbol(String symbol)
  {
    this.symbol = symbol;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public BigDecimal getExchangeRateBgn()
  {
    return exchangeRateBgn;
  }

  public void setExchangeRateBgn(BigDecimal exchangeRateBgn)
  {
    this.exchangeRateBgn = exchangeRateBgn;
  }

  public BigDecimal getReverseRateOneBgn()
  {
    return reverseRateOneBgn;
  }

  public void setReverseRateOneBgn(BigDecimal reverseRateOneBgn)
  {
    this.reverseRateOneBgn = reverseRateOneBgn;
  }
}
