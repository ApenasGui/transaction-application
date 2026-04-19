package br.com.guilherme_dev.financial_application.Services;

import br.com.guilherme_dev.financial_application.Models.DTO.TransactionDTO;
import br.com.guilherme_dev.financial_application.Models.Transaction;
import br.com.guilherme_dev.financial_application.Repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public TransactionDTO findById(Long id){
        Transaction transaction = transactionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transação não encontrada"));

        return convertToDto(transaction);
    }

    public List<TransactionDTO> findAll(){
        List<Transaction> transactionList = transactionRepository.findAll();

        return transactionList.stream().map(this::convertToDto).toList();
    }

    public TransactionDTO convertToDto(Transaction transaction){
        TransactionDTO dto = new TransactionDTO(transaction);
        dto.setId(transaction.getId());
        dto.setName(transaction.getName());
        dto.setDescription(transaction.getDescription());
        dto.setAmount(transaction.getAmount());
        dto.setType(transaction.getType());
        return dto;
    }
}
