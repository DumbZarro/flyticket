package top.dumbzarro.flyticket.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.dumbzarro.flyticket.mbg.mapper.OrdersMapper;
import top.dumbzarro.flyticket.mbg.model.Orders;
import top.dumbzarro.flyticket.mbg.model.OrdersExample;
import top.dumbzarro.flyticket.service.FlightService;
import top.dumbzarro.flyticket.service.OrdersService;
import top.dumbzarro.flyticket.service.PassengerService;

import java.util.List;

/**
 * Description:
 */
@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;

    @Autowired
    private PassengerService passengerService;
    @Autowired
    private FlightService flightService;

    @Override
    public int createOrders(Orders orders) {
        int flight_id = orders.getFlightId();
        int passenger_id= orders.getPersonId();
        if(flightService.getFlight(flight_id)!=null){
            if(passengerService.getPassenger(passenger_id)!=null){
                return ordersMapper.insertSelective(orders);//修改一行,返回1
            }else{
                return -1;//没有这个乘客,返回-1
            }
        }else{
            return -2;//没有这个航班,返回-2
        }
    }

    @Override
    public int deleteOrders(int id) {
        return ordersMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateOrders(int id, Orders orders) {
        return ordersMapper.updateByPrimaryKey(orders);
    }

    @Override
    public Orders getOrders(int id) {
        return ordersMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Orders> listAllOrders() {
        return ordersMapper.selectByExample(new OrdersExample());
    }

    @Override
    public List<Orders> listOrders(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return ordersMapper.selectByExample(new OrdersExample());
    }
}
