package com.example.payments.services.debtor;

import com.example.payments.dao.debtor.DebtorDaoImpl;
import com.example.payments.model.Debtor;
import com.example.payments.services.payment.PaymentServiceImpl;
import java.util.List;
import javax.validation.constraints.Min;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class DebtorServiceImpl implements IDebtorService

{


  private final DebtorDaoImpl debtorDao;

  @Autowired
  public DebtorServiceImpl(DebtorDaoImpl debtorDao)
  {
    this.debtorDao = debtorDao;
  }

  private static final Logger logger = LogManager.getLogger(PaymentServiceImpl.class);

  @Override
  public Debtor addDebtor(Debtor debtor)
  {

    return debtorDao.addDebtor(debtor);
  }

  @Override
  public void updateByID(Integer id, String nameDebtor)
  {
    debtorDao.updateById(id, nameDebtor);
  }

  @Override
  public List<Debtor> getAlldebtors()
  {
    return debtorDao.getAllDeptors();
  }
}
