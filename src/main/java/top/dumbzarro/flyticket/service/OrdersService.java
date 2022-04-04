package top.dumbzarro.flyticket.service;

import org.springframework.transaction.annotation.Transactional;
import top.dumbzarro.flyticket.mbg.model.Orders;

import java.util.List;

/**
 * Description:
 */
public interface OrdersService {

    @Transactional
    int createOrders(Orders orders);

    @Transactional
    int deleteOrders(int id);

    @Transactional
    int updateOrders(int id, Orders orders);

    Orders getOrders(int id);

    List<Orders> listAllOrders();

    List<Orders> listOrders(int pageNum, int pageSize);
}
