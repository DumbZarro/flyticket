package top.dumbzarro.flyticket.service.impl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.dumbzarro.flyticket.mbg.mapper.PlaneMapper;
import top.dumbzarro.flyticket.mbg.model.Plane;
import top.dumbzarro.flyticket.mbg.model.PlaneExample;
import top.dumbzarro.flyticket.service.PlaneService;

import java.util.List;

/**
 * Description:
 */
@Service
public class PlaneServiceImpl implements PlaneService {

    @Autowired
    private PlaneMapper planeMapper;

    @Override
    public int createPlane(Plane plane) {
        return planeMapper.insertSelective(plane);
    }

    @Override
    public int deletePlane(int id) {
        return planeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updatePlane(int id, Plane plane) {
        plane.setPlaneId(id);
        return planeMapper.updateByPrimaryKeySelective(plane);
    }

    @Override
    public Plane getPlane(int id) {
        return planeMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Plane> listAllPlane() {
        return planeMapper.selectByExample(new PlaneExample());
    }

    @Override
    public List<Plane> listPlane(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return planeMapper.selectByExample(new PlaneExample());
    }
}
