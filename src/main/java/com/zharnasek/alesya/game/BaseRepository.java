package com.zharnasek.alesya.game;

import static com.zharnasek.alesya.game.ConstApp.*;

public class BaseRepository {

    public String getPath(String name) {
        return PATH + name + "_" + StateApp.getLanguage() + EXTENSION;
    }
}
