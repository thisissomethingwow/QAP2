package com.keyin.domain.tournaments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/tournaments")
@CrossOrigin
public class TournamentController {
    @Autowired
    private TournamentService tournamentService;

    @GetMapping
    public List<Tournament> getAllTournaments(){
        return tournamentService.getAllTournaments();
    }

    @PostMapping
    public Tournament addTournament(@RequestBody Tournament tournament){
        return tournamentService.addTournament(tournament);
    }

    @GetMapping("/startDate_search")
    public List<Tournament> getTournamentByStartDate(@RequestParam("startDate")@DateTimeFormat(pattern = "yyyy-MM-dd")Date startDate){
        return tournamentService.getTournamentByStartDate(startDate);
    }

    @GetMapping("/location_search")
    public List<Tournament> getTournamentByLocation(@RequestParam("location")String location){
        return tournamentService.getTournamentByLocation(location);
    }

}
