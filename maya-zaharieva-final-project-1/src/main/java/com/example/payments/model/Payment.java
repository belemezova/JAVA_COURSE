package com.example.payments.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Component
public class Payment
{  private Integer idPayment;
  private BigDecimal total;
  private Integer currencyId;
  private LocalDateTime date;
  private Integer invoiceID;

  public Payment()
  {
  }

  public Payment(Integer idPayment, BigDecimal total, Integer currencyId, LocalDateTime date, Integer invoiceID)
  {
    this.idPayment = idPayment;
    this.total = total;
    this.currencyId = currencyId;
    this.date = date;
    this.invoiceID = invoiceID;
  }

  public Integer getIdPayment()
  {
    return idPayment;
  }

  public void setIdPayment(Integer idPayment)
  {
    this.idPayment = idPayment;
  }

  public BigDecimal getTotal()
  {
    return total;
  }

  public void setTotal(BigDecimal total)
  {
    this.total = total;
  }

  public Integer getCurrencyId()
  {
    return currencyId;
  }

  public void setCurrencyId(Integer currencyId)
  {
    this.currencyId = currencyId;
  }

  public LocalDateTime getDate()
  {
    return date;
  }

  public void setDate(LocalDateTime date)
  {
    this.date = date;
  }

  public Integer getInvoiceID()
  {
    return invoiceID;
  }

  public void setInvoiceID(Integer invoiceID)
  {
    this.invoiceID = invoiceID;
  }
}
