package boletin_entregar;

import java.util.Random;

public class Carta implements Comparable{
	//necesito implementar un equals
	//necesito implementar un compareTo
	//enum Palo {OROS, COPAS, ESPADAS, BASTOS	};

	//enum Valor {AS, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, SOTA, CABALLO, REY	};

	

	String palo;
	String valor;

	Carta() {
		this.palo=generaPalo();
		this.valor=generaValor();
	}

	Carta(String palo, String valor) {
		this.palo = palo;
		this.valor = valor;
	}

	public String getPalo() {
		return palo;
	}

	public String getValor() {
		return valor;
	}
	
	public static String generaPalo() {
		String p=null ;
		Random r = new Random();
		int n =1+ r.nextInt(4 - 0);
		switch (n) {
		case 1:
			p = "OROS";
			break;
		case 2:
			p = "COPAS";
			break;
		case 3:
			p = "ESPADAS";
			break;
		case 4:
			p = "BASTOS";
			break;
		
		}
		return p;
		
	}
		
		private String generaValor() {
			String v = null;
			Random r = new Random();
			int n =1+ r.nextInt(10 - 0);
			switch (n) {
			case 1:
				v= "AS";
				break;
			case 2:
				v= "DOS";
				break;
			case 3:
				v= "TRES";
				break;
			case 4:
				v= "CUATRO";
				break;
			case 5:
				v= "CINCO";
				break;
			case 6:
				v= "SEIS";
				break;
			case 7:
				v= "SIETE";
				break;
			case 8:
				v= "SOTA";
				break;
			case 9:
				v= "CABALLO";
				break;
			case 10:
				v= "REY";
				break;
			
			}
			return v;
			
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((palo == null) ? 0 : palo.hashCode());
			result = prime * result + ((valor == null) ? 0 : valor.hashCode());
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
			Carta other = (Carta) obj;
			if (palo == null) {
				if (other.palo != null)
					return false;
			} else if (!palo.equals(other.palo))
				return false;
			if (valor == null) {
				if (other.valor != null)
					return false;
			} else if (!valor.equals(other.valor))
				return false;
			return true;
		}

	@Override
	public String toString() {
		return "Carta [palo=" + palo + ", valor=" + valor + "]";
	}

	@Override
	public int compareTo(Object o) {
		Carta c = (Carta) o;
		if((this.palo.compareTo(c.palo))==0)
			return (this.valor.compareTo(c.valor));
		else
		return (this.palo).compareTo(c.palo);
	}

	

}
