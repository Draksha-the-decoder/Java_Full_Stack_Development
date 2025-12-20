package com.rest.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.springboot.repository.TicketBookingRepository;
import com.rest.springboot.entities.Ticket;
import java.util.List;

@Service
public class TicketBookingService {
	@Autowired
	private TicketBookingRepository ticketBookingRepository;

	public Ticket createTicket(Ticket ticket) {
		return ticketBookingRepository.save(ticket);
	}

	public Ticket getTicketById(Integer ticketId) {
		return ticketBookingRepository.findById(ticketId).get();
	}

	public List<Ticket> getAllBookedTickets() {
		return ticketBookingRepository.findAll();
	}

	public void deleteTicket(Integer ticketId) {
		ticketBookingRepository.deleteById(ticketId);
	}

	public Ticket updateTicket(Integer ticketId, String newEmail) {
		Ticket ticketFromDb = ticketBookingRepository.findById(ticketId).get();
		ticketFromDb.setEmail(newEmail);
		Ticket upadedTicket = ticketBookingRepository.save(ticketFromDb);
		return upadedTicket;
	}
}