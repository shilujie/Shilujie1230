package com.bawei.shilujie1230.model;
/*
 *@auther:史陆杰
 *@Date: 2019/12/30
 *@Time:11:01
 *@Description:${DESCRIPTION}
 **/


import com.bawei.shilujie1230.contract.IHomeContract;
import com.bawei.shilujie1230.model.bean.HomeBean;
import com.bawei.shilujie1230.util.NetUtil;
import com.google.gson.Gson;

public class HomeModel implements IHomeContract.IModel {
    @Override
    public void getHomeData(HomeCallBack homeCallBack) {
        NetUtil.getInstance().getJsonGet("", new NetUtil.MyCallBack() {
            @Override
            public void getJsonGet(String json) {
                HomeBean homeBean = new Gson().fromJson(json, HomeBean.class);
                homeCallBack.getSuccess(homeBean);
            }

            @Override
            public void getError(Throwable throwable) {
                homeCallBack.getFailer(throwable);
            }
        });
    }
}
