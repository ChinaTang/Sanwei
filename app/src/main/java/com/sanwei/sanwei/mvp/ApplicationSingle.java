package com.sanwei.sanwei.mvp;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;
import javax.inject.Singleton;

/**
 * Created by tangdi on 9/21/17.
 */
@Scope
@Singleton
@Retention(RetentionPolicy.RUNTIME)
public @interface ApplicationSingle {

}
