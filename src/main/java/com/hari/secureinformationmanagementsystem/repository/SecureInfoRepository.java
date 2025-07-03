
package com.hari.secureinformationmanagementsystem.repository;

import com.hari.secureinformationmanagementsystem.model.SecureInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureInfoRepository extends JpaRepository<SecureInfo, Long> {
}
