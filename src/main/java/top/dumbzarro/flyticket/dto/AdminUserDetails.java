package top.dumbzarro.flyticket.dto;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import top.dumbzarro.flyticket.mbg.model.AdminUsers;
import top.dumbzarro.flyticket.mbg.model.Menu;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


/**
 * SpringSecurity需要的用户详情
 * Created by dumbzarro on 2022/4/2.
 */
public class AdminUserDetails implements UserDetails {
    private final AdminUsers adminUsers;
    private final List<Menu> permissionList;

    public AdminUserDetails(AdminUsers adminUsers,List<Menu> permissionList) {
        this.adminUsers = adminUsers;
        this.permissionList = permissionList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的权限
        return permissionList.stream()
                .filter(permission -> permission.getMenuId()!=null)
                .map(permission ->new SimpleGrantedAuthority(permission.getPermKey()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return adminUsers.getPassword();
    }

    @Override
    public String getUsername() {
        return adminUsers.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
