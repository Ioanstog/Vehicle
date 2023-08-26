
public class TestVehicle {
    public static void main(String[] args) {
        
        int n=3;
        Vehicle[] V =new Vehicle[n];//Dhmiourgia pinaka

        Mihani e = new Mihani(2000, 80);// dhmiourgia antikeimenou typou mihani
        SystimaDieythynsis s = new SystimaDieythynsis();// dhmiourgia antikeimenou typou systimadieuthinsis
       
        V[0] = new Vehicle( 2003,s,e);
        V[0].setArKykloforias("ASD124354");
        V[0].setIdioktitis("Ioannis");



        s = new SystimaDieythynsis();
        e = new Mihani(1800, 120);

        V[1] = new Vehicle(1998, s, e);
        V[1].setArKykloforias("JKL292878");
        V[1].setIdioktitis("Giorgos");




        s = new SystimaDieythynsis();
        e = new Mihani(1200, 70);

        V[2] = new Vehicle(2001, s, e);
        V[2].setArKykloforias("GHJ665752");
        V[2].setIdioktitis("Lefteris");



        

        System.out.println("Gia pio autokinito thelete Kibismo");
        int k = UserInput.getInteger();
        System.out.println("To vehicle "+k+"exei Kibismo "+V[k].getEng().getKyvismos());
        System.out.println("Gia pio autokinito thelete ippodunamh");
        k = UserInput.getInteger();
        System.out.println("To vehicle "+k+"exei ippodunamh"+V[k].getEng().getIppodynami());
        System.out.println("Gia pio autokinito thelete iidioktiti kai etos kataskeuhs");
        k = UserInput.getInteger();
        System.out.println("To vehicle "+k+"exei idioktiti "+V[k].getIdioktitis()+"kai etos kataskeuhs"+V[k].getEtosKat());



        V[0].getSysdief().vazeiEmpros();
        V[0].getEng().leitourgia();
        V[0].getEng().kinisi();
        V[0].getSysdief().striveiAristera();
        V[0].getSysdief().striveiDexia();
        V[0].getSysdief().svynei();

    }
}
