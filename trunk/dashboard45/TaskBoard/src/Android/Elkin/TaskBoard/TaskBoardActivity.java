package Android.Elkin.TaskBoard;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TaskBoardActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void onAddClick(View botton) {
		EditText idProject = (EditText) findViewById(R.id.txtIdProject);
		EditText nameProject = (EditText) findViewById(R.id.txtNameProject);
		EditText beginDateProject = (EditText) findViewById(R.id.txtBeginDateProject);
		EditText endDateProject = (EditText) findViewById(R.id.txtEndDateProject);
		EditText descriptionProject = (EditText) findViewById(R.id.txtDescriptionProject);

		Intent intent = new Intent();
		intent.setClass(this, Result.class);

		intent.putExtra("idProject", idProject.getText().toString());
		intent.putExtra("nameProject", nameProject.getText().toString());
		intent.putExtra("beginDateProject", beginDateProject.getText()
				.toString());
		intent.putExtra("endDateProject", endDateProject.getText().toString());
		intent.putExtra("descriptionProject", descriptionProject.getText()
				.toString());
		startActivity(intent);

	}

	public void onCancelClick(View botton) {
		Intent intent = new Intent();
		intent.setComponent(new ComponentName(this, Result.class));
		intent.putExtra("Cancel", "Cancel");
		startActivity(intent);
	}
}