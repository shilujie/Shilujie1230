package com.bawei.shilujie1230.base;
/*
 *@auther:史陆杰
 *@Date: 2019/12/30
 *@Time:10:52
 *@Description:${DESCRIPTION}
 **/


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import butterknife.ButterKnife;

public abstract class BaseFragment<P extends BasePresenter> extends Fragment {
    public P mPresenter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(layoutid(), null);

        mPresenter = previderPresenter();
        if (mPresenter != null) {
            mPresenter.attach(this);
        }
        initView(inflate);
        return inflate;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (mPresenter != null) {
            mPresenter.detach();
        }
    }

    protected abstract void initView(View inflate);

    protected abstract P previderPresenter();

    protected abstract int layoutid();
}
