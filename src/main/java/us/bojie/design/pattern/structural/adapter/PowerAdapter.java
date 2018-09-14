package us.bojie.design.pattern.structural.adapter;

public class PowerAdapter implements DC5 {
    private AC220 ac220 = new AC220();

    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();

        // changer
        int adapterOutput = adapterInput / 44;

        System.out.println("input AC: " + adapterInput + "V" + " Output DC: " + adapterOutput + "V");

        return adapterOutput;
    }
}
