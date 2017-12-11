package com.sanwei.sanwei.mvp;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by tangdi on 9/21/17.
 */

@Scope
@Documented
@Retention(RUNTIME)
public @interface ActivityScop {
}
