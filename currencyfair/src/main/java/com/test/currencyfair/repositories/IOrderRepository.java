package com.test.currencyfair.repositories;

import com.test.currencyfair.models.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

/**
 * Repository class for storing/retrieving order entities from mongodb.
 */
public interface IOrderRepository extends MongoRepository<Order,String> {

}
