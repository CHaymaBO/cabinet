package com.soft.cabinet.service;

import com.soft.cabinet.model.Rdv;

import java.util.List;

public interface RdvService {
    public void saveorupdate(Rdv rdv);
    public Rdv getById(long idrdv);
    public void delete(long idrdv);
    public List<Rdv> consulte();
}
