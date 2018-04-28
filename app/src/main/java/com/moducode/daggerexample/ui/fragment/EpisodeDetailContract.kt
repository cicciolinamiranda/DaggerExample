package com.moducode.daggerexample.ui.fragment

import com.hannesdorfmann.mosby3.mvp.MvpPresenter
import com.hannesdorfmann.mosby3.mvp.MvpView
import com.moducode.daggerexample.data.EpisodeData

interface EpisodeDetailContract {

    interface View: MvpView{

    }

    interface Actions: MvpPresenter<View>{
        fun saveEpisode(episodeData: EpisodeData)
        fun deleteEpisode(episodeData: EpisodeData)
    }

}