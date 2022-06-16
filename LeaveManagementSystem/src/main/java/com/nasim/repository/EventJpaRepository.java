package com.nasim.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nasim.model.Event;

public interface EventJpaRepository extends JpaRepository<Event, Long> {
}
