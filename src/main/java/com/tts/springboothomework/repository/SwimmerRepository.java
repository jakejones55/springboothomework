package com.tts.springboothomework.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.tts.springboothomework.domain.Swimmers;

public interface SwimmerRepository extends CrudRepository<Swimmers, Long>{
    List<Swimmers> findByLapTime(Integer lapTime);
}
