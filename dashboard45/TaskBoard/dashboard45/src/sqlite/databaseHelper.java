package sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class databaseHelper extends SQLiteOpenHelper{
	
	private static final String database_name = "Scrum.db";
	public static final String id = "idProject";
	public static final String nombre = "nameProject";
	public static final String fecha_inicio = "beginDateProject";
	public static final String fecha_fin = "endDateProject";
	public static final String descripcion = "descriptionProject";
	
	public databaseHelper(Context context) {
		super(context,database_name, null, 1);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL("CREATE TABLE proyecto (idProject TEXT PRIMARY KEY  NOT NULL  UNIQUE , nameProject TEXT," +
				" beginDateProject TEXT, endDateProject TEXT, descriptionProject TEXT);");
		
	}
	
	public void onUpgrade (SQLiteDatabase db, int oldVersion, int newVersion){
		android.util.Log.w("Constans", "destruyendo, eliminar toda base de datos anterior");
		db.execSQL("DROP TABLE IF EXIST proyecto");
		onCreate(db);
	}
}
