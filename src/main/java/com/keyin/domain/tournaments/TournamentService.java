package com.keyin.domain.tournaments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TournamentService {
    @Autowired
    private  TournamentRepository tournamentRepository;

    public Iterable<Tournament> getAllTournaments(){
        return  tournamentRepository.findAll();
    }

    public Tournament addTournament(Tournament tournament){
        return tournamentRepository.save(tournament);
    }

}
