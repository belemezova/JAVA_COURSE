package com.example.payments.dao.debtor;

import com.example.payments.model.Debtor;
import java.util.List;


public interface IDebtorDao
{

  Debtor addDebtor(Debtor debtor);

  void updateById(Integer id, String name);

  List<Debtor> getAllDeptors();

}
