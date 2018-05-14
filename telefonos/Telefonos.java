
package telefonos;

/**
 *
 * @author Pc
 */
public class Telefonos {


    public static void main(String[] args) {
        Aiphone AIp = new Aiphone();
        Android An = new Android();
        WindowsPhone WP = new WindowsPhone();
        Samsung SG = new Samsung();
        Sony So = new Sony();
        IPhone IP = new IPhone();
        
        
        System.out.println("AIphone: " + AIp.getCamara() + AIp.getMemoria() + AIp.getProcesador() + "\n" +
                            "Android: " + An.getRAM() + An.getVersion() + "\n" +
                            "windows phone: " + WP.getProcesador()+"\n"+"Samsung:"+SG.getProcessor() +SG.getRamSize()+ "\n"
                            +"Sony: "+So.getProcessor()+So.getRamSize()+"\n"
                            +"IPhone: "+IP.getProcessor()+IP.getProcessor()+IP.getRamSize());
        
        
        
   
    }
    
}
