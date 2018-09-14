package com.liu.zhibao.angrypandagradle.androidunit;

import android.text.TextUtils;

/**
 * Created by zhibao.Liu on 2018/9/13.
 *
 * @version :
 * @date : 2018/9/13
 * @des :
 * @see{@link}
 */

public class JsonParser {

    public String replaceSync(String info){

        // TextUtils类只在Android中有,所以前面java是不能够使用,会报错
        if(!TextUtils.isEmpty(info)){
            info=info.replace("a","k");
        }
        return info;

    }

}
