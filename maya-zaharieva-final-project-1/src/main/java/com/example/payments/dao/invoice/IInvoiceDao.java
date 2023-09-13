package com.example.payments.dao.invoice;

import com.example.payments.model.Invoice;
import java.time.LocalDateTime;
import java.util.List;

public interface IInvoiceDao
{

  Invoice createInvoice(Invoice incoice);

  Invoice updateInvoice(Integer id, Invoice incoice);

  void deleteById(Integer invoiceId);

  Invoice printInvoice(Invoice invoice);

  Invoice getById(Integer invoiceId);

  List<Invoice> findInvoiceByDueDate(LocalDateTime invoiceDueDate);

}
