package com.lambdaschool.getorders.repositories;


import com.lambdaschool.getorders.models.Agent;
import org.springframework.data.repository.CrudRepository;

public interface AgentsRepository extends CrudRepository<Agent, Long> {

}
