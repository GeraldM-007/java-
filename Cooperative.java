class Bank {
    void run() {
    }
}

class NCBA extends Bank {

    void run() {
        System.out.println("NCBA Bank rate is: \n 13%");
    }
}

class KCB extends Bank {

    void run() {
        System.out.println("KCB Bank Rate is: \n 14%");
    }
}

class Cooperative extends Bank {

    void run() {
        System.out.println("The Cooperative Bank Rate is: \n 16%");
    }

    public static void main(String args[]) {
        NCBA obj1 = new NCBA();
        KCB obj2 = new KCB();
        Cooperative obj3 = new Cooperative();
        obj1.run();
        obj2.run();
        obj3.run();
    }
}