package com.project.echoeco.funding;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.project.echoeco.common.BaseProject;
import com.project.echoeco.projectImg.ProjectImg;

import groovy.transform.ToString;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@Getter
@ToString
public class Funding extends BaseProject {

  private BigDecimal goalAmount;

  private BigDecimal currentAmount;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "projectImg_id")
  private List<ProjectImg> fundingImg;

}
