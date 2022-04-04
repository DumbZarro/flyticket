package top.dumbzarro.flyticket.service;

import top.dumbzarro.flyticket.mbg.model.Flight;

import java.util.List;

/**
 * Description:
 */
public interface FlightService {
    int createFlight(Flight flight);

    int deleteFlight(int id);

    int updateFlight(int id,Flight flight);

    Flight getFlight(int id);

    List<Flight> listAllFlight();

    List<Flight> listFlight(int pageNum, int pageSize);
}
