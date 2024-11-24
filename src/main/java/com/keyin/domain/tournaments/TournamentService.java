package com.keyin.domain.tournaments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

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

    public List<Tournament> getTournamentByStartDate(Date startDate){
        return tournamentRepository.findByStartDate(startDate);
    }

    public List<Tournament> getTournamentByLocation(String location){
        return tournamentRepository.findByLocation(location);
    }


    public Tournament updateTournament(long id,Tournament updatedTournament){
        Optional<Tournament> tournamentToUpdateOptional = tournamentRepository.findById(id);
        if (tournamentToUpdateOptional.isPresent()){
            Tournament tournamentToUpdate = tournamentToUpdateOptional.get();
            tournamentToUpdate.setCashPrizeAmount((updatedTournament.getCashPrizeAmount()));
            tournamentToUpdate.setStartDate((updatedTournament.getStartDate()));
            tournamentToUpdate.setEntryFee((updatedTournament.getEntryFee()));
            tournamentToUpdate.setEndDate((updatedTournament.getEndDate()));
            tournamentToUpdate.setLocation((updatedTournament.getLocation()));
            tournamentToUpdate.setMembers(updatedTournament.getMembers());
            return tournamentRepository.save(tournamentToUpdate);
        }
        return null;
    }


}
