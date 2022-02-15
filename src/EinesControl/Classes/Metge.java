package EinesControl.Classes;

public class Metge extends Persona {
    String especialitat;

    public void setEspecialitat(String espRebuda) {
        this.especialitat = espRebuda;
    }

    public String getEspecialitat() {
        return this.especialitat;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Especialitat = " + this.especialitat;
    }
}
