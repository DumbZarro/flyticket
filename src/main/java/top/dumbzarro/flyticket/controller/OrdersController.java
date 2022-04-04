package top.dumbzarro.flyticket.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.dumbzarro.flyticket.common.api.CommonPage;
import top.dumbzarro.flyticket.common.api.CommonResult;
import top.dumbzarro.flyticket.mbg.model.Orders;
import top.dumbzarro.flyticket.service.OrdersService;

import java.util.List;

/**
 * Description:
 */
@Api(tags="OrdersController")
@Controller
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    private static final Logger LOGGER = LoggerFactory.getLogger(OrdersController.class);

    @ApiOperation("增加订单")
    @ResponseBody
    @RequestMapping(value = "create",method = RequestMethod.POST)
    public CommonResult createOrders(@RequestBody Orders Orders){
        int count = ordersService.createOrders(Orders);
        if(count==1){
            LOGGER.debug("createOrders success:{}",Orders);
            return CommonResult.success(Orders);
        }else if(count==-1){
            LOGGER.debug("createOrders failed(don't have passenger):{}",Orders);
            return CommonResult.failed("查无此乘客");
        }
        else if(count==-2){
            LOGGER.debug("createOrders failed(don't have flight):{}",Orders);
            return CommonResult.failed("查无此航班");
        }
        else{
            LOGGER.debug("createOrders failed:{}",Orders);
            return CommonResult.failed("增加失败");
        }
    }

    @ApiOperation("删除订单")
    @ResponseBody
    @RequestMapping(value="delete/{id}",method = RequestMethod.GET)
    public CommonResult deleteOrders(@PathVariable("id") int id){
        int count = ordersService.deleteOrders(id);
        if(count==1){
            LOGGER.debug("deleteOrders success :id={}",id);
            return CommonResult.success(null);
        }else{
            LOGGER.debug("deleteOrders failed :id={}",id);
            return CommonResult.failed("删除失败");
        }
    }

    @ApiOperation("修改订单")
    @ResponseBody
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    public CommonResult updateOrders(@PathVariable("id")int id,@RequestBody Orders Orders){
        int count=ordersService.updateOrders(id,Orders);
        if(count==1){
            LOGGER.debug("updateOrders success :id={}",id);
            return CommonResult.success(Orders);
        }else{
            LOGGER.debug("updateOrders failed :id{}",id);
            return CommonResult.failed("修改失败");
        }
    }

    @ApiOperation("查询某个订单")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Orders> getOrders(@PathVariable("id") int id){
        return CommonResult.success(ordersService.getOrders(id));
    }

    @ApiOperation("分页查询订单")
    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public CommonResult<CommonPage<Orders>> listOrders(@RequestParam(value = "pageNum",defaultValue = "1")
                                                     @ApiParam("页码") Integer pageNum,
                                                     @RequestParam(value = "pageSize",defaultValue = "3")
                                                     @ApiParam("每页数量") Integer pageSize){
        List<Orders> OrdersList = ordersService.listOrders(pageNum,pageSize);
        return CommonResult.success(CommonPage.restPage(OrdersList));
    }

    @ApiOperation("查询所有订单")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Orders>> getPassengerList() {
        return CommonResult.success(ordersService.listAllOrders());
    }
}
