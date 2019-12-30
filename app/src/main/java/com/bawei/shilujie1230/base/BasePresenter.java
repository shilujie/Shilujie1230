package com.bawei.shilujie1230.base;
/*
 *@auther:史陆杰
 *@Date: 2019/12/30
 *@Time:10:48
 *@Description:${DESCRIPTION}
 **/


public abstract class BasePresenter<V> {
    public V view;

    public BasePresenter() {
        initModel();
    }

    public void attach(V view) {
        this.view = view;
    }

    public void detach() {
        view = null;
    }


    protected abstract void initModel();
}
