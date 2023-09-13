package com.example.payments.model;

import org.springframework.stereotype.Component;

@Component
public class Debtor
{

  private Integer debtorID;
  private String name;

  public Debtor()
  {
  }

  public Debtor(Integer debtorID, String name)
  {
    this.debtorID = debtorID;
    this.name = name;
  }

  public Integer getDebtorID()
  {
    return debtorID;
  }

  public void setDebtorID(Integer debtorID)
  {
    this.debtorID = debtorID;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

}
