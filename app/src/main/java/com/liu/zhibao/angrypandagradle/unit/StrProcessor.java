package com.liu.zhibao.angrypandagradle.unit;

import android.text.TextUtils;

/**
 * Created by zhibao.Liu on 2018/9/13.
 *
 * @version :
 * @date : 2018/9/13
 * @des :
 * @see{@link}
 */

public class StrProcessor {

    public String replaceStr(String info){

        if(info!=null && info.length()>0){
            // 将字母a换成z
            info=info.replace("a","z");
        }

        return info;
    }

}
