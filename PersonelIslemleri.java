
import java.io.*;
import java.util.ListIterator;
import java.util.Vector;
import javax.swing.JOptionPane;


public class PersonelIslemleri extends Personel{
    public void krediOnayVer(String x){
         Vector<String> v = new Vector<String>();
         String yedek=null;  
         String yedek2=null;
    try{   
           FileReader fr =new FileReader("kredibasvurusu.txt");
            BufferedReader buf=new BufferedReader(fr);
            String satir;
            int sayac=0;
            while ((satir=buf.readLine())!=null){
                String []words=satir.split(" ");
                if(sayac!=Integer.parseInt(x)){
                   for(int i=0;i<words.length;i++){
                    v.add(words[i]);
                    
                }             
                } else {
                   yedek= words[0];
                   yedek2=words[2];
                   
                   
                }   
                sayac++;
            } 
           fr.close();
           buf.close();       
       }catch(FileNotFoundException f)
        {System.out.println("dosya yok");}
        catch(IOException ioex)
        {System.out.println("başka bir hata oldu"); }
    
    File f=new File("kredibasvurusu.txt");
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

    Vector<String> v2 = new Vector<String>();
        
    try{   
           FileReader fr =new FileReader("hesapbilgileri.txt");
            BufferedReader buf=new BufferedReader(fr);
            String satir;
            while ((satir=buf.readLine())!=null){
                String []words=satir.split(" ");
                if(yedek.equals(words[0])){ 
                   words[2]=String.valueOf(Double.parseDouble(words[2])+Double.parseDouble(yedek2));  
                   yedek=words[2];                   
                }  
                for(int i=0;i<words.length;i++){
                    v2.add(words[i]);
                }
                           
            } 
           fr.close();
           buf.close();       
       }catch(FileNotFoundException fb)
        {System.out.println("dosya yok");}
        catch(IOException ioex)
        {System.out.println("başka bir hata oldu"); }
    
    File fx=new File("hesapbilgileri.txt");
      fx.delete();   
   try(BufferedWriter br = new BufferedWriter(new FileWriter(fx,true))){
    ListIterator iter = v2.listIterator();
                int i=1;
                while (iter.hasNext()) {              
                    br.write((String)iter.next());
                    if(i%4==0&&i!=v2.size()){
                        br.newLine();
                    }
                    else br.write(" ");
                    i++;
                }
                br.close();
} catch (IOException e) {
    System.out.println("Unable to read file " +f.toString());
}     
    }
    public void krediKartiOnayiVer(String x){
        Vector<String> v = new Vector<String>();
        try{   
           FileReader fr =new FileReader("kredikartbasvurusu.txt");
            BufferedReader buf=new BufferedReader(fr);
            String satir;
            int sayac=0;
            while ((satir=buf.readLine())!=null){
                String []words=satir.split(" ");
                if(sayac!=Integer.parseInt(x)){
                   for(int i=0;i<words.length;i++){
                    v.add(words[i]);                  
                }             
                } 
                sayac++;
            } 
           fr.close();
           buf.close();       
       }catch(FileNotFoundException f)
        {System.out.println("dosya yok");}
        catch(IOException ioex)
        {System.out.println("başka bir hata oldu"); }
    
    File f=new File("kredikartbasvurusu.txt");
    f.delete();   
   try(BufferedWriter br = new BufferedWriter(new FileWriter(f,true))){
    ListIterator iter = v.listIterator();
                int i=1;
                while (iter.hasNext()) {              
                    br.write((String)iter.next());
                    if(i%2==0&&i!=v.size()){
                        br.newLine();
                    }
                    else br.write(" ");
                    i++;
                }
                br.close();
} catch (IOException e) {
    System.out.println("Unable to read file " +f.toString());
} 
    }
    public void musterikayit(String t,String s,String a,String so,String h,String tn){
        File f=new File("musteribilgileri.txt");
        File f1=new File ("hesapbilgileri.txt");
        File f2=new File ("borcbilgileri.txt");
      
   try(BufferedWriter br = new BufferedWriter(new FileWriter(f,true))){
       br.newLine();
       br.write(t+" ");
       br.write(s+" ");
       br.write(a+" ");
       br.write(so+" ");
       br.write(h+" ");
       br.write(tn);
       br.close();
} catch (IOException e) {
    System.out.println("Unable to read file " +f.toString());
}     
   try(BufferedWriter br2 = new BufferedWriter(new FileWriter(f1,true))){
      br2.newLine();
       br2.write(h+" ");
       br2.write(t+" ");
       br2.write("0.0"+" ");
       br2.write("0.0");     
       br2.close();
} catch (IOException e) {
    System.out.println("Unable to read file " +f.toString());
}     
   try(BufferedWriter br3 = new BufferedWriter(new FileWriter(f2,true))){
       br3.newLine();    
       br3.write(t+" ");
       br3.write("0.0"+" ");
       br3.write("0.0"+" ");
       br3.write("0.0"+" ");
       br3.write("0.0"+" ");
       br3.write("0.0"+" ");
       br3.write("0.0");     
       br3.close();
} catch (IOException e) {
    System.out.println("Unable to read file " +f.toString());
}     
    }
    public void personelkayit (String t,String s,String u,String a,String so,String tn){
         File f=new File("personelbilgileri.txt");
       try(BufferedWriter br = new BufferedWriter(new FileWriter(f,true))){
      br.newLine();
       br.write(t+" ");
       br.write(s+" ");
        br.write(u+" ");
       br.write(a+" ");
       br.write(so+" ");
       br.write(tn);
       br.close();
} catch (IOException e) {
    System.out.println("Unable to read file " +f.toString());
}     
    }
}
