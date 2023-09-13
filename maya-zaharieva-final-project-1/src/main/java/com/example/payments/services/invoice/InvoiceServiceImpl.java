package com.example.payments.services.invoice;

import com.example.payments.dao.invoice.InvoiceDaoImpl;
import com.example.payments.model.Invoice;
import com.example.payments.services.payment.PaymentServiceImpl;
import java.time.LocalDateTime;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional //TODO Създаване, промяна и изтриване на Фактура Заб.: Частично или напълно платена фактура, не може да бъде изтрита.
@Service
public class InvoiceServiceImpl implements IInvoiceService
{

  private              InvoiceDaoImpl invoiceDao;
  private static final Logger logger = LogManager.getLogger(PaymentServiceImpl.class);
@Autowired
  public InvoiceServiceImpl(InvoiceDaoImpl invoiceDao)
  {
    this.invoiceDao = invoiceDao;
  }

  @Override
  public Invoice saveInvoice(Invoice incoice)
  {
    return null;
  }

  @Override
  public void deleteById(Integer invoiceId)
  {

  }

  @Override
  public Invoice printInvoice(Invoice invoice)
  {
    return null;
  }

  @Override
  public Invoice getById(Integer invoiceId)
  {
    return null;
  }

  @Override
  public List<Invoice> findInvoiceByDueDate(LocalDateTime invoiceDueDate)
  {
    return null;
  }
}
