package com.example.payments.dao.payment;

import com.example.payments.model.Currency;
import com.example.payments.model.Invoice;
import com.example.payments.model.Payment;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface IPaymentDao
{

  Payment insertPayment(BigDecimal total, Currency currency, LocalDateTime date, Invoice invoice);

  Payment updatePaymentAmount(BigDecimal amount, String paymentId);

  void deletePayment(String paymentID);


  List<Payment> getPayments();


  Optional<String> checkIfPaymentExist(String paymentId);

}
