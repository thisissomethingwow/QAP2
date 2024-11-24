package com.keyin.domain.tournaments;

import com.keyin.domain.members.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface TournamentRepository extends CrudRepository<Tournament,Long> {
    public List<Tournament> findByStartDate(Date startDate);
    public List<Tournament> findByLocation(String location);

}
