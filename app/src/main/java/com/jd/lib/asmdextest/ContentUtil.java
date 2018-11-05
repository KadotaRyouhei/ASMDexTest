package com.jd.lib.asmdextest;

/**
 * Created by shanliang on 2018/11/1.
 */

public class ContentUtil {

    private static final String content = "ASM Test Content";

    private static ContentUtil sInstance = null;

    private boolean isSet = false;

    /**
     * 获取方法
     * @return 返回
     */
    public static ContentUtil getInstance() {

        if(sInstance == null) {
            synchronized (ContentUtil.class) {
                if(sInstance == null) {
                    sInstance = new ContentUtil();
                }
            }
        }
        return sInstance;
    }


    public String getContent() {
        return content;
    }

    public void contentSet() {
        isSet = true;
    }


}
