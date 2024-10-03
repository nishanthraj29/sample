package com.sam.sample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SampleService {
    @Autowired
    private final SampleRepository SampleRepository;

    public SampleService(SampleRepository SampleRepository) {
        this.SampleRepository = SampleRepository;
    }

    public Sample saveSample(Sample Sample) {
        try {
            return SampleRepository.save(Sample);
        } catch (Exception e) {
            // Handle exception or log the error
            throw new RuntimeException("Failed to save Sample: " + e.getMessage());
        }
    }// Get all Samples

    public List<Sample> fetchAllSamples() {
        try {
            return SampleRepository.findAll();
        } catch (Exception e) {
            // Handle exception or log the error
            throw new RuntimeException("Failed to fetch all Samples: " + e.getMessage());
        }
    }


    public Optional<Sample> fetchbyid(Long id) {
        try {
            System.out.println("wfwfwfwfwfwf");

            return SampleRepository.findById(id);
        } catch (Exception e) {
            System.out.println("efegfegergegee");
            // Handle exception or log the error
            throw new RuntimeException("Failedb to fetch by id Samples: " + e.getMessage());


        }
    }
}