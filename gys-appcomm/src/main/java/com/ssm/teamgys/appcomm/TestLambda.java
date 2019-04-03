package com.ssm.teamgys.appcomm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * desc:
 * author : tzhu
 * time :2019/3/27 0027
 * version: 1.2.3
 */
public class TestLambda {

    public static void main(String[] args) {


        List<String> proNames = Arrays.asList(new String[]{"Ni","Hao","Lambda"});

        String  newName=proNames.stream().map(str->{return str.toUpperCase();}).collect(Collectors.joining());

        









    }

}
