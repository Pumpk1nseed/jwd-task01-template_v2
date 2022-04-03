package by.tc.task01.dao.impl.Builder;

public abstract class ApplianceBuilder {

    private final String applianceInfo;
    String[] parameters;

    protected ApplianceBuilder(String applianceInfo) {
        this.applianceInfo = applianceInfo;
        this.parameters = getApplianceParameters(applianceInfo);
    }

    public Object build() {
        return new Object();
    }

    String[] getApplianceParameters(String applianceInfo) {
        char[] charApplianceInfo = applianceInfo.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < charApplianceInfo.length; i++) {
            if (charApplianceInfo[i] == '=') {
                while (charApplianceInfo[i] != ',' && i < charApplianceInfo.length - 1) {
                    i++;
                    if (charApplianceInfo[i] != ';') {
                        builder.append(charApplianceInfo[i]);
                    }
                }
            }
        }
        String[] applianceParameters = builder.toString().split(",");
        return applianceParameters;
    }
}
