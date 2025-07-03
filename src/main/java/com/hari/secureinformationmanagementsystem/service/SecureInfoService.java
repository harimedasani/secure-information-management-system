
package com.hari.secureinformationmanagementsystem.service;

import com.hari.secureinformationmanagementsystem.model.SecureInfo;
import com.hari.secureinformationmanagementsystem.repository.SecureInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SecureInfoService {

    @Autowired
    private SecureInfoRepository repository;

    public List<SecureInfo> getAll() {
        return repository.findAll();
    }

    public Optional<SecureInfo> getById(Long id) {
        return repository.findById(id);
    }

    public SecureInfo add(SecureInfo info) {
        return repository.save(info);
    }

    public SecureInfo update(Long id, SecureInfo updated) {
        return repository.findById(id)
                .map(info -> {
                    info.setTitle(updated.getTitle());
                    info.setDescription(updated.getDescription());
                    return repository.save(info);
                })
                .orElseGet(() -> {
                    updated.setId(id);
                    return repository.save(updated);
                });
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
