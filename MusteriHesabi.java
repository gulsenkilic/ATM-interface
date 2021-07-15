
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ListIterator;
import java.util.Vector;
import javax.swing.JOptionPane;


public class MusteriHesabi extends Musteri implements BankaHesabi,BorcOdemeIslemleri{
       int hesapNo,tcNo;
        double bakiye;

    public MusteriHesabi(int hesapNo, int tcNo) {
        this.hesapNo = hesapNo;
        this.tcNo = tcNo;
    }
    public MusteriHesabi() {
       this.hesapNo = 0;
        this.tcNo = 0;
    }

    @Override
    public void bakiyeSorgulama(int hesapNo) {
        try{   
           FileReader fr =new FileReader("hesapbilgileri.txt");
            BufferedReader buf=new BufferedReader(fr);
            String satir;
            while ((satir=buf.readLine())!=null){
                String []words=satir.split(" ");
                if(String.valueOf(hesapNo).equals(words[0])){
                       JOptionPane.showMessageDialog(null,"Hesabınızdaki bakiye: "+words[2]+" TL'dir."); 
                }             
            } 
           fr.close();
           buf.close();       
       }catch(FileNotFoundException f)
        {System.out.println("dosya yok");}
        catch(IOException ioex)
        {System.out.println("başka bir hata oldu"); }
    }
    @Override
    public void paraCek(int hesapNo) {
         Vector<String> v = new Vector<String>();
         String yedek="0";
       
         boolean bool=false;
    try{   
           FileReader fr =new FileReader("hesapbilgileri.txt");
            BufferedReader buf=new BufferedReader(fr);
            String satir;
            while ((satir=buf.readLine())!=null){
                String []words=satir.split(" ");
                if(String.valueOf(hesapNo).equals(words[0])){ 
                   String n= JOptionPane.showInputDialog("Hesabınızdaki bakiye: "+words[2]+" TL'dir. Kaç para çekmek istiyorsunuz:");
                   if(Double.parseDouble(n)<=Double.parseDouble(words[2])){
                   words[2]=String.valueOf(Double.parseDouble(words[2])-Double.parseDouble(n));  
                   yedek=words[2];        
                }else  {
                       JOptionPane.showMessageDialog(null,"İşlem başarsız. Girilen tutar hesabınızda mevcut değil!");  
                       bool=true;
                   }
                   
                }  
                for(int i=0;i<words.length;i++){
                    v.add(words[i]);
                }
                           
            } 
           fr.close();
           buf.close();       
       }catch(FileNotFoundException f)
        {System.out.println("dosya yok");}
        catch(IOException ioex)
        {System.out.println("başka bir hata oldu"); }
    
    File f=new File("hesapbilgileri.txt");
      f.delete();   
   try(BufferedWriter br = new BufferedWriter(new FileWriter(f,true))){
    ListIterator iter = v.listIterator();
                int i=1;
                while (iter.hasNext()) {              
                    br.write((String)iter.next());
                    if(i%4==0&&i!=v.size()){
                        br.newLine();
                    }
                    else br.write(" ");
                    i++;
                }
                br.close();
} catch (IOException e) {
    System.out.println("Unable to read file " +f.toString());
}     
   if(bool==false)JOptionPane.showMessageDialog(null,"Para Çekme İşlemi Başarı İe Tamamlandı. Hesabınızda Kalan Bakiye "+yedek+" TL'dir."); 
    
    }
    @Override
    public void paraYatir(int hesapNo) {
         Vector<String> v = new Vector<String>();
         String yedek=null;
    try{   
           FileReader fr =new FileReader("hesapbilgileri.txt");
            BufferedReader buf=new BufferedReader(fr);
            String satir;
            while ((satir=buf.readLine())!=null){
                String []words=satir.split(" ");
                if(String.valueOf(hesapNo).equals(words[0])){ 
                   String n= JOptionPane.showInputDialog("Hesabınızdaki bakiye: "+words[2]+" TL'dir. Kaç para eklemek istiyorsunuz:");                  
                   words[2]=String.valueOf(Double.parseDouble(words[2])+Double.parseDouble(n));  
                   yedek=words[2];                   
                }  
                for(int i=0;i<words.length;i++){
                    v.add(words[i]);
                }
                           
            } 
           fr.close();
           buf.close();       
       }catch(FileNotFoundException f)
        {System.out.println("dosya yok");}
        catch(IOException ioex)
        {System.out.println("başka bir hata oldu"); }
    
    File f=new File("hesapbilgileri.txt");
      f.delete();   
   try(BufferedWriter br = new BufferedWriter(new FileWriter(f,true))){
    ListIterator iter = v.listIterator();
                int i=1;
                while (iter.hasNext()) {              
                    br.write((String)iter.next());
                    if(i%4==0&&i!=v.size()){
                        br.newLine();
                    }
                    else br.write(" ");
                    i++;
                }
                br.close();
} catch (IOException e) {
    System.out.println("Unable to read file " +f.toString());
}     
   JOptionPane.showMessageDialog(null,"Para Ekleme İşlemi Başarı İe Tamamlandı. Hesabınızda Kalan Bakiye "+yedek+" TL'dir."); 
    
    }
    @Override
    public void paraTransferi(int hesapNo1, int hesapNo2,double tutar) {
        Vector<String> v = new Vector<String>();
         Vector<String> v2 = new Vector<String>();
        boolean bool=true;
        boolean bool2=false;
        String num="";
       try{   
           FileReader fr =new FileReader("hesapbilgileri.txt");
            BufferedReader buf=new BufferedReader(fr);
            String satir;
            while ((satir=buf.readLine())!=null){
                String []words=satir.split(" ");
                if(String.valueOf(hesapNo1).equals(words[0])){
                     //num = JOptionPane.showInputDialog("Kaç TL aktarmak istiyorsunuz: ");   
                    if(tutar<=Double.parseDouble(words[2])){
                        words[2]=String.valueOf(Double.parseDouble(words[2])-tutar);
                    } else {
                      JOptionPane.showMessageDialog(null,"İşlem başarısız. Hesabınızda yeterli miktar bulunmamakta.");   
                       bool=false;
                    }
                } 
                for(int i=0;i<words.length;i++){
                    v.add(words[i]);
                }
            } 
           fr.close();
           buf.close();       
       }catch(FileNotFoundException f)
        {System.out.println("dosya yok");}
        catch(IOException ioex)
        {System.out.println("başka bir hata oldu"); } 
       
       try{   
           FileReader fr =new FileReader("hesapbilgileri.txt");
            BufferedReader buf=new BufferedReader(fr);
            String satir;
            int i=0;
            while ((satir=buf.readLine())!=null){
                String []words=satir.split(" ");
                if(String.valueOf(hesapNo2).equals(words[0])){
                       bool2=true;
                       words[2]=String.valueOf(Double.parseDouble(words[2])+tutar);
                       v.remove(i*4+2);
                       v.add(i*4+2, words[2]);
                } 
                i++;
            } 
            if(bool2==false){
                JOptionPane.showMessageDialog(null,"İşlem başarısız. Girmiş olduğunuz hesap numarasına ait müşteri bulunmamakta veya hesap numarası yanlış");   
            } 
           fr.close();
           buf.close();       
       }catch(FileNotFoundException f)
        {System.out.println("dosya yok");}
        catch(IOException ioex)
        {System.out.println("başka bir hata oldu"); }
       if(bool==true && bool2==true){
           File f=new File("hesapbilgileri.txt");
      f.delete();   
   try(BufferedWriter br = new BufferedWriter(new FileWriter(f,true))){
    ListIterator iter = v.listIterator();
                int i=1;
                while (iter.hasNext()) {              
                    br.write((String)iter.next());
                    if(i%4==0&&i!=v.size()){
                        br.newLine();
                    }
                    else br.write(" ");
                    i++;
                }
                br.close();
} catch (IOException e) {
    System.out.println("Unable to read file " +f.toString());
}     
      JOptionPane.showMessageDialog(null,hesapNo2+" numaralı hesaba para transferi başarı ile tamamlanmıştır.");

       }
       
    }  
     @Override
    public void kartBorcuOde(int hesapNo, int tcNo) {
    String yedek="";
        String yedek2="";
        int x=0;
        Vector<String> v = new Vector<String>();
        Vector<String> v1 = new Vector<String>();
        boolean bool=true;

       try{   
           FileReader fr =new FileReader("hesapbilgileri.txt");
            BufferedReader buf=new BufferedReader(fr);
            String satir;
            while ((satir=buf.readLine())!=null){
                String []words=satir.split(" ");
                if(String.valueOf(hesapNo).equals(words[0])){
                     
                     yedek=words[2];
                     x=v.size()+2;
                     
                }
                for(int i=0;i<words.length;i++){
                    v.add(words[i]);
                }
            } 
           fr.close();
           buf.close();       
        }catch(FileNotFoundException f)
        {System.out.println("dosya yok");}
        catch(IOException ioex)
        {System.out.println("başka bir hata oldu"); }
        try{   
           FileReader fr =new FileReader("borcbilgileri.txt");
            BufferedReader buf=new BufferedReader(fr);
            String satir;
            while ((satir=buf.readLine())!=null){
                String []words=satir.split(" ");
                if(String.valueOf(tcNo).equals(words[0])){  
                 if(yedek!=""){
                if(Double.parseDouble(yedek)>= Double.parseDouble(words[5])){
                    if(words[5]=="0.0"){
                      JOptionPane.showMessageDialog(null,"Borcunuz bulunmamakta."); 
                      bool=false;
                    } else {
                 yedek=String.valueOf(Double.parseDouble(yedek)-Double.parseDouble(words[5]));
                words[5]="0.0";
                v.remove(x);
                v.add(x, yedek);
                    }
                
                 } else {
               JOptionPane.showMessageDialog(null,"İşlem başarsız. Hesabınızda yetirli miktar mevcut değil!");  
                bool =false;
                 }}}  
                for(int i=0;i<words.length;i++){
                    v1.add(words[i]);}} 
           fr.close();
           buf.close();       
        }catch(FileNotFoundException f)
        {System.out.println("dosya yok");}
        catch(IOException ioex)
        {System.out.println("başka bir hata oldu"); }
        
        if(bool=true){
     File f=new File("hesapbilgileri.txt");
      f.delete();   
   try(BufferedWriter br = new BufferedWriter(new FileWriter(f,true))){
    ListIterator iter = v.listIterator();
                int i=1;
                while (iter.hasNext()) {              
                      br.write((String)iter.next());
                  
                    if(i%4==0&&i!=v.size()){
                        br.newLine();
                    }
                    else br.write(" ");
                    i++;
                }
                br.close();
} catch (IOException e) {
    System.out.println("Unable to read file " +f.toString());
}     
  
        File fx=new File("borcbilgileri.txt");
      fx.delete();   
   try(BufferedWriter br = new BufferedWriter(new FileWriter(fx,true))){
    ListIterator iter = v1.listIterator();
                int i=1;
                while (iter.hasNext()) {              
                      br.write((String)iter.next());
                  
                    if(i%7==0&&i!=v1.size()){
                        br.newLine();
                    }
                    else br.write(" ");
                    i++;
                }
                br.close();
} catch (IOException e) {
    System.out.println("Unable to read file " +f.toString());
}     
      JOptionPane.showMessageDialog(null,"Kredi Kartı Borcu Ödeme İşleminiz Başarı ile Tamamlanmıştır. Hesabınızda Kalan Bakiyeniz: "+yedek+" TL'dir."); 
        }//bool son
     }
    @Override
    public void krediOde(int hesapNo, int tcNo) {
        String yedek="";
        String yedek2="";
        int x=0;
        Vector<String> v = new Vector<String>();
        Vector<String> v1 = new Vector<String>();
        boolean bool=true;

       try{   
           FileReader fr =new FileReader("hesapbilgileri.txt");
            BufferedReader buf=new BufferedReader(fr);
            String satir;
            while ((satir=buf.readLine())!=null){
                String []words=satir.split(" ");
                if(String.valueOf(hesapNo).equals(words[0])){
                    //System.out.println("başka bir hata oldu1");   
                     yedek=words[2];
                     x=v.size()+2;
                     
                }
                for(int i=0;i<words.length;i++){
                    v.add(words[i]);
                }
            } 
           fr.close();
           buf.close();       
        }catch(FileNotFoundException f)
        {System.out.println("dosya yok");}
        catch(IOException ioex)
        {System.out.println("başka bir hata oldu"); }
        try{   
           FileReader fr =new FileReader("borcbilgileri.txt");
            BufferedReader buf=new BufferedReader(fr);
            String satir;
            while ((satir=buf.readLine())!=null){
                String []words=satir.split(" ");
                if(String.valueOf(tcNo).equals(words[0])){  
                 if(yedek!=""){
                     if(Double.parseDouble(yedek)>= Double.parseDouble(words[6])){
                yedek=String.valueOf(Double.parseDouble(yedek)-Double.parseDouble(words[6]));
                words[6]="0.0";
                v.remove(x);
                v.add(x, yedek);
                 } else {
               JOptionPane.showMessageDialog(null,"İşlem başarsız. Hesabınızda yetirli miktar mevcut değil!");  
                bool =false;
                 }}}  
                for(int i=0;i<words.length;i++){
                    v1.add(words[i]);}} 
           fr.close();
           buf.close();       
        }catch(FileNotFoundException f)
        {System.out.println("dosya yok");}
        catch(IOException ioex)
        {System.out.println("başka bir hata oldu"); }
        if(bool=true){
     File f=new File("hesapbilgileri.txt");
      f.delete();   
   try(BufferedWriter br = new BufferedWriter(new FileWriter(f,true))){
    ListIterator iter = v.listIterator();
                int i=1;
                while (iter.hasNext()) {              
                      br.write((String)iter.next());
                  
                    if(i%4==0&&i!=v.size()){
                        br.newLine();
                    }
                    else br.write(" ");
                    i++;
                }
                br.close();
} catch (IOException e) {
    System.out.println("Unable to read file " +f.toString());
}     
  
        File fx=new File("borcbilgileri.txt");
      fx.delete();   
   try(BufferedWriter br = new BufferedWriter(new FileWriter(fx,true))){
    ListIterator iter = v1.listIterator();
                int i=1;
                while (iter.hasNext()) {              
                      br.write((String)iter.next());
                  
                    if(i%7==0&&i!=v1.size()){
                        br.newLine();
                    }
                    else br.write(" ");
                    i++;
                }
                br.close();
} catch (IOException e) {
    System.out.println("Unable to read file " +f.toString());
}     
      JOptionPane.showMessageDialog(null,"Kredi Borcu Ödeme İşleminiz Başarı ile Tamamlanmıştır. Hesabınızda Kalan Bakiyeniz: "+yedek+" TL'dir."); 
        }//bool son
     
    }
     @Override
    public void kartLimitiGuncelleme(int hesapNo){
    Vector<String> v = new Vector<String>();
    String yedek=null;
    try{   
           FileReader fr =new FileReader("hesapbilgileri.txt");
            BufferedReader buf=new BufferedReader(fr);
            String satir;
            while ((satir=buf.readLine())!=null){
                String []words=satir.split(" ");
                if(String.valueOf(hesapNo).equals(words[0])){ 
                   String n= JOptionPane.showInputDialog("Hesabınızın limiti: "+words[3]+" TL'dir. Yeni limitin kac tl olmasını istiyorsunuz:");  
                   words[3]=n;
                   yedek=n;
                }  
                for(int i=0;i<words.length;i++){
                    v.add(words[i]);
                }
                           
            } 
           fr.close();
           buf.close();       
       }catch(FileNotFoundException f)
        {System.out.println("dosya yok");}
        catch(IOException ioex)
        {System.out.println("başka bir hata oldu"); }
    
    File f=new File("hesapbilgileri.txt");
    f.delete();   
   try(BufferedWriter br = new BufferedWriter(new FileWriter(f,true))){
    ListIterator iter = v.listIterator();
                int i=1;
                while (iter.hasNext()) {              
                    br.write((String)iter.next());
                    if(i%4==0&& i!=v.size()){
                        br.newLine();
                    }
                    else br.write(" ");
                    i++;
                }
                br.close();
} catch (IOException e) {
    System.out.println("Unable to read file " +f.toString());
}     
   JOptionPane.showMessageDialog(null,"Limit Güncelleme İşlemi Başarı İe Tamamlandı. Hesabınızın Yeni Limiti "+Integer.parseInt(yedek)+" TL'dir."); 
    }
   
}
class Fatura extends MusteriHesabi implements FaturaOdeme{

