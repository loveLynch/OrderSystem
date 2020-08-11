/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.dao;

import application.model.Detail;
import java.util.List;

/**
 *
 * @author lynch
 */
public interface DetailDAO {
    public boolean insertDetail(Detail detail,String oid) throws Exception;
   //find order detail by orderId
    public  List<Detail> findAllByOrderId(String oid) throws Exception;
    
}
