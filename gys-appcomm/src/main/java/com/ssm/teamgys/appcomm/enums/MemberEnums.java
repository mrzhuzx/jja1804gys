package com.ssm.teamgys.appcomm.enums;

import lombok.Getter;

/**
 * Desc:
 * author : teacherzhu
 * 2019/3/23 0023
 */
@Getter
public enum MemberEnums implements CodeEnum {
    mGradeT1(1,"一年开发经验"),
    mGradeT2(2,"二年开发经验"),
    mGradeT3(3,"三年开发经验"),
    mGradeT4(4,"四年开发经验"),
    mGradeT5(5,"五年开发经验"),
    mGradeT6(6,"六年开发经验"),
    mGradeT7(7,"七年开发经验"),
    mGradeT8(8,"八年开发经验"),
    mGradeT9(9,"九年开发经验"),
    mStatus0(0,"离职"),
    mStatus1(1,"在职"),
    ;
    
    private Integer code;
    private String desc;

    MemberEnums(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }


}
