package Colecciones;

import java.util.*;

public class Lista {

// defino un atritibuto de tipo list que va a ser un string y se llama aux
//grupo es el padre clase abastracta no puede ser instanciada no puede crear objetos , pero los hijos de grupo son grupos y pueden extender de la clase padre abstracta, hay que importar los hijos 
// List es el att PADRE de tipo strinf y se llama list 
	
	List <String> nombre_quieras;
	
	// contrusctor crear un objjeto de list instanciarlo 
	public Lista() {
		nombre_quieras = new ArrayList<String>();
	}
	
}
