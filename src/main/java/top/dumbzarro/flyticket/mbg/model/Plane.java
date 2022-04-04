package top.dumbzarro.flyticket.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Plane implements Serializable {
    private Integer planeId;

    private Integer size;

    private String planeName;

    private static final long serialVersionUID = 1L;

    public Integer getPlaneId() {
        return planeId;
    }

    public void setPlaneId(Integer planeId) {
        this.planeId = planeId;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getPlaneName() {
        return planeName;
    }

    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", planeId=").append(planeId);
        sb.append(", size=").append(size);
        sb.append(", planeName=").append(planeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}