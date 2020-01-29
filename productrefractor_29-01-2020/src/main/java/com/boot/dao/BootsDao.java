package com.boot.dao;

import java.util.List;

import com.boot.model.Boots;

public interface BootsDao {
public Boots createBoots(Boots boot);
public List<Boots> fetchBoots(int id);
public List<Boots> allBoots();
}
