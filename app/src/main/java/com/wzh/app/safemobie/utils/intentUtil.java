package com.wzh.app.safemobie.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;


/**
  *
  * @Package:        com.wzh.app.safemobie.utils
  * @ClassName:      intentUtil
  * @Description:    页面跳转工具类
  * @Author:         zhenghong
  * @CreateDate:     2018/10/8 0008
  * @UpdateRemark:   更新内容
  *
  */
public class intentUtil {

    private static Intent intent;
    private static final Object lock = new Object();

    /*
    * 基本功能*/
    public static <T> void doAction(Activity activity, Class<T> class1) {
        synchronized(lock){
            try {
                intent = new Intent(activity,class1);
                activity.startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
