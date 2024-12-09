package com.tk.reactive_java;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Transaction {

    @Id
    private ObjectId id;
    private String description;
    private Number amount;

    public ObjectId getId() {
        return id;
    }

    public Transaction setId(ObjectId id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Transaction setDescription(String description) {
        this.description = description;
        return this;
    }

    public Number getAmount() {
        return amount;
    }

    public Transaction setAmount(Number amount) {
        this.amount = amount;
        return this;
    }
}