package com.itxj.mapper;


import com.itxj.pojo.Item;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface ItemMapper extends Mapper<Item> {
    int addItem(Item name);

    int updateItem(Item item);

    int deleteById(Long id);

    List<Item> getAllItem();
}
