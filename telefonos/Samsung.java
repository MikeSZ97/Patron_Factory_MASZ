package telefonos;

public class Samsung implements Mobile{
	private int ramSize;
	private String processor;
	public String name = Mobile.SAMSUNG;
	public Samsung(int ramSize){
		this.ramSize = ramSize;
	}
	
	public Samsung(String processor){
		this.processor = processor;
		this.ramSize =2;
	}

    public Samsung() {
    }

    public Samsung(int ramSize, String processor) {
        this.ramSize = ramSize;
        this.processor = processor;
    }

    public int getRamSize() {
        this.ramSize = 2;
        return ramSize;
    }

    public String getProcessor() {
        this.processor = "intel ";
        return processor;
    }

}
