package com.boot.dao;

import java.util.List;

import com.boot.model.Boots;

public interface BootsDao {
public Boots createBoots(Boots boot);
public List<Boots> fetchBoots(int id);
public Boots findById(int id);
public Boots updateBoot(Boots b);
public List<Boots> allBoots();
public void deleteBoot(int id);
}
