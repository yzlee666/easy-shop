package com.yzlee.member.domain;

import cn.yzlee.data.SuperObject;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Cache;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.UUID;

/**
 * @Author:lyz
 * @Date: 2018/3/22 15:38
 * @Desc:
 **/
@Entity
@Table(name="tb_member",indexes= {@Index(columnList="mobile",unique=true)})
@Cacheable
@DynamicInsert
@DynamicUpdate
public class Member extends SuperObject
{
    @Id
    @GeneratedValue
    @Type(type="uuid-char")
    @Column(length=36)
    private UUID id;

    @Column(name="code",nullable=false,length=32,columnDefinition=("varchar(32) comment '会员卡号'"))
    private String code;

    @Column(name="name",nullable=false,length=16,columnDefinition=("varchar(16) comment '会员姓名'"))
    private String name;

    @Column(name="birthday")
    private LocalDate birthday;

    @Enumerated
    @Column(name="sex")
    private Sex sex=Sex.UNKNOW;

    @NaturalId(mutable=true)
    @Column(name="mobile",length=16,nullable=false)
    private String mobile;

    @Column(name="password",length=40,columnDefinition=("char(40) comment '会员卡密码'"))
    private String password;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="parent_id",columnDefinition=("varchar(36) comment '上级会员'"))
    private Member parent;
}
