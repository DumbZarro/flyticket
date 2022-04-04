package top.dumbzarro.flyticket.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.dumbzarro.flyticket.mbg.mapper.FlightMapper;
import top.dumbzarro.flyticket.mbg.model.Flight;
import top.dumbzarro.flyticket.mbg.model.FlightExample;
import top.dumbzarro.flyticket.service.FlightService;
import top.dumbzarro.flyticket.service.PlaneService;

import java.util.List;

/**
 * Description:
 */
@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    private FlightMapper flightMapper;

    @Autowired
    private PlaneService planeService;

    @Override
    public int createFlight(Flight flight) {
        int planeId=flight.getPlaneId();
        if(planeService.getPlane(planeId)!=null){
            return flightMapper.insertSelective(flight);//修改一行,返回1
        }else{
            return -1;//没有这个飞机,返回-1
        }
    }

    @Override
    public int deleteFlight(int id) {
        return flightMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateFlight(int id, Flight flight) {
        return flightMapper.updateByPrimaryKeySelective(flight);
    }

    @Override
    public Flight getFlight(int id) {
        return flightMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Flight> listAllFlight() {
        return flightMapper.selectByExample(new FlightExample());
    }

    @Override
    public List<Flight> listFlight(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return flightMapper.selectByExample(new FlightExample());
    }
}
