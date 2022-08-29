public class conta {
    private double saldo = 0.0;
    private double chequeEspecial = 500;
    private boolean statusCheque;

    public double getSaldo() {
        return saldo;
    }
    public double getchequeEspesial(){
        return chequeEspecial;
    }
    public boolean getstatusCheque(){
        return statusCheque;
    }

    public void setsaldo(Double saldo) {
        this.saldo = saldo;
    }
    public void setchequeEspecial(Double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
    public void setstatusCheque(Boolean statusCheque) {
        this.statusCheque = statusCheque;
    }
}
