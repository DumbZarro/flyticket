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
import top.dumbzarro.flyticket.mbg.model.Flight;
import top.dumbzarro.flyticket.service.FlightService;

import java.util.List;

/**
 * Description:
 */
@Api(tags="flightController")
@Controller
@RequestMapping("/flight")
public class FlightController {

    @Autowired
    private FlightService flightService;

    private static final Logger LOGGER = LoggerFactory.getLogger(FlightController.class);

    @ApiOperation("增加航班")
    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public CommonResult createFlight(@RequestBody Flight flight) {
        int count = flightService.createFlight(flight);
        if(count==1) {
            LOGGER.debug("createFlight success: {}", flight);
            return CommonResult.success(flight);
        }else if(count==-1){
            LOGGER.debug("createFlight failed(don't have plane): {}",flight);
            return CommonResult.failed("查无此机");
        }else{
            LOGGER.debug("createFlight failed: {}",flight);
            return CommonResult.failed("增加失败");
        }
    }
    @ApiOperation("删除航班")
    @ResponseBody
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public CommonResult deleteFlight(@PathVariable("id") int id) {
        int count = flightService.deleteFlight(id);
        if(count==1){
            LOGGER.debug("createFlight success: {}",id);
            return CommonResult.success(null);
        }else{
            LOGGER.debug("createFlight failed: {}",id);
            return CommonResult.failed("删除失败");
        }
    }

    @ApiOperation("更新航班")
    @ResponseBody
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    public CommonResult updateFlight(@PathVariable("id") int id,@RequestBody Flight flight) {
        int count = flightService.deleteFlight(id);
        if(count==1){
            LOGGER.debug("updateFlight success: {}",id);
            return CommonResult.success(flight);
        }else{
            LOGGER.debug("updateFlight failed: {}",id);
            return CommonResult.failed("修改失败");
        }
    }

    @ApiOperation("获取某航班")
    @ResponseBody
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public CommonResult getFlight(@PathVariable("id") int id) {
        return CommonResult.success(flightService.getFlight(id));
    }

    @ApiOperation("分页查询航班")
    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public CommonResult<CommonPage<Flight>> listFlight(@RequestParam(value = "pageNum",defaultValue = "1")
                                                           @ApiParam("页码") int pageNum,
                                                       @RequestParam(value = "pageSize",defaultValue = "3")
                                                       @ApiParam("每页数量")int pageSize) {
        List<Flight> flightList= flightService.listFlight(pageNum,pageSize);
        return CommonResult.success(CommonPage.restPage(flightList));
    }

    @ApiOperation("查询所有航班")
    @ResponseBody
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    public CommonResult<List<Flight>> listAllFlight() {
        return CommonResult.success(flightService.listAllFlight());
    }
}
