
public class Calculadora {

	private double resultado, aux, aux2, resultado2;
	
	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public double getAux() {
		return aux;
	}

	public void setAux(double aux) {
		this.aux = aux;
	}

	public double getAux2() {
		return aux2;
	}

	public void setAux2(double aux2) {
		this.aux2 = aux2;
	}

	public double getResultado2() {
		return resultado2;
	}

	public void setResultado2(double resultado2) {
		this.resultado2 = resultado2;
	}

	public void soma(double num) {
		this.resultado += num;
	}
	
	public void subtrai(double num, int i) {
		this.resultado = this.aux - num;
		this.aux = num;
		if (i > 0) {
			this.resultado2 = this.aux2 - num;
			this.aux2 = this.resultado;
			if (i > 1) {
				this.resultado = this.resultado2;
			}
		}
	}
	
	public void multi(double num, int i) {
		this.resultado = this.aux * num;
		this.aux = num;
		if (i > 0) {
			this.resultado2 = this.aux2 * num;
			this.aux2 = this.resultado;
			if (i > 1) {
				this.resultado = this.resultado2;
			}
		}
	}
	
	public void divi(double num) {
		this.resultado = this.aux / num;
		this.aux = num;
	}
	
	public void potenc(double num) {
		this.resultado = Math.pow(this.aux, num);
		this.aux = num;
	}
	
	public void porct(double num) {
		this.resultado = this.aux * (num / 100);
		this.aux = num;
	}
	
	public void raiz(double num) {
		this.resultado = Math.sqrt(num);
	}
	
}
