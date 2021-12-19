
package com.sang.service.impl;

import com.sang.pojo.TinTuyenDung;
import com.sang.repository.TinTuyenDungRepository;
import com.sang.service.TinTuyenDungService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TinTuyenDungServiceImpl implements TinTuyenDungService{
    @Autowired
    private TinTuyenDungRepository tinTuyenDungRepository;
    @Override
    public List<TinTuyenDung> getTinTuyenDungs() {
       return this.tinTuyenDungRepository.getTinTuyenDungs();
    }
    
}
