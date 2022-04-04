package top.dumbzarro.flyticket.mbg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.dumbzarro.flyticket.mbg.model.AdminUsers;
import top.dumbzarro.flyticket.mbg.model.AdminUsersExample;

public interface AdminUsersMapper {
    int countByExample(AdminUsersExample example);

    int deleteByExample(AdminUsersExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(AdminUsers record);

    int insertSelective(AdminUsers record);

    List<AdminUsers> selectByExample(AdminUsersExample example);

    AdminUsers selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") AdminUsers record, @Param("example") AdminUsersExample example);

    int updateByExample(@Param("record") AdminUsers record, @Param("example") AdminUsersExample example);

    int updateByPrimaryKeySelective(AdminUsers record);

    int updateByPrimaryKey(AdminUsers record);
}