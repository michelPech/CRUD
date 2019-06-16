package Entidade;

public class item {
	
	private Integer nuIdItem;
	private String  nmClasseItem;
	
	public item() {
		
	}
	
	public item(Integer nuIdItem, String nmClasseItem) {
		super();
		this.nuIdItem = nuIdItem;
		this.nmClasseItem = nmClasseItem;
	}

	public Integer getNuIdItem() {
		return nuIdItem;
	}

	public void setNuIdItem(Integer nuIdItem) {
		this.nuIdItem = nuIdItem;
	}

	public String getNmClasseItem() {
		return nmClasseItem;
	}

	public void setNmClasseItem(String nmClasseItem) {
		this.nmClasseItem = nmClasseItem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nmClasseItem == null) ? 0 : nmClasseItem.hashCode());
		result = prime * result + ((nuIdItem == null) ? 0 : nuIdItem.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		item other = (item) obj;
		if (nmClasseItem == null) {
			if (other.nmClasseItem != null)
				return false;
		} else if (!nmClasseItem.equals(other.nmClasseItem))
			return false;
		if (nuIdItem == null) {
			if (other.nuIdItem != null)
				return false;
		} else if (!nuIdItem.equals(other.nuIdItem))
			return false;
		return true;
	}	
}
