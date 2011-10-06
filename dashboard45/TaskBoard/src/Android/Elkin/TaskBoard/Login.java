package Android.Elkin.TaskBoard;

import sqlite.databaseHelper;
import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends Activity{

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }
        
    public void onAceptClick(View botton){
    	
    	
    	EditText user = (EditText) findViewById(R.id.txtUser);
    	EditText password = (EditText) findViewById(R.id.txtPassword);
    	String x = user.toString();
    	String y = password.toString();
    	
    	databaseHelper databaseHelper = new databaseHelper (this);
		SQLiteDatabase db = databaseHelper.getWritableDatabase();
		
		db.execSQL("select " + x + "from proyecto");
		
		Intent main = new Intent ();
		main.setClass(this, TaskBoardActivity.class);
    	this.startActivity(main);
    }
}
