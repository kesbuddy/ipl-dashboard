package com.priyanshu.ipldata.repository;

import org.springframework.data.repository.CrudRepository;

import com.priyanshu.ipldata.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>  {

    Team findByTeamName(String teamName);
    
}
