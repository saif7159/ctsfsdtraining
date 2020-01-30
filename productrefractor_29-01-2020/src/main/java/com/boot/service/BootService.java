package com.boot.service;

import java.util.List;

import com.boot.model.Boots;

public interface BootService {
public Boots createBoot(Boots boot);
public List<Boots> fetchBoots(int id);
public Boots findById(int id);
public Boots updateBoot(Boots b);
public List<Boots> allBoots();
public void deleteBoot(int id);
}
