package com.sanwei.sanwei.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by tangdi on 12/11/17.
 */

public abstract class BaseFragment extends Fragment {

    @Override
    public void onCreate(Bundle saveInstanceBundle){
        super.onCreate(saveInstanceBundle);
        initMvp();
    }

    abstract public void initMvp();

}
