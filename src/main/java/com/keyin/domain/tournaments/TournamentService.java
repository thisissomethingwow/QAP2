package com.keyin.domain.tournaments;

import com.keyin.domain.members.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static java.lang.String.format;

@Service
public class TournamentService {
    @Autowired
    private TournamentRepository tournamentRepository;

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

    public Tournament getTournamentById(long id){
        return tournamentRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("tournament n ot found with id "+id));
    }

    public List<Member> getMembers(long id){
        Tournament tournament = getTournamentById(id);
        return tournament.getMembers();
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
