package com.tk.reactive_java.repository;

import com.tk.reactive_java.Transaction;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface TransactionRepository extends ReactiveMongoRepository<Transaction, ObjectId> {
}
