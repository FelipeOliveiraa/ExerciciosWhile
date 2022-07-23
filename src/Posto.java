public class Posto {
    private int gasolina;
    private int alcool;
    private int diesel;

    public Posto() {
        this.gasolina = 0;
        this.alcool = 0;
        this.diesel = 0;
    }

    public int getGasolina() {
        return gasolina;
    }

    public int getAlcool() {
        return alcool;
    }

    public int getDiesel() {
        return diesel;
    }

    public void addGasolina(){
        this.gasolina += 1;
    }

    public void addDiesel(){
        this.diesel += 1;
    }

    public void addAlcool(){
        this.alcool += 1;
    }

}
