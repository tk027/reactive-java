package com.tk.reactive_java.service;

import com.tk.reactive_java.Transaction;
import com.tk.reactive_java.repository.TransactionRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class TransactionService {

    private final TransactionRepository repository;

    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    public Flux<Transaction> findAll() {
        return repository.findAll();
    }
}
