public class Pocket {
    private int money;

    //Constructors:


    //Setters and Getters
    public int getMoney(int money) {
        int moneyToReturn=0;
        if(this.money<=money){
            System.out.println("not enough balance!");
        }
        else if(this.money<=10){
             moneyToReturn=0;
        }
        else{
            this.money-=money;
            moneyToReturn=money;
        }
        return moneyToReturn;

    }

    public void setMoney(int money) {
        if(money<0 || money>3000 ){
            System.out.println("Sorry not enough space, limit:(0-3000)");
        }else{
            this.money = money;
        }

    }

    //Class Methods:

}
