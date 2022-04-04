package top.dumbzarro.flyticket.service;

import top.dumbzarro.flyticket.mbg.model.AdminUsers;
import top.dumbzarro.flyticket.mbg.model.Menu;
//import top.dumbzarro.flyticket.mbg.model.UmsPermission;

import java.util.List;

/**
 * 后台管理员Service
 * Created by macro on 2018/4/26.
 */
public interface AdminUsersService {
    /**
     * 根据用户名获取后台管理员
     */
    AdminUsers getAdminByUsername(String username);

    /**
     * 注册功能
     */
    AdminUsers register(AdminUsers adminParam);

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    List<Menu> getPermissionList(int adminId);

}
