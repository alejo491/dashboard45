package Android.Elkin.TaskBoard;

import sqlite.databaseHelper;
import Android.Elkin.TaskBoard.R;
import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends Activity{

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        
        TextView txtResult = (TextView) findViewById(R.id.txtResult);
        Bundle bundle = getIntent().getExtras();
        
        if (bundle.getString("Cancel") != null)
        	txtResult.setText("OPERACION CANCELADA");
        else
        {
        	String idProject = bundle.getString("idProject");
        	String nameProject = bundle.getString("nameProject");
        	String beginDateProject = bundle.getString("beginDateProject");
        	String endDateProject = bundle.getString("endDateProject");
        	String descriptionProject = bundle.getString("descriptionProject");
        	
        	addProject(idProject, nameProject, beginDateProject, endDateProject, descriptionProject);
        	
        	txtResult.setText(getString(R.string.resultOk) + " " + idProject + "-" + nameProject + "-" +
        			beginDateProject + "-" + endDateProject + "-" + descriptionProject);
        }
    }

	private void addProject(String idProject, String nameProject,
			String beginDateProject, String endDateProject,
			String descriptionProject) {
		// TODO Auto-generated method stub
		
		databaseHelper databaseHelper = new databaseHelper (this);
		SQLiteDatabase db = databaseHelper.getWritableDatabase();
		
		ContentValues cv = new ContentValues();
		cv.put(databaseHelper.id, idProject);
		cv.put(databaseHelper.nombre, nameProject);
		cv.put(databaseHelper.fecha_inicio, beginDateProject);
		cv.put(databaseHelper.fecha_fin, endDateProject);
		cv.put(databaseHelper.descripcion, descriptionProject);
		
		db.insert("proyecto", databaseHelper.id, cv);
		db.close();
		
	}
}
