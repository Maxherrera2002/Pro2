package Cuentass;

public class Account {
    private float balance; //saldo
    private int number_of_deposit;  //numero consignaciones
    private int number_of_withdrawals;  //numero de retiros
    private float annual_rate; //tasa anual
    private float monthly_fee; //comision mensual

    public Account(float balance, float annual_rate) {
        this.balance = balance;
        this.annual_rate = annual_rate;
        this.number_of_deposit=0;
        this.number_of_withdrawals=0;
        this.monthly_fee=0;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getNumber_of_deposit() {
        return number_of_deposit;
    }

    public void setNumber_of_deposit(int number_of_deposit) {
        this.number_of_deposit = number_of_deposit;
    }

    public int getNumber_of_withdrawals() {
        return number_of_withdrawals;
    }

    public void setNumber_of_withdrawals(int number_of_withdrawals) {
        this.number_of_withdrawals += number_of_withdrawals;
    }

    public float getAnnual_rate() {
        return annual_rate;
    }

    public void setAnnual_rate(float annual_rate) {
        this.annual_rate = annual_rate;
    }

    public float getMonthly_fee() {
        return monthly_fee;
    }

    public void setMonthly_fee(float monthly_fee) {
        this.monthly_fee = monthly_fee;
    }


    public void to_deposit(float amount){
        this.balance+=amount;
        this.number_of_deposit+=1;
    }

    public void to_withdraw(float amount){
        if (amount<=this.balance){
            this.balance-=amount;
            this.setNumber_of_withdrawals(1);
        }else{
            System.out.println("No tiene dinero suficiente, su saldo es de: "+this.balance);
        }
    }

    public void calculate_interest(){
        float percentage;
        if (this.monthly_fee==0){
            percentage=0;
        }else {
            percentage=this.monthly_fee/100;
        }

        this.balance-=this.balance*percentage;
    }

    public void monthly_statement(){
        this.balance-=monthly_fee;
        calculate_interest();
    }

    public void tp_print(){
        System.out.println("Saldo: "+this.balance);
        System.out.println("Numero consignaciones_ "+this.number_of_deposit);
        System.out.println("Numero de retiros: "+this.number_of_withdrawals);
        System.out.println("Tasa anual: "+this.annual_rate);
        System.out.println("Comision Mensual: "+this.monthly_fee);
    }



}
