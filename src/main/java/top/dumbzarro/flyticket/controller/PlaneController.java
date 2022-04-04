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
import top.dumbzarro.flyticket.mbg.model.Plane;
import top.dumbzarro.flyticket.service.PlaneService;

import java.util.List;

/**
 * Description:
 */
@Api(tags="PlaneController")
@Controller
@RequestMapping("/plane")
public class PlaneController {

    @Autowired
    private PlaneService planeService;

    private static final Logger LOGGER = LoggerFactory.getLogger(PlaneController.class);

    @ApiOperation("增加飞机")
    @ResponseBody
    @RequestMapping(value = "create",method = RequestMethod.POST)
    public CommonResult createPlane(@RequestBody Plane plane){
        int count = planeService.createPlane(plane);
        if(count==1){
            LOGGER.debug("createPlane success:{}",plane);
            return CommonResult.success(plane);
        }else{
            LOGGER.debug("createPlane failed:{}",plane);
            return CommonResult.failed("增加失败");
        }
    }

    @ApiOperation("删除飞机")
    @ResponseBody
    @RequestMapping(value="delete/{id}",method = RequestMethod.GET)
    public CommonResult deletePlane(@PathVariable("id") int id){
        int count = planeService.deletePlane(id);
        if(count==1){
            LOGGER.debug("deletePlane success :id={}",id);
            return CommonResult.success(null);
        }else{
            LOGGER.debug("deletePlane failed :id={}",id);
            return CommonResult.failed("删除失败");
        }
    }

    @ApiOperation("修改飞机")
    @ResponseBody
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    public CommonResult updatePlane(@PathVariable("id")int id,@RequestBody Plane plane){
        int count=planeService.updatePlane(id,plane);
        if(count==1){
            LOGGER.debug("updatePlane success :id={}",id);
            return CommonResult.success(plane);
        }else{
            LOGGER.debug("updatePlane failed :id{}",id);
            return CommonResult.failed("修改失败");
        }
    }

    @ApiOperation("查询某个飞机")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Plane> getPlane(@PathVariable("id") int id){
        return CommonResult.success(planeService.getPlane(id));
    }

    @ApiOperation("分页查询飞机")
    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public CommonResult<CommonPage<Plane>> listPlane(@RequestParam(value = "pageNum",defaultValue = "1")
                                                        @ApiParam("页码") Integer pageNum,
                                                        @RequestParam(value = "pageSize",defaultValue = "3")
                                                        @ApiParam("每页数量") Integer pageSize){
        List<Plane> planeList = planeService.listPlane(pageNum,pageSize);
        return CommonResult.success(CommonPage.restPage(planeList));
    }

    @ApiOperation("查询所有飞机")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Plane>> getPassengerList() {
        return CommonResult.success(planeService.listAllPlane());
    }
}
