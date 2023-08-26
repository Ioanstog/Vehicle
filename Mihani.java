public class Mihani {
    private int kyvismos;
    private int ippodynami;

    public Mihani(){}


    public Mihani(int k, int ip){
        kyvismos = k;
        ippodynami = ip;
    }
    
//getters
    public int getKyvismos() {
        return kyvismos;
    }

    public int getIppodynami() {
        return ippodynami;
    }


//setters

    public void setKyvismos(int kyvismos) {
        this.kyvismos = kyvismos;
    }

    public void setIppodynami(int ippodynami) {
        this.ippodynami = ippodynami;
    }

    //METHODS
    public void leitourgia(){
        
        System.out.println("H mihani leitourgei");

    }

    public void kinisi(){
       
        System.out.println("H mihani einai se kinisi");

    }   

    public void svisimo(){
       
        System.out.println("H mihanni esvise");
    
    }





}


