
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
public class Musteri extends Kullanici implements SifreIslemleri {
    int hesapNo;
    double bakiye, krediKartLimiti;
    
    //public Musteri(String isim, String soyisim,int tcNo) {super(isim, soyisim, tcNo);}

    public Musteri(String isim, String soyisim, String adres, int tcNo, int telNo, int sifre) {
        super(isim, soyisim, adres, tcNo, telNo, sifre);
    }
    public Musteri() {super();}
    @Override
    public void sifreDegistir(int yenisifre,int eskisifre) {    
        Vector<String> v = new Vector<String>();
        try{   
           FileReader fr =new FileReader("musteribilgileri.txt");
            BufferedReader buf=new BufferedReader(fr);
            String satir;
            while ((satir=buf.readLine())!=null){
                String []words=satir.split(" ");
                if(String.valueOf(eskisifre).equals(words[1])){
                    words[1]=String.valueOf(yenisifre);
                }
                for(int i=0;i<words.length;i++){
                    v.add(words[i]);
                   // v.add(" ");
                }
            }
           
           fr.close();
           buf.close();
          
       }catch(FileNotFoundException f)
        {System.out.println("dosya yok");}
        catch(IOException ioex)
        {System.out.println("başka bir hata oldu"); }
      File f=new File("musteribilgileri.txt");
      f.delete();   
   try(BufferedWriter br = new BufferedWriter(new FileWriter(f,true))){
    ListIterator iter = v.listIterator();
                int i=1;
                while (iter.hasNext()) {              
                    br.write((String)iter.next());
                    if(i%6==0&&i!=v.size()){
                        br.newLine();
                    }
                    else br.write(" ");
                    i++;
                }
                br.close();
} catch (IOException e) {
    System.out.println("Unable to read file " +f.toString());
}     
   JOptionPane.showMessageDialog(null,"Sifre Değişim İşlemi Başarı İe Tamamlandı"); 
    }
}