package com.example.payments.controllers;


import com.example.payments.model.Debtor;
import com.example.payments.services.debtor.DebtorServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/debtor")
public class DebtorController
{


  private final DebtorServiceImpl debtorService;
  @Autowired
  public DebtorController(DebtorServiceImpl debtorService)
  {

    this.debtorService = debtorService;
  }

  @PostMapping("/add")

  public ResponseEntity<Debtor> createDebtor(@RequestBody @NonNull Debtor debtor)
  {
    Debtor debtorN = debtorService.addDebtor(debtor);
    return new ResponseEntity<>(debtor, HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Void> updateByID(@PathVariable @NonNull Integer idDeptor, @PathVariable @NonNull String name)
  {
    debtorService.updateByID(idDeptor, name);
    return new ResponseEntity<>(HttpStatus.ACCEPTED);
  }

  @GetMapping(("/all"))
  public ResponseEntity<List<Debtor>> getAllDeptors()
  {
    List<Debtor> debtors = debtorService.getAlldebtors();
    return new ResponseEntity<>(debtors, HttpStatus.RESET_CONTENT);
  }
//TODO VALIDATION
}
