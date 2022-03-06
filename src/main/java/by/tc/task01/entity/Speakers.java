package by.tc.task01.entity;

public class Speakers extends Appliance {
    String powerConsumption;
    String numberOfSpeakers;
    String frequencyRange;
    String cordLength;

    public Speakers(String powerConsumption, String numberOfSpeakers, String frequencyRange, String cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    @Override
    public String get(String parameter) {
        switch (parameter) {
            case "POWER_CONSUMPTION":
                return getPowerConsumption();
            case "NUMBER_OF_SPEAKERS":
                return getNumberOfSpeakers();
            case "FREQUENCY_RANGE":
                return getFrequencyRange();
            case "CORD_LENGTH":
                return getCordLength();
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

    public String getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(String numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public String getCordLength() {
        return cordLength;
    }

    public void setCordLength(String cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption='" + powerConsumption + '\'' +
                ", numberOfSpeakers='" + numberOfSpeakers + '\'' +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", cordLength='" + cordLength + '\'' +
                '}';
    }
}
