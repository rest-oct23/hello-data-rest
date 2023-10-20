package com.example.hellodatarest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "winery")
public interface WineryRepository extends CrudRepository<Winery,Integer> {
}
