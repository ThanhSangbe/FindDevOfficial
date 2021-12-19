
package com.sang.service.impl;

import com.sang.pojo.Job;
import com.sang.repository.JobRepository;
import com.sang.service.JobService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService{
    @Autowired
    private JobRepository jobRepository;
    @Override
    public List<Job> getJobs() {
       return this.jobRepository.getJobs();
    }
    
}
