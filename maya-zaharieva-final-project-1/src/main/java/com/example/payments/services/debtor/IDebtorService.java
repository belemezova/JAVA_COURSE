package com.example.payments.services.debtor;

import com.example.payments.model.Debtor;
import java.util.List;


public interface IDebtorService
{

  Debtor addDebtor(Debtor debtor);

  void updateByID(Integer id, String nameDebtor);

  List<Debtor> getAlldebtors();
}
