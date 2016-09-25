package com.scart.dao;
import java.util.List;

import com.scart.model.CartInfo;
import com.scart.model.OrderDetailInfo;
import com.scart.model.OrderInfo;
import com.scart.model.PaginationResult;
 
public interface OrderDAO {
 
    public void saveOrder(CartInfo cartInfo);
 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
 
}