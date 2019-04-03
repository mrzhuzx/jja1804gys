package com.ssm.teamgys.appcomm;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * desc:
 * author : tzhu
 * time :2019/3/25 0025
 * version: 1.2.3
 */
public class MYUUID {
    /**
     *  分布式系统
     * @return
     */
    public  static  String getUUID(){

        UUID   uuid=UUID.randomUUID();


        return uuid.toString();
    }
    public synchronized static  String  getYYYYMMDDhhmmss(){

        Random  r=new Random();
        Integer number=r.nextInt(8999)+1000;

        SimpleDateFormat  sdf=new SimpleDateFormat("yyyyMMdd-hhmmss-ssss");
        String date= sdf.format(new Date());

        return date+number;
    }


    public static void main(String[] args) {


        System.out.println(getUUID());
        System.out.println(getUUID());
        System.out.println(getUUID());
        System.out.println(getUUID());
        System.out.println(getUUID());


        System.out.println(getYYYYMMDDhhmmss());
        System.out.println(getYYYYMMDDhhmmss());
        System.out.println(getYYYYMMDDhhmmss());
        System.out.println(getYYYYMMDDhhmmss());
        System.out.println(getYYYYMMDDhhmmss());

    }

}
