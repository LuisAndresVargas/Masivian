package co.java.luis.arbol;

public class ArbolApp {
	
	public static void main(String[] args) {
		//instancia de Nodo con el nodo raiz
		Nodo nodo = new Nodo(70);
		//se queman los valores de los nodos
		nodo.agregarNodo(84);
		nodo.agregarNodo(85);
		nodo.agregarNodo(78);
		nodo.agregarNodo(80);
		nodo.agregarNodo(76);
		/*
		 * se imprimen los arboles haciendo llamado a los metodos recursivos de nodo.
		 */
		System.out.println("pintar In Orden");
		nodo.pintaInOrder();

		System.out.println("pintar Pre Orden");
		nodo.pintaPreOrder();
		
		
		
	}
}
	
	


