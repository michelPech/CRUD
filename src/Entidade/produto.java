package Entidade;

public class produto extends grupoItem{
	
	private Integer nuCodBarrasProduto;
	private String  nmProduto;
	private Integer nuFiscoProduto;
	private String  tpMedidaProduto;	
	
	public Integer getNuCodBarrasProduto() {
		return nuCodBarrasProduto;
	}

	public void setNuCodBarrasProduto(Integer nuCodBarrasProduto) {
		this.nuCodBarrasProduto = nuCodBarrasProduto;
	}

	public String getNmProduto() {
		return nmProduto;
	}

	public void setNmProduto(String nmProduto) {
		this.nmProduto = nmProduto;
	}

	public Integer getNuFiscoProduto() {
		return nuFiscoProduto;
	}

	public void setNuFiscoProduto(Integer nuFiscoProduto) {
		this.nuFiscoProduto = nuFiscoProduto;
	}

	public String getTpMedidaProduto() {
		return tpMedidaProduto;
	}

	public void setTpMedidaProduto(String tpMedidaProduto) {
		this.tpMedidaProduto = tpMedidaProduto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((nuCodBarrasProduto == null) ? 0 : nuCodBarrasProduto.hashCode());
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
		produto other = (produto) obj;
		if (nuCodBarrasProduto == null) {
			if (other.nuCodBarrasProduto != null)
				return false;
		} else if (!nuCodBarrasProduto.equals(other.nuCodBarrasProduto))
			return false;
		return true;
	}
}
