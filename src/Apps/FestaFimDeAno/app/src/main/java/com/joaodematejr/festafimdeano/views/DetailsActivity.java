package com.joaodematejr.festafimdeano.views;
import android.widget.CheckBox;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.joaodematejr.festafimdeano.R;

public class  DetailsActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        this.mViewHolder.checkParticipate = findViewById(R.id.check_participate);

    }

    private static class ViewHolder {
        CheckBox checkParticipate;
    }
}
