package com.tencent.qcloud;

/**
 * Created by rongerwu on 2019-10-08.
 * Copyright (c) 2019 Tencent Cloud. All Rights Reserved.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * CalledByNative is used by the JNI generator to create the necessary JNI
 * bindings and expose this method to native code.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface CalledByNative {
    /*
     *  If present, tells which inner class the method belongs to.
     */
    public String value() default "";
}
