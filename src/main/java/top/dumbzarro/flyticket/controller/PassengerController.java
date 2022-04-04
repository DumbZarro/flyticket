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
import top.dumbzarro.flyticket.mbg.model.Passenger;
import top.dumbzarro.flyticket.service.PassengerService;

import java.util.List;

/**
 * Description:
 */
@Api(tags="PassengerController")
@Controller
@RequestMapping("/Passenger")
public class PassengerController {
    @Autowired
    private PassengerService passengerService;

    private static final Logger LOGGER = LoggerFactory.getLogger(PassengerController.class);

    @ApiOperation("创建乘客")
    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public CommonResult createPassenger(@RequestBody Passenger passenger){
        LOGGER.info("Passenger: {}",passenger);
        int count=passengerService.createPassenger(passenger);
        if(count==1){
            LOGGER.debug("createPassenger success:{}",passenger);
            return CommonResult.success(passenger);
        }else{
            LOGGER.debug("createPassenger failed:{}",passenger);
            return CommonResult.failed("插入失败");
        }
    }

    @ApiOperation("删除乘客")
    @ResponseBody
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public CommonResult deletePassenger(@PathVariable("id") int id) {
        int count = passengerService.deletePassenger(id);
        if (count == 1) {
            LOGGER.debug("deletePassenger success :id={}", id);
            return CommonResult.success(null);
        } else {
            LOGGER.debug("deletePassenger failed :id={}", id);
            return CommonResult.failed("删除失败");
        }
    }

    @ApiOperation("修改乘客")
    @ResponseBody
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public CommonResult updatePassenger(@PathVariable("id") int id,@RequestBody Passenger passenger) {
        int count = passengerService.updatePassenger(id,passenger);
        if (count == 1) {
            LOGGER.debug("deletePassenger success :id={}", id);
            return CommonResult.success(null);
        } else {
            LOGGER.debug("deletePassenger failed :id={}", id);
            return CommonResult.failed("更新失败");
        }
    }

    @ApiOperation("查询某个乘客")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Passenger> Passenger(@PathVariable("id") int id) {
        return CommonResult.success(passengerService.getPassenger(id));
    }

    @ApiOperation("分页查询乘客")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Passenger>> listPassenger(@RequestParam(value = "pageNum", defaultValue = "1")
                                                            @ApiParam("页码") Integer pageNum,
                                                        @RequestParam(value = "pageSize", defaultValue = "3")
                                                        @ApiParam("每页数量") Integer pageSize) {
        List<Passenger> PassengerList = passengerService.listPassenger(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(PassengerList));
    }

    @ApiOperation("查询所有乘客")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Passenger>> getPassengerList() {
        return CommonResult.success(passengerService.listAllPassenger());
    }


}
