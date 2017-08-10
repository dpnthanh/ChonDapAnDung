package com.fpt.ftravel.lab6;

import android.widget.Button;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by thanh on 10/08/2017.
 */

public class Data {

    byte trueKQ;

    Random ran = new Random();
    int a, b;
    public String Question(){
        this.a = ran.nextInt(100) +1;
        this.b = ran.nextInt(100) +1;
        return a + " + " + b ;
    }

    public int kq(){
        return a + b;
    }

    public void setButton(Button a, Button b, Button c, Button d, Button e, Button f){

        ArrayList<Integer> listKQ = new ArrayList<>();

        while (listKQ.size() < 6) {
            int addKQ = random();
            if (addKQ != kq()) {

                boolean ok = true;

                for(int i = 0; i < listKQ.size(); i++){
                    if(listKQ.get(i) == random()) {
                        ok=false;
                        break;
                    }
                }

                if (ok) {
                    listKQ.add(addKQ);
                }

            }
        }

        a.setText(listKQ.get(0)+"");
        b.setText(listKQ.get(1)+"");
        c.setText(listKQ.get(2)+"");
        d.setText(listKQ.get(3)+"");
        e.setText(listKQ.get(4)+"");
        f.setText(listKQ.get(5)+"");

        int randomButton = ran.nextInt(5);
        switch(randomButton){
            case 0:
                a.setText(kq()+"");
                trueKQ = 1;
                break;
            case 1:
                b.setText(kq()+"");
                trueKQ = 2;
                break;
            case 2:
                c.setText(kq()+"");
                trueKQ = 3;
                break;
            case 3:
                d.setText(kq()+"");
                trueKQ = 4;
                break;
            case 4:
                e.setText(kq()+"");
                trueKQ = 5;
                break;
            case 5:
                f.setText(kq()+"");
                trueKQ = 6;
                break;
        }
    }

    private int random(){
        return ran.nextInt(20) + kq() -10;
    }
}
