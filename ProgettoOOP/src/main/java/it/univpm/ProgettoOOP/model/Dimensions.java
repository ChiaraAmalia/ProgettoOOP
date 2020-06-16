package it.univpm.ProgettoOOP.model;

/**
 * Questa classe viene utilizzata per rappresentare le dimensioni delle immagini
 * contenute nel tweet
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 *
 */
public class Dimensions {
	
	private long height;
	private long width;
	private String resize;
	

	public Dimensions() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return l'altezza
	 */
	public long getHeight() {
		return height;
	}

	/**
	 * @param height
	 * l'altezza settata a un nuovo valore
	 */
	public void setHeight(long height) {
		this.height = height;
	}

	/**
	 * @return la larghezza
	 */
	public long getWidth() {
		return width;
	}

	/**
	 * @param width
	 * la larghezza settata a un nuovo valore
	 */
	public void setWidth(long width) {
		this.width = width;
	}

	/**
	 * @return l'adattamento dell'immagine
	 */
	public String getResize() {
		return resize;
	}

	/**
	 * @param resize
	 * l'adattamento dell'immagine settato a un nuovo valore
	 */
	public void setResize(String resize) {
		this.resize = resize;
	}
	
	
}
