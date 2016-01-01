package io.run.harry.is_there_troll.activity;

import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import javax.inject.Inject;

import io.run.harry.is_there_troll.BuildConfig;
import io.run.harry.is_there_troll.R;
import io.run.harry.is_there_troll.service.SummonerService;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class MainActivityTest {
    @Inject
    SummonerService summonerService;

    private MainActivity subject;

    @Before
    public void setUp() throws Exception {
        subject = Robolectric.setupActivity(MainActivity.class);
    }

    @Test
    public void onSubmitSummonerNickName_callsSummonerServiceToGetSummonersInformation() throws Exception {
        TextView summonerName = (TextView) subject.findViewById(R.id.summoner_name);
        summonerName.setText("시루밤바");

        subject.findViewById(R.id.submit).performClick();
    }
}