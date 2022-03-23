package by.tc.task01.dao.impl.Builder;

import by.tc.task01.entity.Speakers;

public class SpeakersBuilder implements ApplianceBuilder {

    @Override
    public Speakers build(String[] applianceParameters) {
        Speakers speakers = new Speakers();

        speakers.setPowerConsumption(Integer.parseInt(applianceParameters[0]));
        speakers.setNumberOfSpeakers(Integer.parseInt(applianceParameters[1]));
        speakers.setFrequencyRange(applianceParameters[2]);
        speakers.setCordLength(Integer.parseInt(applianceParameters[3]));

        return speakers;
    }
}
