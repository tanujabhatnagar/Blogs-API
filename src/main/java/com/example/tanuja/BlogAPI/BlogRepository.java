package com.example.tanuja.BlogAPI;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BlogRepository extends CrudRepository<Blog,Integer>{

}
