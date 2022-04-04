package top.dumbzarro.flyticket.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Flight implements Serializable {
    private Integer flightId;

    private Integer planeId;

    private Date startT;

    private Date endT;

    private String origin;

    private String destination;

    private static final long serialVersionUID = 1L;

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    public Integer getPlaneId() {
        return planeId;
    }

    public void setPlaneId(Integer planeId) {
        this.planeId = planeId;
    }

    public Date getStartT() {
        return startT;
    }

    public void setStartT(Date startT) {
        this.startT = startT;
    }

    public Date getEndT() {
        return endT;
    }

    public void setEndT(Date endT) {
        this.endT = endT;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", flightId=").append(flightId);
        sb.append(", planeId=").append(planeId);
        sb.append(", startT=").append(startT);
        sb.append(", endT=").append(endT);
        sb.append(", origin=").append(origin);
        sb.append(", destination=").append(destination);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}