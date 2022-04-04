package top.dumbzarro.flyticket.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Passenger implements Serializable {
    private Integer personId;

    private String passengerName;

    private static final long serialVersionUID = 1L;

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", personId=").append(personId);
        sb.append(", passengerName=").append(passengerName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}