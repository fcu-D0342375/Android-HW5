package lincyu.chapter8_album2;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.ColorRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class AlbumArrayAdapter extends ArrayAdapter<AlbumItem> {

	Context context;
	
	public AlbumArrayAdapter(Context context,
			ArrayList<AlbumItem> items) {
		super(context, 0, items);
		this.context = context;
	}

	@Override
	public View getView(int position, View convertView,
			ViewGroup parent) {

		LayoutInflater inflater = LayoutInflater.from(context);
		
		LinearLayout itemlayout = null;
		if(convertView == null) {
			itemlayout = (LinearLayout)inflater.inflate
					(R.layout.listitem, null);
		} else {
			itemlayout = (LinearLayout) convertView;
		}
		AlbumItem item = getItem(position);


		TextView tv_name = (TextView)itemlayout.
				findViewById(R.id.itemtv);
		tv_name.setText(item.name1);

		TextView tv_score = (TextView)itemlayout.
				findViewById(R.id.itemScore);
		tv_score.setText(item.point1);

		ImageView iv = (ImageView)itemlayout.
				findViewById(R.id.itemiv);
		iv.setImageResource(item.imgid1);


        TextView tv_name2 = (TextView)itemlayout.
                findViewById(R.id.itemtv2);
        tv_name2.setText(item.name2);

        TextView tv_score2 = (TextView)itemlayout.
                findViewById(R.id.itemScore2);
        tv_score2.setText(item.point2);

        ImageView iv2 = (ImageView)itemlayout.
                findViewById(R.id.itemiv2);
        iv2.setImageResource(item.imgid2);

		tv_score.setTextColor(Color.BLACK);
		tv_score2.setTextColor(Color.BLACK);

		if(parseInt(item.point1) > parseInt(item.point2)){
			tv_score.setTextColor(Color.RED);
		}
		else if(parseInt(item.point1) < parseInt(item.point2)){
			tv_score2.setTextColor(Color.RED);
		}
        return itemlayout;
	}
}
