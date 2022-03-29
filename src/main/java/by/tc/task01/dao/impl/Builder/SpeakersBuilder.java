package by.tc.task01.dao.impl.Builder;

import by.tc.task01.entity.Speakers;

public class SpeakersBuilder extends ApplianceBuilder {

    public SpeakersBuilder(String applianceInfo) {
        super(applianceInfo);
    }

    @Override
    public Speakers build() {

        int powerConsumption = Integer.parseInt(parameters[0]);
        int numberOfSpeakers = Integer.parseInt(parameters[1]);
        String frequencyRange = parameters[2];
        int cordLength = Integer.parseInt(parameters[3]);

        Speakers speakers = new Speakers(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
        return speakers;
    }
}
