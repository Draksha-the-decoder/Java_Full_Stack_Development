package com.rest.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rest.springboot.entities.Ticket;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketBookingRepository extends JpaRepository<Ticket, Integer> {
}