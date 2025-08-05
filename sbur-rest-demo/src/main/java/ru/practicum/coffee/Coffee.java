package ru.practicum.coffee;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coffee {
    @Id
    private String id;
    private String name;

    public Coffee(String name) {
        this(UUID.randomUUID().toString(), name);
    }
}
