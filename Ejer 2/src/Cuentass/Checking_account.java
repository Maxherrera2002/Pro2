package Cuentass;

public class Checking_account extends Account{
    private float overdraft;

    public Checking_account(float balance, float annual_rate) {
        super(balance, annual_rate);
        this.overdraft=0;
    }


    public void to_withdraw(float amount){
        if (this.getBalance()>amount){
            this.setBalance(getBalance()-amount);
        }else{
            this.overdraft=amount-this.getBalance();
            this.setBalance(0);
        }
    }

    @Override
    public void to_deposit(float amount) {
         if (this.overdraft==0){
             super.to_deposit(amount);
         }else {
             if (this.overdraft >= amount) {
                 this.overdraft -= amount;
             } else {
                 amount-=this.overdraft;
                 super.to_deposit(amount);
             }
         }
    }

    @Override
    public void monthly_statement() {
        super.monthly_statement();
    }

    public void to_string(){
        System.out.println("Saldo de la cuenta: "+this.getBalance());
        System.out.println("Comision mensual: "+this.getMonthly_fee());
        System.out.println("Numero de transacciones: "+this.getNumber_of_deposit()+this.getNumber_of_withdrawals());
        System.out.println("El sobregiro: "+this.overdraft);
    }
}
