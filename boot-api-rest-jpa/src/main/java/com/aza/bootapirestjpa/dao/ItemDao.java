package com.aza.bootapirestjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aza.bootapirestjpa.entity.Item;


@Repository
public interface ItemDao extends JpaRepository<Item, Integer>{

}
