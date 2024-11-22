package com.keyin.domain.tournaments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TournamentService {
    @Autowired
    private  TournamentRepository tournamentRepository;

    public List<Tournament> getAllTournaments(){
        return (List<Tournament>) tournamentRepository.findAll();
    }

    public Tournament addTournament(Tournament tournament){
        return tournamentRepository.save(tournament);
    }

}
