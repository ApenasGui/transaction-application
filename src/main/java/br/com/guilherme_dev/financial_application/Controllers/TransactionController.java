package br.com.guilherme_dev.financial_application.Controllers;

import br.com.guilherme_dev.financial_application.Models.DTO.TransactionDTO;
import br.com.guilherme_dev.financial_application.Services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public ResponseEntity<List<TransactionDTO>> findAll(){
        List<TransactionDTO> transactionDTOList = transactionService.findAll();
        return ResponseEntity.ok().body(transactionDTOList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TransactionDTO> findById(@PathVariable Long id){
        TransactionDTO transactionDTO = transactionService.findById(id);
        return ResponseEntity.ok().body(transactionDTO);
    }
}
