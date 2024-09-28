

    abstract class Bank {

        int getBalance() {
            return 0;
        }
    }




    class BankA extends Bank {
        int getBalance() {
            return 1000;
        }
    }

    class BankB extends Bank {
        int getBalance() {
            return 1500;
        }
    }

    class BankC extends Bank {
        int getBalance() {
            return 2000;
        }
    }

    public class BankDetails {
        public static void main(String[] args) {
            Bank bank;
            BankA banka = new BankA();
            BankB bankb = new BankB();
            BankC bankc = new BankC();

            bank = banka;
            System.out.println("Balance in Bank A: $" + bank.getBalance());

            bank = bankb;
            System.out.println("Balance in Bank B: $" + bank.getBalance());

            bank = bankc;
            System.out.println("Balance in Bank C: $" + bank.getBalance());
        }
    }

