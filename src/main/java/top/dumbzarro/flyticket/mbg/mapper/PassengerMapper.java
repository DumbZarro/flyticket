package top.dumbzarro.flyticket.mbg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.dumbzarro.flyticket.mbg.model.Passenger;
import top.dumbzarro.flyticket.mbg.model.PassengerExample;

public interface PassengerMapper {
    int countByExample(PassengerExample example);

    int deleteByExample(PassengerExample example);

    int deleteByPrimaryKey(Integer personId);

    int insert(Passenger record);

    int insertSelective(Passenger record);

    List<Passenger> selectByExample(PassengerExample example);

    Passenger selectByPrimaryKey(Integer personId);

    int updateByExampleSelective(@Param("record") Passenger record, @Param("example") PassengerExample example);

    int updateByExample(@Param("record") Passenger record, @Param("example") PassengerExample example);

    int updateByPrimaryKeySelective(Passenger record);

    int updateByPrimaryKey(Passenger record);
}