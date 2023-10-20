package com.example.hellodatarest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "region")
public interface RegionRepository extends CrudRepository<Region,Integer> {
}
