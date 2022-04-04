package top.dumbzarro.flyticket.mbg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.dumbzarro.flyticket.mbg.model.Plane;
import top.dumbzarro.flyticket.mbg.model.PlaneExample;

public interface PlaneMapper {
    int countByExample(PlaneExample example);

    int deleteByExample(PlaneExample example);

    int deleteByPrimaryKey(Integer planeId);

    int insert(Plane record);

    int insertSelective(Plane record);

    List<Plane> selectByExample(PlaneExample example);

    Plane selectByPrimaryKey(Integer planeId);

    int updateByExampleSelective(@Param("record") Plane record, @Param("example") PlaneExample example);

    int updateByExample(@Param("record") Plane record, @Param("example") PlaneExample example);

    int updateByPrimaryKeySelective(Plane record);

    int updateByPrimaryKey(Plane record);
}