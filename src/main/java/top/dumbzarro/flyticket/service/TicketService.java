package top.dumbzarro.flyticket.service;

import top.dumbzarro.flyticket.mbg.model.Ticket;

import java.util.List;

/**
 * Description:
 */
public interface TicketService {
    int createTicket(Ticket ticket);

    int deleteTicket(int id);

    int updateTicket(int id, Ticket ticket);

    Ticket getTicket(int id);

    List<Ticket> listAllTicket();

    List<Ticket> listTicket(int pageNum, int pageSize);
}