    @Override
    public void elektrik(int hesapNo, int tcNo) {
        String yedek="";
        String yedek2="";
        int x=0;
        Vector<String> v = new Vector<String>();
        Vector<String> v1 = new Vector<String>();
        boolean bool=true;

       try{   
           FileReader fr =new FileReader("hesapbilgileri.txt");
            BufferedReader buf=new BufferedReader(fr);
            String satir;
            while ((satir=buf.readLine())!=null){
                String []words=satir.split(" ");
                if(String.valueOf(hesapNo).equals(words[0])){
                    //System.out.println("başka bir hata oldu1");   
                     yedek=words[2];
                     x=v.size()+2;
                     
                }
                for(int i=0;i<words.length;i++){
                    v.add(words[i]);
                }
            } 
           fr.close();
           buf.close();       
        }catch(FileNotFoundException f)
        {System.out.println("dosya yok");}
        catch(IOException ioex)
        {System.out.println("başka bir hata oldu"); }
        try{   
           FileReader fr =new FileReader("borcbilgileri.txt");
            BufferedReader buf=new BufferedReader(fr);
            String satir;
            while ((satir=buf.readLine())!=null){
                String []words=satir.split(" ");
                if(String.valueOf(tcNo).equals(words[0])){  
                 if(yedek!=""){
                     if(Double.parseDouble(yedek)>= Double.parseDouble(words[1])){
                yedek=String.valueOf(Double.parseDouble(yedek)-Double.parseDouble(words[1]));
                words[1]="0.0";
                v.remove(x);
                v.add(x, yedek);
                 } else {
               JOptionPane.showMessageDialog(null,"İşlem başarsız. Hesabınızda yetirli miktar mevcut değil!");  
                bool =false;
                 }}}  
                for(int i=0;i<words.length;i++){
                    v1.add(words[i]);}} 
           fr.close();
           buf.close();       
        }catch(FileNotFoundException f)
        {System.out.println("dosya yok");}
        catch(IOException ioex)
        {System.out.println("başka bir hata oldu"); }
       
        if(bool=true){
     File f=new File("hesapbilgileri.txt");
      f.delete();   
   try(BufferedWriter br = new BufferedWriter(new FileWriter(f,true))){
    ListIterator iter = v.listIterator();
                int i=1;
                while (iter.hasNext()) {              
                      br.write((String)iter.next());
                  
                    if(i%4==0&&i!=v.size()){
                        br.newLine();
                    }
                    else br.write(" ");
                    i++;
                }
                br.close();
} catch (IOException e) {
    System.out.println("Unable to read file " +f.toString());
}     
  
        File fx=new File("borcbilgileri.txt");
      fx.delete();   
   try(BufferedWriter br = new BufferedWriter(new FileWriter(fx,true))){
    ListIterator iter = v1.listIterator();
                int i=1;
                while (iter.hasNext()) {              
                      br.write((String)iter.next());
                  
                    if(i%7==0&&i!=v1.size()){
                        br.newLine();
                    }
                    else br.write(" ");
                    i++;
                }
                br.close();
} catch (IOException e) {
    System.out.println("Unable to read file " +f.toString());
}     
      JOptionPane.showMessageDialog(null,"Elektrik Faturası Ödeme İşleminiz Başarı ile Tamamlanmıştır. Hesabınızda Kalan Bakiyeniz: "+yedek+" TL'dir."); 
        }//bool son
    }

