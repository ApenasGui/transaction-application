package br.com.guilherme_dev.financial_application.Repositories;

import br.com.guilherme_dev.financial_application.Models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
