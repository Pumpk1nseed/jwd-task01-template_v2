package by.tc.task01.entity;

public class Refrigerator extends Appliance{
    String powerConsumption;
    String weight;
    String freezerCapacity;
    String overalCapacity;
    String height;
    String width;

    public Refrigerator(String powerConsumption, String weight, String freezerCapacity, String overalCapacity, String height, String width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overalCapacity = overalCapacity;
        this.height = height;
        this.width = width;
    }

    @Override
    public String get(String parameter) {
        switch (parameter) {
            case "POWER_CONSUMPTION":
                return getPowerConsumption();
            case "WEIGHT":
                return getWeight();
            case "FREEZER_CAPACITY":
                return getFreezerCapacity();
            case "OVERALL_CAPACITY":
                return getOveralCapacity();
            case "HEIGHT":
                return getHeight();
            case "WIDTH":
                return getWidth();
            default:
                return null;
        }
    }

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(String freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public String getOveralCapacity() {
        return overalCapacity;
    }

    public void setOveralCapacity(String overalCapacity) {
        this.overalCapacity = overalCapacity;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "powerConsumption='" + powerConsumption + '\'' +
                ", weight='" + weight + '\'' +
                ", freezerCapacity='" + freezerCapacity + '\'' +
                ", overalCapacity='" + overalCapacity + '\'' +
                ", height='" + height + '\'' +
                ", width='" + width + '\'' +
                '}';
    }
}
