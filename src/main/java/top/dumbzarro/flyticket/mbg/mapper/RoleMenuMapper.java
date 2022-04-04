package top.dumbzarro.flyticket.mbg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.dumbzarro.flyticket.mbg.model.RoleMenu;
import top.dumbzarro.flyticket.mbg.model.RoleMenuExample;

public interface RoleMenuMapper {
    int countByExample(RoleMenuExample example);

    int deleteByExample(RoleMenuExample example);

    int deleteByPrimaryKey(@Param("roleId") Integer roleId, @Param("menuId") Integer menuId);

    int insert(RoleMenu record);

    int insertSelective(RoleMenu record);

    List<RoleMenu> selectByExample(RoleMenuExample example);

    int updateByExampleSelective(@Param("record") RoleMenu record, @Param("example") RoleMenuExample example);

    int updateByExample(@Param("record") RoleMenu record, @Param("example") RoleMenuExample example);
}