public class LiskovSubstitutionPrinciple {

    public void MainMethod() {
        Account acc = new Account();

        //при подстановке подтипа нарушается работа приложения => принцип нарушен
        //Account acc = new MicroAccount();
        InitializeAccount(acc);
    }

    public void InitializeAccount(Account acc){
        try {
            acc.SetCapital(200);
            System.out.println(acc.getCapital());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class Account{
        protected int capital;
        public int getCapital() {
            return capital;
        }

        public void setCapital(int value){
            capital = value;
        }

        public void SetCapital(int money) throws Exception {
        if (money < 0)
            throw  new Exception("Нельзя положить на счет меньше 0");
        this.setCapital(money);
    }
    }

    class MicroAccount extends Account{
        @Override
        public void SetCapital(int money)throws Exception{
            if (money < 0)
                throw new Exception("Нельзя положить на счет меньше 0");

            if (money > 100)
                throw new Exception("Нельзя положить на счет больше 100");

            this.setCapital(money);
        }
    }

}
