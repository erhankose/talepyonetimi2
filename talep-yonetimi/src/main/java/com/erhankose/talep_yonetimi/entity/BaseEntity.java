/*Erhan Köse 3*/
package com.erhankose.talep_yonetimi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Data
@MappedSuperclass

public abstract class BaseEntity implements Serializable {
    @Column(name="createAt")
   // @Temporal(TemporalType.TIMESTAMP.TIME)
    private Date createAt;
    @Column(name="createBy",length = 100)
    private String createdBy;
    @Column(name="updateAt")
   // @Temporal(TemporalType.TIMESTAMP.TIME)
    private Date updateAt;
    @Column(name="updateBy",length = 100)
    private String updateBy;
    @Column(name="status")
    private Boolean status;
}