    @Override
    public void su(int hesapNo, int tcNo) {
        String yedek="";
        String yedek2="";
        int x=0;
        Vector<String> v = new Vector<String>();
        Vector<String> v1 = new Vector<String>();
        boolean bool=true;

       try{   
           FileReader fr =new FileReader("hesapbilgileri.txt");
            BufferedReader buf=new BufferedReader(fr);
            String satir;
            while ((satir=buf.readLine())!=null){
                String []words=satir.split(" ");
                if(String.valueOf(hesapNo).equals(words[0])){
                    //System.out.println("başka bir hata oldu1");   
                     yedek=words[2];
                     x=v.size()+2;
                     
                }
                for(int i=0;i<words.length;i++){
                    v.add(words[i]);
                }
            } 
           fr.close();
           buf.close();       
        }catch(FileNotFoundException f)
        {System.out.println("dosya yok");}
        catch(IOException ioex)
        {System.out.println("başka bir hata oldu"); }
        try{   
           FileReader fr =new FileReader("borcbilgileri.txt");
            BufferedReader buf=new BufferedReader(fr);
            String satir;
            while ((satir=buf.readLine())!=null){
                String []words=satir.split(" ");
                if(String.valueOf(tcNo).equals(words[0])){  
                 if(yedek!=""){
                     if(Double.parseDouble(yedek)>= Double.parseDouble(words[2])){
                yedek=String.valueOf(Double.parseDouble(yedek)-Double.parseDouble(words[2]));
                words[2]="0.0";
                v.remove(x);
                v.add(x, yedek);
                 } else {
               JOptionPane.showMessageDialog(null,"İşlem başarsız. Hesabınızda yetirli miktar mevcut değil!");  
                bool =false;
                 }}}  
                for(int i=0;i<words.length;i++){
                    v1.add(words[i]);}} 
           fr.close();
           buf.close();       
        }catch(FileNotFoundException f)
        {System.out.println("dosya yok");}
        catch(IOException ioex)
        {System.out.println("başka bir hata oldu"); }
        
        if(bool=true){
     File f=new File("hesapbilgileri.txt");
      f.delete();   
   try(BufferedWriter br = new BufferedWriter(new FileWriter(f,true))){
    ListIterator iter = v.listIterator();
                int i=1;
                while (iter.hasNext()) {              
                      br.write((String)iter.next());
                  
                    if(i%4==0&&i!=v.size()){
                        br.newLine();
                    }
                    else br.write(" ");
                    i++;
                }
                br.close();
} catch (IOException e) {
    System.out.println("Unable to read file " +f.toString());
}     
  
        File fx=new File("borcbilgileri.txt");
      fx.delete();   
   try(BufferedWriter br = new BufferedWriter(new FileWriter(fx,true))){
    ListIterator iter = v1.listIterator();
                int i=1;
                while (iter.hasNext()) {              
                      br.write((String)iter.next());
                  
                    if(i%7==0&&i!=v1.size()){
                        br.newLine();
                    }
                    else br.write(" ");
                    i++;
                }
                br.close();
} catch (IOException e) {
    System.out.println("Unable to read file " +f.toString());
}     
      JOptionPane.showMessageDialog(null,"Su Faturası Ödeme İşleminiz Başarı ile Tamamlanmıştır. Hesabınızda Kalan Bakiyeniz: "+yedek+" TL'dir."); 
        }//bool son
    }

