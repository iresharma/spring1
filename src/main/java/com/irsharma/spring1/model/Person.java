package com.irsharma.spring1.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Person {
    private final UUID id;
    private final String name;
    private final String email;
    private final String phone;
    private final String category;

    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String name,
                  @JsonProperty("email") String email,
                  @JsonProperty("phone") String phone,
                  @JsonProperty("category ") String category) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.category = category;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getCategory() {
        return category;
    }
}
