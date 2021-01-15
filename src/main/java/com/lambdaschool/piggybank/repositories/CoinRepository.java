package com.lambdaschool.piggybank.repositories;

import com.lambdaschool.piggybank.models.Coin;
import org.springframework.data.repository.CrudRepository;

//Coin repo
public interface CoinRepository extends CrudRepository<Coin, Long>
{
    boolean test (Coin c);
}