    @Override
    public void dogalgaz(int hesapNo, int tcNo) {
        String yedek="";
        String yedek2="";
        int x=0;
        Vector<String> v = new Vector<String>();
        Vector<String> v1 = new Vector<String>();
        boolean bool=true;

       try{   
           FileReader fr =new FileReader("hesapbilgileri.txt");
            BufferedReader buf=new BufferedReader(fr);
            String satir;
            while ((satir=buf.readLine())!=null){
                String []words=satir.split(" ");
                if(String.valueOf(hesapNo).equals(words[0])){
                    //System.out.println("başka bir hata oldu1");   
                     yedek=words[2];
                     x=v.size()+2;
                     
                }
                for(int i=0;i<words.length;i++){
                    v.add(words[i]);
                }
            } 
           fr.close();
           buf.close();       
        }catch(FileNotFoundException f)
        {System.out.println("dosya yok");}
        catch(IOException ioex)
        {System.out.println("başka bir hata oldu"); }
        try{   
           FileReader fr =new FileReader("borcbilgileri.txt");
            BufferedReader buf=new BufferedReader(fr);
            String satir;
            while ((satir=buf.readLine())!=null){
                String []words=satir.split(" ");
                if(String.valueOf(tcNo).equals(words[0])){  
                 if(yedek!=""){
                     if(Double.parseDouble(yedek)>= Double.parseDouble(words[3])){
                yedek=String.valueOf(Double.parseDouble(yedek)-Double.parseDouble(words[3]));
                words[3]="0.0";
                v.remove(x);
                v.add(x, yedek);
                 } else {
               JOptionPane.showMessageDialog(null,"İşlem başarsız. Hesabınızda yetirli miktar mevcut değil!");  
                bool =false;
                 }}}  
                for(int i=0;i<words.length;i++){
                    v1.add(words[i]);}} 
           fr.close();
           buf.close();       
        }catch(FileNotFoundException f)
        {System.out.println("dosya yok");}
        catch(IOException ioex)
        {System.out.println("başka bir hata oldu"); }
        
        if(bool=true){
     File f=new File("hesapbilgileri.txt");
      f.delete();   
   try(BufferedWriter br = new BufferedWriter(new FileWriter(f,true))){
    ListIterator iter = v.listIterator();
                int i=1;
                while (iter.hasNext()) {              
                      br.write((String)iter.next());
                  
                    if(i%4==0&&i!=v.size()){
                        br.newLine();
                    }
                    else br.write(" ");
                    i++;
                }
                br.close();
} catch (IOException e) {
    System.out.println("Unable to read file " +f.toString());
}     
  
        File fx=new File("borcbilgileri.txt");
      fx.delete();   
   try(BufferedWriter br = new BufferedWriter(new FileWriter(fx,true))){
    ListIterator iter = v1.listIterator();
                int i=1;
                while (iter.hasNext()) {              
                      br.write((String)iter.next());
                  
                    if(i%7==0&&i!=v1.size()){
                        br.newLine();
                    }
                    else br.write(" ");
                    i++;
                }
                br.close();
} catch (IOException e) {
    System.out.println("Unable to read file " +f.toString());
}     
      JOptionPane.showMessageDialog(null,"Doğalgaz Faturası Ödeme İşleminiz Başarı ile Tamamlanmıştır. Hesabınızda Kalan Bakiyeniz: "+yedek+" TL'dir."); 
        }//bool son
    }

