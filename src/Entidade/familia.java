package Entidade;

public class familia extends item {

	private Integer nuFamilia;
	private String  nmFamilia;
	
	public familia() {
		
	}

	public familia(Integer nuFamilia, String nmFamilia) {
		super();
		this.nuFamilia = nuFamilia;
		this.nmFamilia = nmFamilia;
	}

	public Integer getNuFamilia() {
		return nuFamilia;
	}

	public void setNuFamilia(Integer nuFamilia) {
		this.nuFamilia = nuFamilia;
	}

	public String getNmFamilia() {
		return nmFamilia;
	}

	public void setNmFamilia(String nmFamilia) {
		this.nmFamilia = nmFamilia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((nmFamilia == null) ? 0 : nmFamilia.hashCode());
		result = prime * result + ((nuFamilia == null) ? 0 : nuFamilia.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		familia other = (familia) obj;
		if (nmFamilia == null) {
			if (other.nmFamilia != null)
				return false;
		} else if (!nmFamilia.equals(other.nmFamilia))
			return false;
		if (nuFamilia == null) {
			if (other.nuFamilia != null)
				return false;
		} else if (!nuFamilia.equals(other.nuFamilia))
			return false;
		return true;
	}		
}
