package com.example.payments.dao.debtor;

import com.example.payments.model.Debtor;
import com.example.payments.services.payment.PaymentServiceImpl;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.InvalidPropertyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class DebtorDaoImpl implements IDebtorDao
{


  private final        NamedParameterJdbcOperations jdbcDaoTemplate;
  private              String                       sqlDeptByOldID = "SELECT d.* FROM MAYA_ZAHARIEVA.DEBTOR d WHERE d"
      + ".id_person   = :id";
  private              String                       allDeptors     = "SELECT d.* FROM MAYA_ZAHARIEVA.DEBTOR";
  private static final Logger                       logger         = LogManager.getLogger(DebtorDaoImpl.class);

  @Autowired
  public DebtorDaoImpl(NamedParameterJdbcOperations jdbcDaoTemplate)
  {

    this.jdbcDaoTemplate = jdbcDaoTemplate;
  }


  public Debtor addDebtor(Debtor debtor)
  {
    KeyHolder keyHolder = new GeneratedKeyHolder();
    String sql =
        "INSERT INTO MAYA_ZAHARIEVA.DEBTOR    \"\n"
            + "       +\"      (DEBTOR_NAME)  \"\n"
            + "       +\"   VALUES            \"\n"
            + "       +\"     (:name)         \"\n";

    MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource().addValue("name", debtor.getName());
    jdbcDaoTemplate.update(sql, mapSqlParameterSource, keyHolder, new String[]{"deptorId"});
    try {
      Integer id = keyHolder
          .getKey()
          .intValue();
      Debtor deptorNew = new Debtor();
      deptorNew.setDebtorID(id);
      deptorNew.setName(debtor.getName());
      System.out.println("ok");
      return deptorNew;
    }
    catch (InvalidDataAccessApiUsageException ex) {
      return null;
    }
  }

  public List<Debtor> getAllDeptors()
  {
    List<Debtor> listWithDeptors = jdbcDaoTemplate.query(allDeptors, rs -> {
      List<Debtor> extractListDeptors = new ArrayList<>();
      while (rs.next()) {
        Debtor deptor = new Debtor();
        deptor.setDebtorID(rs.getInt("id_person"));
        deptor.setName(rs.getString("debtor_name"));
        extractListDeptors.add(deptor);
      }
      return extractListDeptors;
    });
    return listWithDeptors;

  }


  @Override
  public void updateById(Integer id, String newNameDeptor)
  {
    String sql = sqlDeptByOldID;
    MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource().addValue("name", newNameDeptor);
    jdbcDaoTemplate.update(sql, mapSqlParameterSource);
    logger.debug("Getting user by id {}", id);

    try {
      jdbcDaoTemplate.queryForObject(sql, mapSqlParameterSource,
          BeanPropertyRowMapper.newInstance(DebtorDaoImpl.class));
    }
    catch (EmptyResultDataAccessException e) {
      ;
    }

  }


}