    @Override
    public void telefon(int hesapNo, int tcNo) {
        String yedek="";
        String yedek2="";
        int x=0;
        Vector<String> v = new Vector<String>();
        Vector<String> v1 = new Vector<String>();
        boolean bool=true;

       try{   
           FileReader fr =new FileReader("hesapbilgileri.txt");
            BufferedReader buf=new BufferedReader(fr);
            String satir;
            while ((satir=buf.readLine())!=null){
                String []words=satir.split(" ");
                if(String.valueOf(hesapNo).equals(words[0])){
                    //System.out.println("başka bir hata oldu1");   
                     yedek=words[2];
                     x=v.size()+2;
                     
                }
                for(int i=0;i<words.length;i++){
                    v.add(words[i]);
                }
            } 
           fr.close();
           buf.close();       
        }catch(FileNotFoundException f)
        {System.out.println("dosya yok");}
        catch(IOException ioex)
        {System.out.println("başka bir hata oldu"); }
        try{   
           FileReader fr =new FileReader("borcbilgileri.txt");
            BufferedReader buf=new BufferedReader(fr);
            String satir;
            while ((satir=buf.readLine())!=null){
                String []words=satir.split(" ");
                if(String.valueOf(tcNo).equals(words[0])){  
                 if(yedek!=""){
                     if(Double.parseDouble(yedek)>= Double.parseDouble(words[4])){
                yedek=String.valueOf(Double.parseDouble(yedek)-Double.parseDouble(words[4]));
                words[4]="0.0";
                v.remove(x);
                v.add(x, yedek);
                 } else {
               JOptionPane.showMessageDialog(null,"İşlem başarsız. Hesabınızda yetirli miktar mevcut değil!");  
                bool =false;
                 }}}  
                for(int i=0;i<words.length;i++){
                    v1.add(words[i]);}} 
           fr.close();
           buf.close();       
        }catch(FileNotFoundException f)
        {System.out.println("dosya yok");}
        catch(IOException ioex)
        {System.out.println("başka bir hata oldu"); }
       
        if(bool=true){
     File f=new File("hesapbilgileri.txt");
      f.delete();   
   try(BufferedWriter br = new BufferedWriter(new FileWriter(f,true))){
    ListIterator iter = v.listIterator();
                int i=1;
                while (iter.hasNext()) {              
                      br.write((String)iter.next());
                  
                    if(i%4==0&&i!=v.size()){
                        br.newLine();
                    }
                    else br.write(" ");
                    i++;
                }
                br.close();
} catch (IOException e) {
    System.out.println("Unable to read file " +f.toString());
}     
  
        File fx=new File("borcbilgileri.txt");
      fx.delete();   
   try(BufferedWriter br = new BufferedWriter(new FileWriter(fx,true))){
    ListIterator iter = v1.listIterator();
                int i=1;
                while (iter.hasNext()) {              
                      br.write((String)iter.next());
                  
                    if(i%7==0&&i!=v1.size()){
                        br.newLine();
                    }
                    else br.write(" ");
                    i++;
                }
                br.close();
} catch (IOException e) {
    System.out.println("Unable to read file " +f.toString());
}     
      JOptionPane.showMessageDialog(null,"Telefon Faturası Ödeme İşleminiz Başarı ile Tamamlanmıştır. Hesabınızda Kalan Bakiyeniz: "+yedek+" TL'dir."); 
        }//bool son
    }
    
}

class Basvuru extends MusteriHesabi{
 public void krediBasvurusu(double tutar,int vade,int hesapNo,int tcNo){
     File f=new File("kredibasvurusu.txt"); 
   try(BufferedWriter br = new BufferedWriter(new FileWriter(f,true))){
           br.newLine();
            br.write(hesapNo+" "+tcNo+" "+tutar+" "+vade);
            
           br.close();
} catch (IOException e) {
    System.out.println("Unable to read file " +f.toString());
}   
   JOptionPane.showMessageDialog(null, "Kredi Başvurunuz Alınmıştır. Konuyla İlgili SMS ile Bilgilendirileceksiniz.");
}
public void kredikartBasvurusu(int tcNo, int hesapNo){
    File f=new File("kredikartbasvurusu.txt"); 
   try(BufferedWriter br = new BufferedWriter(new FileWriter(f,true))){
           br.newLine();
            br.write(tcNo+" "+hesapNo);
            
           br.close();
} catch (IOException e) {
    System.out.println("Unable to read file " +f.toString());
}   
   JOptionPane.showMessageDialog(null, "Kredi Kartı Başvurunuz Alınmıştır. Konuyla İlgili SMS ile Bilgilendirileceksiniz.");
}   
    
    
}
