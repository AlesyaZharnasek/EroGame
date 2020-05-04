package com.zharnasek.alesya.game;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PoseRepositoryTxt implements IPoseRepository {

    @Override
    public List<Poses> loadPoses() {

        ArrayList<Poses> posesDescr = new ArrayList<Poses>();
        FileInputStream fstream = null;
        BufferedReader br = null;
        try {
            fstream = new FileInputStream("src/main/resources/poses_en.txt");
            br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            String[] tokens;
            while ((strLine = br.readLine()) != null) {
                tokens = strLine.split("\\|");
                posesDescr.add(new Poses(tokens[0], tokens[1], tokens[2]));
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
        return posesDescr;
    }

}
