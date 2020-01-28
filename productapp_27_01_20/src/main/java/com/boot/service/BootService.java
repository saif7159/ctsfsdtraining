package com.boot.service;

import java.util.List;

import com.boot.model.Boots;

public interface BootService {
public Boots createBoot(Boots boot);
public List<Boots> fetchBoots(int id);
public List<Boots> allBoots();
}
