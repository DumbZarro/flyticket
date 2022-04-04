package top.dumbzarro.flyticket.service.impl;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.dumbzarro.flyticket.mbg.mapper.PassengerMapper;
import top.dumbzarro.flyticket.mbg.model.Passenger;
import top.dumbzarro.flyticket.mbg.model.PassengerExample;
import top.dumbzarro.flyticket.service.PassengerService;

import java.util.List;

/**
 * Description:
 */
@Service
public class PassengerServiceImpl implements PassengerService {

    @Autowired
    private PassengerMapper passengerMapper;

    @Override
    public int createPassenger(Passenger passenger) {
        return passengerMapper.insertSelective(passenger);
    }

    @Override
    public int deletePassenger(int id) {
        return passengerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updatePassenger(int id, Passenger passenger) {
        passenger.setPersonId(id);
        return passengerMapper.updateByPrimaryKeySelective(passenger);
    }

    @Override
    public Passenger getPassenger(int id) {
        return passengerMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Passenger> listAllPassenger() {
        return passengerMapper.selectByExample(new PassengerExample());
    }

    @Override
    public List<Passenger> listPassenger(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return passengerMapper.selectByExample(new PassengerExample());
    }
}
