package com.baeNaksi.controller;

import com.baeNaksi.model.MemberVo;
import com.baeNaksi.service.FishingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fishing")
public class FishingController {

    @Autowired
    private FishingService fishingService;

    @GetMapping
    public List<MemberVo> getFishing() throws Exception {
        return null;
    }

    @GetMapping("/{fishingId}")
    public MemberVo getFishing(@PathVariable("fishingId") String fishingId) throws Exception {
        return null;
    }

    @PostMapping(value = "/")
    public void createFishing() {

    }

    @PatchMapping("/{fishingId}")
    public void updateFishing(@PathVariable("fishingId") String fishingId) {

    }

    @DeleteMapping("/{fishingId}")
    public void deleteFishing(@PathVariable("fishingId") String fishingId) {

    }
}