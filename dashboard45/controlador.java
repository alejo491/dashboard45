
public class Controlador {
		
	public String crearProyecto(Proyecto p){
		
			Conectorproyecto c= new conectorBD();
			Boolean b= c.crearProyecto(p);
		    if (b == true) return "Bien";
		    else return "Mal"
			
	};
	
	/*void agrgar_tarea(Tarea t){
		while(t.exista()=="TRUE"){
			notify_t();
			actualizar_t();
		}
		
	};*/
}
