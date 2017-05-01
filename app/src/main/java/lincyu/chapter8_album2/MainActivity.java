package lincyu.chapter8_album2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends ActionBarActivity {

	ListView lv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ArrayList<AlbumItem> albumlist = new ArrayList<AlbumItem>();

		albumlist.add(new AlbumItem("巫師", "111", R.drawable.nba01, "賽爾提克", "123", R.drawable.nba02));
		albumlist.add(new AlbumItem("火箭", "113", R.drawable.nba11, "雷霆", "109", R.drawable.nba12));

		AlbumArrayAdapter adapter =
				new AlbumArrayAdapter(this, albumlist);

		lv = (ListView) findViewById(R.id.lv);
		lv.setAdapter(adapter);

	}
}

