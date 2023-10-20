package com.example.hellodatarest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "winery")
public interface WineryRepository extends CrudRepository<Winery,Integer> {
    @RestResource(path = "name", rel="name")
    List<Winery> findByNameContains(@Param("q") String name);
}
