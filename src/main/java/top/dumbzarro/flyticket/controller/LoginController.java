package top.dumbzarro.flyticket.controller;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import top.dumbzarro.flyticket.common.api.CommonResult;
import org.springframework.web.bind.annotation.*;
import top.dumbzarro.flyticket.dto.AdminLoginParam;
import top.dumbzarro.flyticket.mbg.model.AdminUsers;
import top.dumbzarro.flyticket.mbg.model.Menu;
import top.dumbzarro.flyticket.service.AdminUsersService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description:
 */
@Api(tags="LoginController")
@Controller
@RequestMapping("/user")
@CrossOrigin
public class LoginController {

    @Autowired
    private AdminUsersService adminUsersService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @ApiOperation("登陆")
    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public CommonResult login(@RequestBody AdminLoginParam adminLoginParam){
        // 生成token
        String token = adminUsersService.login(adminLoginParam.getUsername(),adminLoginParam.getPassword());
        if(token==null){
            return CommonResult.validateFailed("用户名或者密码错误");
        }
        // 返回
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);

        return CommonResult.success(tokenMap);
    }

    @ApiOperation(value = "用户注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<AdminUsers> register(@RequestBody AdminUsers adminUsersParam, BindingResult result) {
        AdminUsers adminUsers = adminUsersService.register(adminUsersParam);
        if (adminUsers == null) {
            CommonResult.failed();
        }
        return CommonResult.success(adminUsers);
    }

    @ApiOperation("获取用户所有权限（包括+-权限）")
    @RequestMapping(value = "/permission/{adminId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Menu>> getPermissionList(@PathVariable int adminId) {
        List<Menu> permissionList = adminUsersService.getPermissionList(adminId);
        return CommonResult.success(permissionList);
    }


    @ApiOperation("信息")
    @ResponseBody
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public CommonResult info(){
        Map<String,String> infoMap = new HashMap<>();
        infoMap.put("roles","[admin]");
        infoMap.put("name","admin");
        infoMap.put("avatar",null);
        LOGGER.debug("{}",infoMap);
        LOGGER.info("{}",infoMap);
        return CommonResult.success(infoMap);
    }


}