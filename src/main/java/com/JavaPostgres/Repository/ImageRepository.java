package com.JavaPostgres.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.JavaPostgres.model.*;


@Repository
public interface ImageRepository extends CrudRepository<Image, Long>{

}

