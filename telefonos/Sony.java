package telefonos;

public class Sony implements Mobile{
	private int ramSize;
	private String processor;
	
	public Sony(int ramSize, String processor){
		this.ramSize = ramSize;
		this.processor = processor;
	}

    public Sony() {
    }
        

    public int getRamSize() {
        this.ramSize = 2;
        return ramSize;
    }

    public String getProcessor() {
        this.processor = "arm ";
        return processor;
    }
        
}
