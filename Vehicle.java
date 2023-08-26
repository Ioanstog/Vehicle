


class Vehicle {

    private String idioktitis;
    private String arKykloforias;
    private int etosKat;

    private SystimaDieythynsis sysdief;
    private Mihani eng;
    
    //constractors
    public Vehicle(){}
    
    

    public Vehicle(int ek, SystimaDieythynsis sd, Mihani e){
        etosKat = ek;
        sysdief = sd;
        eng = e;
    }

    public Vehicle(String id, String ak, int ek, SystimaDieythynsis sd, Mihani e){
        idioktitis = id;
        arKykloforias = ak;
        etosKat = ek;
        sysdief = sd;
        eng = e;
    }

//GETTERS

    public String getIdioktitis() {
        return idioktitis;
    }



    public String getArKykloforias() {
        return arKykloforias;
    }



    public int getEtosKat() {
        return etosKat;
    }



    public SystimaDieythynsis getSysdief() {
        return sysdief;
    }



    public Mihani getEng() {
        return eng;
    }


//SETTERS
    public void setIdioktitis(String idioktitis) {
        this.idioktitis = idioktitis;
    }



    public void setArKykloforias(String arKykloforias) {
        this.arKykloforias = arKykloforias;
    }



    public void setEtosKat(int etosKat) {
        this.etosKat = etosKat;
    }



    public void setSysdief(SystimaDieythynsis sysdief) {
        this.sysdief = sysdief;
    }



    public void setEng(Mihani eng) {
        this.eng = eng;
    }


//TOSTRING
    public String toString(){
        return ("idioktitis"+idioktitis+"Arithmos Kykloforias"+arKykloforias+"etos Kataskeuhs"+etosKat+"kyvismos"  
                                        +eng.getKyvismos()+"ipodynamh"+eng.getIppodynami());
    }

    



}
