
package com.hari.secureinformationmanagementsystem.controller;

import com.hari.secureinformationmanagementsystem.model.SecureInfo;
import com.hari.secureinformationmanagementsystem.service.SecureInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/secure-info")
public class SecureInfoController {

    @Autowired
    private SecureInfoService service;

    @GetMapping
    public List<SecureInfo> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<SecureInfo> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public SecureInfo add(@RequestBody SecureInfo info) {
        return service.add(info);
    }

    @PutMapping("/{id}")
    public SecureInfo update(@PathVariable Long id, @RequestBody SecureInfo info) {
        return service.update(id, info);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
