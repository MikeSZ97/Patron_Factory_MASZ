
package telefonos;

/**
 *
 * @author Pc
 */
public class WindowsPhone {
    public String Procesador;

    public WindowsPhone() {
    }
    
    
    

    public WindowsPhone(String Procesador) {
        this.Procesador = Procesador;
    }

    public String getProcesador() {
        this.Procesador = "intel";
        return Procesador;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }
    
    
    
}
