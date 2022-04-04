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
import top.dumbzarro.flyticket.mbg.model.Ticket;
import top.dumbzarro.flyticket.service.TicketService;

import java.util.List;

/**
 * Description:
 */
@Api(tags="TicketController")
@Controller
@RequestMapping("/Ticket")
public class TicketController {

    @Autowired
    private TicketService TicketService;

    private static final Logger LOGGER = LoggerFactory.getLogger(TicketController.class);

    @ApiOperation("增加机票")
    @ResponseBody
    @RequestMapping(value = "create",method = RequestMethod.POST)
    public CommonResult createTicket(@RequestBody Ticket ticket){
        int count = TicketService.createTicket(ticket);
        if(count==1){
            LOGGER.debug("createTicket success:{}",ticket);
            return CommonResult.success(ticket);
        }else if(count==-1){
            LOGGER.debug("createTicket failed(don't have Orders): {}",ticket);
            return CommonResult.failed("查无此订单");
        }
        else{
            LOGGER.debug("createTicket failed:{}",ticket);
            return CommonResult.failed("增加失败");
        }
    }

    @ApiOperation("删除机票")
    @ResponseBody
    @RequestMapping(value="delete/{id}",method = RequestMethod.GET)
    public CommonResult deleteTicket(@PathVariable("id") int id){
        int count = TicketService.deleteTicket(id);
        if(count==1){
            LOGGER.debug("deleteTicket success :id={}",id);
            return CommonResult.success(null);
        }else{
            LOGGER.debug("deleteTicket failed :id={}",id);
            return CommonResult.failed("删除失败");
        }
    }

    @ApiOperation("修改机票")
    @ResponseBody
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    public CommonResult updateTicket(@PathVariable("id")int id,@RequestBody Ticket ticket){
        int count=TicketService.updateTicket(id,ticket);
        if(count==1){
            LOGGER.debug("updateTicket success :id={}",id);
            return CommonResult.success(ticket);
        }else{
            LOGGER.debug("updateTicket failed :id{}",id);
            return CommonResult.failed("修改失败");
        }
    }

    @ApiOperation("查询某个机票")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Ticket> getTicket(@PathVariable("id") int id){
        return CommonResult.success(TicketService.getTicket(id));
    }

    @ApiOperation("分页查询机票")
    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public CommonResult<CommonPage<Ticket>> listTicket(@RequestParam(value = "pageNum",defaultValue = "1")
                                                       @ApiParam("页码") Integer pageNum,
                                                       @RequestParam(value = "pageSize",defaultValue = "3")
                                                       @ApiParam("每页数量") Integer pageSize){
        List<Ticket> ticketList = TicketService.listTicket(pageNum,pageSize);
        return CommonResult.success(CommonPage.restPage(ticketList));
    }

    @ApiOperation("查询所有机票")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Ticket>> getPassengerList() {
        return CommonResult.success(TicketService.listAllTicket());
    }
}