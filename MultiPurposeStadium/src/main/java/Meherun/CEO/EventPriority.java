package Meherun.CEO;

import java.io.Serializable;

public class EventPriority implements Serializable {
    private String eventType, priorityValue ;

    public EventPriority(String eventType, String priorityValue) {
        this.eventType = eventType;
        this.priorityValue = priorityValue;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getPriorityValue() {
        return priorityValue;
    }

    public void setPriorityValue(String priorityValue) {
        this.priorityValue = priorityValue;
    }
}
