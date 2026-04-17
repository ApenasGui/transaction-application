package Services;

import Models.DTO.TransactionDTO;
import Models.Transaction;
import Repositories.TransactionRepository;
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
                .orElseThrow(() -> new RuntimeException("Transação não existe"));

        TransactionDTO dto = new TransactionDTO();

        dto.setName(transaction.getName());
        dto.setDescription(transaction.getDescription());
        dto.setAmount(transaction.getAmount());
        dto.setType(transaction.getType());

        return dto;
    }

    public List<TransactionDTO> findAll(){
        List<Transaction> transactionList = transactionRepository.findAll();

        return transactionList.stream().map(TransactionDTO::new).toList();
    }
}
