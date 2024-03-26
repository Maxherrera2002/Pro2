package Cuentass;

public class savings_account extends Account{
    private boolean active;

    public savings_account(float balance, float annual_rate) {
        super(balance, annual_rate);
        this.active= balance > 10000;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public void to_deposit(float amount) {
        if (active) {
            super.to_deposit(amount);
        }
    }

    @Override
    public void to_withdraw(float amount) {
        if (active) {
            super.to_withdraw(amount);
        }
    }

    @Override
    public void monthly_statement() {
        if(this.getNumber_of_withdrawals()<4) {
            super.monthly_statement();
        }else {
            float aux= this.getNumber_of_withdrawals()-4;
            this.setBalance(this.getBalance()-aux);
            this.active=this.getBalance()>10000;
        }
    }
    public void to_sprint(){
        System.out.println("Saldo actual= "+this.getBalance());
        System.out.println("comision mensual: "+this.getMonthly_fee());
        System.out.println("Numero de transacciones: "+this.getNumber_of_deposit()+this.getNumber_of_withdrawals());
    }
}
