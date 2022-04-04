package top.dumbzarro.flyticket.dao;

import org.apache.ibatis.annotations.Param;
import top.dumbzarro.flyticket.mbg.model.Menu;

import java.util.List;

/**
 * Description:
 */
public interface UserRoleDao {
    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<Menu> getPermissionList(@Param("adminUserId") int adminUserId);
}
