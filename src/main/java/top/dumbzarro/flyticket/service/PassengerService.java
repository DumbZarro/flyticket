package top.dumbzarro.flyticket.service;
import java.util.List;
import top.dumbzarro.flyticket.mbg.model.Passenger;
/**
 * Description:
 */
public interface PassengerService {

    int createPassenger(Passenger passenger);

    int deletePassenger(int id);

    int updatePassenger(int id, Passenger passenger);

    Passenger getPassenger(int id);

    List<Passenger> listAllPassenger();

    List<Passenger> listPassenger(int pageNum, int pageSize);
}
