interface SifreIslemleri {
    void sifreDegistir(int sifre,int eskisifre);
}
interface BankaHesabi{
    void bakiyeSorgulama(int hesapNo);
    void paraCek(int hesapNo);
    void paraYatir(int hesapNo);
    void paraTransferi(int hesapNo1, int hesapNo2,double tutar);   
   void kartLimitiGuncelleme(int hesapNo);
}
interface BorcOdemeIslemleri {  
    void kartBorcuOde(int hesapNo, int tcNo);
    void krediOde(int hesapNo,int tcNo); 
}
interface FaturaOdeme  {
    void elektrik(int hesapNo,int tcNo);
    void su(int hesapNo,int tcNo);
    void dogalgaz(int hesapNo,int tcNo);
    void telefon(int hesapNo,int tcNo);
}
abstract class LogIn {
   int tcNo, sifre;
    public LogIn(int tcNo, int sifre) {
        this.tcNo = tcNo;
        this.sifre = sifre;
    } 
     public LogIn() {
        this.tcNo = 000;
        this.sifre = 0000;
    } 
}

abstract class Kullanici extends LogIn {
    String isim,soyisim,adres;
    int tcNo,telNo;
    
    public String getIsim() {return isim;}
    public void setIsim(String isim) {this.isim = isim;}
    public String getSoyisim() {return soyisim;}
    public void setSoyisim(String soyisim) {this.soyisim = soyisim;}
    public String getAdres() {return adres;}
    public void setAdres(String adres) {this.adres = adres;}
    public int getTcNo() {return tcNo;}
    public void setTcNo(int tcNo) {this.tcNo = tcNo;}
    public int getTelNo() {return telNo;}
    public void setTelNo(int telNo) {this.telNo = telNo;}

//    public Kullanici(String isim, String soyisim, int tcNo) {  
//       //super(tcNo,sifre);
//        this.isim = isim;
//        this.soyisim = soyisim;
//        this.tcNo = tcNo;
//       
//    }

    public Kullanici(String isim, String soyisim, String adres, int tcNo, int telNo,  int sifre) {
        super(tcNo, sifre);
        this.isim = isim;
        this.soyisim = soyisim;
        this.adres = adres;
        this.tcNo = tcNo;
        this.telNo = telNo;
    }
    
    public Kullanici() {
        super();
        isim="tanımsız";
        soyisim="tanımsız";
        tcNo=00000000000;
    }
}

