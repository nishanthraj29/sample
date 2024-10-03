package com.sam.sample;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1")
public class SampleController {

    private final com.sam.sample.SampleService SampleService;

    public SampleController(com.sam.sample.SampleService SampleService) {
        this.SampleService = SampleService;
    }
    // Create a new Sample
    @PostMapping("/Sample")
    public ResponseEntity<Sample> saveSample(@RequestBody Sample Sample) {
        Sample savedSample = SampleService.saveSample(Sample);
        return ResponseEntity.ok(savedSample);
    }
    // Get
    //
    @GetMapping("/Sample/getAll")
    public ResponseEntity<List<Sample>> getAllSamples() {
        List<Sample> Samples = SampleService.fetchAllSamples();
        return ResponseEntity.ok(Samples);
    }

    @GetMapping("/Sample/{id}")
    public ResponseEntity<Optional<Sample>> getsamplesbyid (@PathVariable("id") Long id){
        Optional<Sample> Samples = SampleService.fetchbyid(id);
        if (Samples.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(Samples);


    }













}

