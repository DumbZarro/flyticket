package top.dumbzarro.flyticket.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Orders implements Serializable {
    private Integer ordersId;

    private Integer flightId;

    private Integer personId;

    private Integer cost;

    private Date orderT;

    private Boolean payState;

    private static final long serialVersionUID = 1L;

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Date getOrderT() {
        return orderT;
    }

    public void setOrderT(Date orderT) {
        this.orderT = orderT;
    }

    public Boolean getPayState() {
        return payState;
    }

    public void setPayState(Boolean payState) {
        this.payState = payState;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ordersId=").append(ordersId);
        sb.append(", flightId=").append(flightId);
        sb.append(", personId=").append(personId);
        sb.append(", cost=").append(cost);
        sb.append(", orderT=").append(orderT);
        sb.append(", payState=").append(payState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}