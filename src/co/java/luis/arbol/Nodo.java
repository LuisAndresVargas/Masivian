package co.java.luis.arbol;

public class Nodo {
	 private Integer valor;
	 private Nodo nodoIz;
	 private Nodo nodoDe;
	 
/*
 * constructor de la clase 
 */
	  public Nodo(Integer valor) {
	  this.valor = valor;
	  }
/*
 * getter and setter
 */
	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Nodo getNodoIz() {
		return nodoIz;
	}

	public void setNodoIz(Nodo nodoIz) {
		this.nodoIz = nodoIz;
	}

	public Nodo getNodoDe() {
		return nodoDe;
	}

	public void setNodoDe(Nodo nodoDe) {
		this.nodoDe = nodoDe;
	}
	  
/*
 * ----Meted PARA AGREGAR NODO----
 */
	
	public void agregarNodo(Integer valor) {
		
		// comparo el valor del nodo con el actual
		if (valor < this.valor) {
	    	// si el nodo izquierdo es diferente de null llamo el metodo agregarNodo para compara su valor
	        if (nodoIz != null) {
	            nodoIz.agregarNodo(valor);
	        } else {
	            nodoIz = new Nodo(valor);
	        }
	    } else {
	    	// si el nodo derecho es diferente de null llamo el metodo agregarNodo para compara su valor
	        if (nodoDe != null) {
	            nodoDe.agregarNodo(valor);
	        } else {
	            nodoDe = new Nodo(valor);
	        }
	    }
	}
	
/*
 * In order: Imprime el valor del nodo izquierdo, después 
 * el del nodo contenedor y al final el del nodo derecho
 */

    public void pintaInOrder(){
        if(nodoIz!=null){
            nodoIz.pintaInOrder();
        }
        System.out.println(valor);
        if(nodoDe!=null){
            nodoDe.pintaInOrder();
        }
    }
/*
 * Pre order: Imprime el valor del nodo contenedor,
 * después el del nodo izquierdo y al final el del nodo derecho
 */
 
    public void pintaPreOrder(){
        System.out.println(valor);
        if(nodoIz!=null){
            nodoIz.pintaPreOrder();
        }
        if(nodoDe!=null){
            nodoDe.pintaPreOrder();
        }
    }

}
