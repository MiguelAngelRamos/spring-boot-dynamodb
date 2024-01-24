package com.easy2excel.springbootawsdynamodbcrud.repository;

import com.easy2excel.springbootawsdynamodbcrud.entity.Product;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableScan
public interface ProductRepository extends CrudRepository<Product,String> {
}

//  La anotación @EnableScan en Spring Data para DynamoDB permite realizar operaciones de escaneo completas en la tabla de DynamoDB, lo que significa que puedes leer todos los registros de la tabla y no solo aquellos que coinciden con un índice específico. Es útil pero menos eficiente y se debe usar con precaución debido al mayor costo y tiempo de ejecución que conlleva.
