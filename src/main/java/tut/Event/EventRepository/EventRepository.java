package tut.Event.EventRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tut.Event.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {
}
