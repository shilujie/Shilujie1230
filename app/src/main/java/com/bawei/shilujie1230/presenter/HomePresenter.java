package com.bawei.shilujie1230.presenter;
/*
 *@auther:史陆杰
 *@Date: 2019/12/30
 *@Time:11:03
 *@Description:${DESCRIPTION}
 **/


import com.bawei.shilujie1230.base.BasePresenter;
import com.bawei.shilujie1230.contract.IHomeContract;
import com.bawei.shilujie1230.model.HomeModel;
import com.bawei.shilujie1230.model.bean.HomeBean;

public class HomePresenter extends BasePresenter<IHomeContract.IView> implements IHomeContract.IPresenter {
    public HomeModel homeModel;
    @Override
    protected void initModel() {
        homeModel = new HomeModel();
    }

    @Override
    public void getHomeData() {
        homeModel.getHomeData(new IHomeContract.IModel.HomeCallBack() {
            @Override
            public void getSuccess(HomeBean homeBean) {
                view.getSuccess(homeBean);
            }

            @Override
            public void getFailer(Throwable throwable) {
                view.getFailer(throwable);
            }
        });
    }
}
