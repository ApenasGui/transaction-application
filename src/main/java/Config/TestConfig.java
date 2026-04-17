package Config;

import Models.Transaction;
import Repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public void run(String... args) throws Exception {
        Transaction transaction01 = new Transaction(null, "McDonnald's da madrugada", "Lanche pós rolê", "Saída", 47.99);
        Transaction transaction02 = new Transaction(null, "Jogo na steam", "Lançamento Pragmata", "Saída", 249.99);

        transactionRepository.saveAll(Arrays.asList(transaction01, transaction02));
    }
}
