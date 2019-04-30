package me.yqiang.movie.service.impl;

import me.yqiang.movie.domain.Rate;
import me.yqiang.movie.repository.RateMapper;
import me.yqiang.movie.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RateServiceImpl implements RateService {

    @Autowired
    private RateMapper rateMapper;


    @Override
    public Rate save(Rate rate) {
        if (rateMapper.insert(rate) > 0){
            return rate;
        }
        return null;
    }

    @Override
    public List<Rate> findByUserId(Long userId) {
        return rateMapper.findByUserId(userId);
    }

    @Override
    public List<?> findAllGroupByMovieId() {
        return rateMapper.findRateCount();
    }
}
