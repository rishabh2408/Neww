package com.example.rishabh.neww;

import java.util.ArrayList;
import java.util.List;

import static android.support.v7.widget.AppCompatDrawableManager.get;

/**
 * Created by Rishabh on 12-08-2017.
 */

public class NatureModel {



    private String device;
    private int switchid;

    public int getSwitchId()
    {
        return switchid;
    }
    public String getDevice()
    {
        return device;
    }
    public void setSwitchId(int switchid)
    {
        this.switchid=switchid;
    }
    public void setDevice(String device)
    {
        this.device=device;
    }
    public static List<NatureModel> getobjectList()
    {
        List<NatureModel> dataList=new ArrayList<>();
        int[] switchh=getSwitches();
        String[] devices=getDevices();
        for (int i=0;i<switchh.length; i++)
        {//loop till switchh.length
            NatureModel nature=new NatureModel();
            // nature.setSwitchId(switchh[i]);
            // nature.setDevice(devices[i]);
             nature.setSwitchId(switchh[i]);
             nature.setDevice(devices[i]);
            dataList.add(nature);

        }
        return dataList;
    }
    private static String[] getDevices()
    {
        String[] devices={"one","two","three","four","five","six","seven","eight","nine","ten"};
        return devices;
    }
    private static int[] getSwitches()
    {
int[] switches={1,2,3,4,5,6,7,8,9,10};
        return switches;
    }
}
