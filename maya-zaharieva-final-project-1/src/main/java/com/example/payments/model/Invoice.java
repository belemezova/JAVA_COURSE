package com.example.payments.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.AllArgsConstructor.AnyAnnotation;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Local;
import org.springframework.stereotype.Component;

@Component
public class Invoice
{

  private Integer       invoiceId;
  private String        invoiceNumber;
  private LocalDateTime date;
  private BigDecimal    total;
  private Integer      currencyID;
  private Integer        debtorID;
  private LocalDateTime dueDate;
  public Invoice()
  {
  }

  public Invoice(Integer invoiceId, String invoiceNumber, LocalDateTime date, BigDecimal total, Integer currencyID,
      Integer debtorID, LocalDateTime dueDate)
  {
    this.invoiceId = invoiceId;
    this.invoiceNumber = invoiceNumber;
    this.date = date;
    this.total = total;
    this.currencyID = currencyID;
    this.debtorID = debtorID;
    this.dueDate = dueDate;
  }

  public Integer getInvoiceId()
  {
    return invoiceId;
  }

  public void setInvoiceId(Integer invoiceId)
  {
    this.invoiceId = invoiceId;
  }

  public String getInvoiceNumber()
  {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber)
  {
    this.invoiceNumber = invoiceNumber;
  }

  public LocalDateTime getDate()
  {
    return date;
  }

  public void setDate(LocalDateTime date)
  {
    this.date = date;
  }

  public BigDecimal getTotal()
  {
    return total;
  }

  public void setTotal(BigDecimal total)
  {
    this.total = total;
  }

  public Integer getCurrencyID()
  {
    return currencyID;
  }

  public void setCurrencyID(Integer currencyID)
  {
    this.currencyID = currencyID;
  }

  public Integer getDebtorID()
  {
    return debtorID;
  }

  public void setDebtorID(Integer debtorID)
  {
    this.debtorID = debtorID;
  }

  public LocalDateTime getDueDate()
  {
    return dueDate;
  }

  public void setDueDate(LocalDateTime dueDate)
  {
    this.dueDate = dueDate;
  }
}
