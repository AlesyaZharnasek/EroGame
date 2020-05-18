package com.zharnasek.alesya.game;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ActivitiesRepositoryTxt extends BaseRepository implements IActivitiesRepository {

    @Override
    public List<Activities> loadActivities() {

        ArrayList<Activities> activDescr = new ArrayList<Activities>();
        FileInputStream fstream = null;
        BufferedReader br = null;
        try {
            fstream = new FileInputStream(getPath(ConstApp.ACTIVITIES_FILE));
            br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            String[] tokens;
            while ((strLine = br.readLine()) != null) {
                tokens = strLine.split("\\|");
                activDescr.add(new Activities(tokens[0], tokens[1], tokens[2]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fstream.close();

            } catch (Exception ignore) {
                System.out.println(ignore);
            }
        }
        return activDescr;
    }
}

