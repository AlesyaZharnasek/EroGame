package com.zharnasek.alesya.game;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PeopleRepositoryTxt implements IPeopleRepository {


    @Override
    public List<Human> loadPeople()  {
        
        FileInputStream fstream = null;
        ArrayList<Human> people = new ArrayList<Human>();
        try {

            fstream = new FileInputStream("src/main/resources/people_en.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            String[] tokens;
            while ((strLine = br.readLine()) != null) {
                tokens = strLine.split("\\|");
                if(tokens[0].equals("f")) {
                    people.add(new Woman(tokens[1], Integer.valueOf(tokens[2]), Integer.valueOf(tokens[3]), tokens[4], tokens[5], Integer.valueOf(tokens[6])));
                } else {
                    people.add(new Man(tokens[1], Integer.valueOf(tokens[2]), Integer.valueOf(tokens[3]), tokens[4], tokens[5], Integer.valueOf(tokens[6])));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fstream.close();
            } catch (Exception ignore) {
            }
        }
        return people;
    }

}
