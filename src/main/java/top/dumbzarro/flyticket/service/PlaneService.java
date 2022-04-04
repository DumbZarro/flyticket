package top.dumbzarro.flyticket.service;

import top.dumbzarro.flyticket.mbg.model.Plane;

import java.util.List;

/**
 * Description:
 */
public interface PlaneService {

    int createPlane(Plane plane);

    int deletePlane(int id);

    int updatePlane(int id, Plane plane);

    Plane getPlane(int id);

    List<Plane> listAllPlane();

    List<Plane> listPlane(int pageNum, int pageSize);
}
