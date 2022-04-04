package top.dumbzarro.flyticket.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.dumbzarro.flyticket.mbg.mapper.TicketMapper;
import top.dumbzarro.flyticket.mbg.model.Ticket;
import top.dumbzarro.flyticket.mbg.model.TicketExample;
import top.dumbzarro.flyticket.service.OrdersService;
import top.dumbzarro.flyticket.service.TicketService;

import java.util.List;

/**
 * Description:
 */
@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketMapper ticketMapper;

    @Autowired
    private OrdersService ordersService;

    @Override
    public int createTicket(Ticket ticket) {
        int orderId=ticket.getOrdersId();
        if(ordersService.getOrders(orderId)!=null){
            return ticketMapper.insertSelective(ticket);//修改一行,返回1
        }else{
            return -1;//没有这个订单,返回-1
        }
    }

    @Override
    public int deleteTicket(int id) {
        return ticketMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateTicket(int id, Ticket ticket) {
        ticket.setTicketId(id);
        return ticketMapper.updateByPrimaryKeySelective(ticket);
    }

    @Override
    public Ticket getTicket(int id) {
        return ticketMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Ticket> listAllTicket() {
        return ticketMapper.selectByExample(new TicketExample());
    }

    @Override
    public List<Ticket> listTicket(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return ticketMapper.selectByExample(new TicketExample());
    }
}
