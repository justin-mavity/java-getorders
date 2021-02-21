package com.lambdaschool.getorders.services;

import com.lambdaschool.getorders.models.Agent;
import com.lambdaschool.getorders.repositories.AgentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Transactional
@Service(value = "agentService")
public class AgentsServiceImpl implements AgentsService{
    @Autowired
    private AgentsRepository agentsrepos;

    public Agent findAgentById(long id) throws EntityNotFoundException{
        return agentsrepos.findById(id).orElseThrow(()-> new EntityNotFoundException("Agent id " + id + " Not Found"));
    }
}
