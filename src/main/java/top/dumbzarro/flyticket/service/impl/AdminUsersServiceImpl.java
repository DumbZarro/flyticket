package top.dumbzarro.flyticket.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import top.dumbzarro.flyticket.dao.UserRoleDao;
import top.dumbzarro.flyticket.mbg.model.AdminUsers;
import top.dumbzarro.flyticket.common.utils.JwtTokenUtil;
import top.dumbzarro.flyticket.mbg.mapper.AdminUsersMapper;
import top.dumbzarro.flyticket.mbg.model.AdminUsersExample;
import top.dumbzarro.flyticket.mbg.model.Menu;
import top.dumbzarro.flyticket.service.AdminUsersService;

import java.util.ArrayList;
import java.util.List;

/**
 * AdminUsersService实现类
 * Created by macro on 2018/4/26.
 */
@Service
public class AdminUsersServiceImpl implements AdminUsersService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AdminUsersServiceImpl.class);
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Autowired
    private AdminUsersMapper adminUsersMapper;
    @Autowired
    private UserRoleDao userRoleDao;

    /*
    * 用户名获取用户
    * */
    @Override
    public AdminUsers getAdminByUsername(String username) {
        //查询用户信息
        AdminUsersExample example = new AdminUsersExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<AdminUsers> adminList = adminUsersMapper.selectByExample(example);
        //返回用户
        if (adminList != null && adminList.size() > 0) {
            return adminList.get(0);
        }
        //如果没有查询到用户就抛出异常
        throw new RuntimeException("用户名或者密码错误");
//        return null;
    }

    /*
    * 注册用户 返回用户
    * */
    @Override
    public AdminUsers register(AdminUsers adminUsersParam) {
        AdminUsers adminUsers = new AdminUsers();
        BeanUtils.copyProperties(adminUsersParam, adminUsers);
        //查询是否有相同用户名的用户
        AdminUsersExample example = new AdminUsersExample();
        example.createCriteria().andUsernameEqualTo(adminUsers.getUsername());
        List<AdminUsers> AdminUsersList = adminUsersMapper.selectByExample(example);
        LOGGER.info("AdminUsersList {}",AdminUsersList);
        if (AdminUsersList.size() > 0) {
            return null;
        }
        //将密码进行加密操作
        String encodePassword = passwordEncoder.encode(adminUsers.getPassword());
        LOGGER.info("encode_passward {}",encodePassword);
        adminUsers.setPassword(encodePassword);
        adminUsersMapper.insert(adminUsers);
        return adminUsers;
    }

    /*
    * 登陆 返回token
    * */
    @Override
    public String login(String username, String password) {
        String token = null;
        try {
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            if (!passwordEncoder.matches(password, userDetails.getPassword())) {
                throw new BadCredentialsException("密码不正确");
            }
            //已认证的token用三个参数构造authentication
            UsernamePasswordAuthenticationToken authentication =
                    new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            // 保存安全上下文
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        return token;
    }
    @Override
    public List<Menu> getPermissionList(int adminId) {
//        return userRoleDao.getPermissionList(adminId);
        // TODO 修改权限配置文件
        //写死权限
        Menu m=new Menu();
        m.setMenuId(1);
        m.setPermKey("all_perm");
        List<Menu> l= new ArrayList<Menu>();
        l.add(m);
        return l;
    }
}
