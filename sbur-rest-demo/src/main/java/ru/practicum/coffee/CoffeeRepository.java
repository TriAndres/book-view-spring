package ru.practicum.coffee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CoffeeRepository extends CrudRepository<Coffee, String> {
}
