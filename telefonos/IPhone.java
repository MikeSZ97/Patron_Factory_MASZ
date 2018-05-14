package telefonos;

public class IPhone implements Mobile{
	private int ramSize;
	private String processor;
	private String GPU;
	public IPhone(int ramSize, String processor, String GPU){
		this.ramSize = ramSize;
		this.processor = processor;
		this.GPU = GPU;
	}

    public IPhone() {
    }

    public int getRamSize() {
        this.ramSize = 2;
        return ramSize;
    }

    public String getProcessor() {
        this.processor = "A9 ";
        return processor;
    }

    public String getGPU() {
        this.GPU = "A9GPU ";
        return GPU;
    }
        
}
