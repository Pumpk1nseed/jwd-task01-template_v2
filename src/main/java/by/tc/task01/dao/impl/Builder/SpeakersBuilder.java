package by.tc.task01.dao.impl.Builder;

import by.tc.task01.entity.Speakers;

public class SpeakersBuilder extends ApplianceBuilder {

    public SpeakersBuilder(String applianceInfo) {
        super(applianceInfo);
    }

    @Override
    public Speakers build() {

        String manufacturer = parameters[0];
        int powerConsumption = Integer.parseInt(parameters[1]);
        int numberOfSpeakers = Integer.parseInt(parameters[2]);
        String frequencyRange = parameters[3];
        int cordLength = Integer.parseInt(parameters[4]);
        double price = Double.parseDouble(parameters[5]);

        Speakers speakers = new Speakers(manufacturer, powerConsumption, numberOfSpeakers, frequencyRange, cordLength, price);
        return speakers;
    }
}
