package com.example.payments.dao.invoice;

import com.example.payments.model.Invoice;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Repository;

@Repository
public class InvoiceDaoImpl implements IInvoiceDao
{

  private final NamedParameterJdbcOperations jdbcTemp;

  @Autowired
  public InvoiceDaoImpl(NamedParameterJdbcOperations jdbcTemp)
  {
    this.jdbcTemp = jdbcTemp;
  }

  @Override
  public Invoice createInvoice(Invoice incoice)
  {


    return null;
  }
  @Override
  public Invoice updateInvoice(Integer id, Invoice incoice)
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
