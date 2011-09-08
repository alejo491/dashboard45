
public class controlador {
	
		
	public String crearProyecto(Proyecto p){
		
			Conexion c= new Conexion();
			Boolean b= c.crearProyecto(p);
		    if (b == true) return "Bien";
		    else return "Mal";
			
	};
	
	/*void agrgar_tarea(Tarea t){
		while(t.exista()=="TRUE"){
			notify_t();
			actualizar_t();
		}
		
	};*/
}
