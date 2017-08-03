package me.moosecanswim.startinvoiceapp.repositories;

import me.moosecanswim.startinvoiceapp.Models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository <Product,Long>{

}
