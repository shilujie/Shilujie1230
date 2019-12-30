package com.bawei.shilujie1230.contract;
/*
 *@auther:史陆杰
 *@Date: 2019/12/30
 *@Time:10:58
 *@Description:${DESCRIPTION}
 **/


import com.bawei.shilujie1230.model.bean.HomeBean;

public interface IHomeContract  {
    interface IView{
        void getSuccess(HomeBean homeBean);
        void getFailer(Throwable throwable);
    }

    interface IPresenter{
        void getHomeData();
    }

    interface IModel{
        void getHomeData(HomeCallBack homeCallBack);

        interface HomeCallBack{
            void getSuccess(HomeBean homeBean);
            void getFailer(Throwable throwable);
        }
    }
}
