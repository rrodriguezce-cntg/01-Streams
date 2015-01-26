
public class Factura {

	private double cantidad;
	private String cliente;

	
	
	public Factura(String cliente, double cantidad ) {
		super();
		this.cantidad = cantidad;
		this.cliente = cliente;
	}
	
	
	
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
	
	
}
