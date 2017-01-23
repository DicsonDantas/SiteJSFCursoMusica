package escola.musica.model;

public enum TipoCurso {

	

	CORDAS("Cordas"),
	MADEIRAS("Madeiras"),
	METAIS("Metais"),
	PERCUSSAO("Percussão");
	private String label;
	
	private TipoCurso(String label) {
		this.label = label;
	}

	private TipoCurso() {
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	 
	
	
}
