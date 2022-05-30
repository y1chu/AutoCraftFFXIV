
public class Macro {

    private String macroKeyBind;
    private int durationInSeconds;

    public Macro(String macroKeyBind, int durationInSeconds){
        this.macroKeyBind = macroKeyBind;
         this.durationInSeconds = durationInSeconds;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public String getMacroKeyBind() {
        return macroKeyBind;
    }

    public void setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public void setMacroKeyBind(String macroKeyBind) {
        this.macroKeyBind = macroKeyBind;
    }

    @Override
    public String toString() {
        return "Macro{" +
                "macroKeyBind='" + macroKeyBind + '\'' +
                ", durationInSeconds=" + durationInSeconds +
                '}';
    }
}
