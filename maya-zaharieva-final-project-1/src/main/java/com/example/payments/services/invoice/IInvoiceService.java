package com.example.payments.services.invoice;

import com.example.payments.model.Invoice;
import java.time.LocalDateTime;
import java.util.List;

public interface IInvoiceService //Създаване, промяна и изтриване на Фактура
{
  Invoice saveInvoice(Invoice incoice);

  void deleteById(Integer invoiceId);
  Invoice printInvoice(Invoice invoice);
  Invoice getById(Integer invoiceId);
  List<Invoice> findInvoiceByDueDate(LocalDateTime invoiceDueDate);

}
