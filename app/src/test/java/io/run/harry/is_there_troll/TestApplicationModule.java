package io.run.harry.is_there_troll;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.run.harry.is_there_troll.activity.MainActivity;
import io.run.harry.is_there_troll.activity.MainActivityTest;
import io.run.harry.is_there_troll.service.SummonerService;

import static org.mockito.Mockito.mock;

@Module(
        injects = {
                MainActivity.class,
                MainActivityTest.class,
        }
)
public class TestApplicationModule {
    @Provides
    @Singleton
    SummonerService providesSummonerService() {
        return mock(SummonerService.class);
    }
}
