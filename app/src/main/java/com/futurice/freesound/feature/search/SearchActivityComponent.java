package com.futurice.freesound.feature.search;

import com.futurice.freesound.app.FreesoundApplicationComponent;
import com.futurice.freesound.feature.common.Navigator;
import com.futurice.freesound.inject.activity.BaseActivityComponent;
import com.futurice.freesound.inject.activity.PerActivity;
import com.squareup.picasso.Picasso;

import dagger.Component;

@PerActivity
@Component(dependencies = FreesoundApplicationComponent.class,
        modules = SearchActivityModule.class)
public interface SearchActivityComponent extends BaseActivityComponent {

    SearchViewModel getSearchViewModel();

    Picasso getPicasso();

    Navigator getNavigator();

    void inject(final SearchActivity activity);
}


