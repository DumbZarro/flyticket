package top.dumbzarro.flyticket.mbg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.dumbzarro.flyticket.mbg.model.Flight;
import top.dumbzarro.flyticket.mbg.model.FlightExample;

public interface FlightMapper {
    int countByExample(FlightExample example);

    int deleteByExample(FlightExample example);

    int deleteByPrimaryKey(Integer flightId);

    int insert(Flight record);

    int insertSelective(Flight record);

    List<Flight> selectByExample(FlightExample example);

    Flight selectByPrimaryKey(Integer flightId);

    int updateByExampleSelective(@Param("record") Flight record, @Param("example") FlightExample example);

    int updateByExample(@Param("record") Flight record, @Param("example") FlightExample example);

    int updateByPrimaryKeySelective(Flight record);

    int updateByPrimaryKey(Flight record);
}