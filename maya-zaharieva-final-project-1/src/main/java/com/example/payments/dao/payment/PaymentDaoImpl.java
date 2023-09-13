package com.example.payments.dao.payment;

import com.example.payments.model.Currency;
import com.example.payments.model.Invoice;
import com.example.payments.model.Payment;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentDaoImpl implements IPaymentDao
{

  @Override
  public Payment insertPayment(BigDecimal total, Currency currency, LocalDateTime date, Invoice invoice)
  {
    return null;
  }

  @Override
  public Payment updatePaymentAmount(BigDecimal amount, String paymentId)
  {
    return null;
  }

  @Override
  public void deletePayment(String paymentID)
  {

  }

  @Override
  public List<Payment> getPayments()
  {
    return null;
  }

  @Override
  public Optional<String> checkIfPaymentExist(String paymentId)
  {
    return Optional.empty();
  }
}
