/**
 * %% Copyright (C) 2021 DataScience 9 LLC %% Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License. #L%
 *
 * <p>This code is 100% AUTO generated. Please do not modify it DIRECTLY If you need new features or
 * function or changes please update the templates then submit the template through our web
 * interface.
 */
package com.openpay.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

@Entity
@IdClass(AfxtablefieldsId.class)
@Table(name = "afxtablefields")
public class Afxtablefields implements Serializable {
  private static final long serialVersionUID = 166786182209210324L;

  /** Description: fieldname. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "fieldname")
  private java.lang.String fieldname;
  /** Description: tablename. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "tablename")
  private java.lang.String tablename;

  /** Description: fielddesc. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "fielddesc", length = 70)
  private java.lang.String fielddesc;
  /** Description: sorting. */
  @Basic
  @Column(name = "sorting")
  private java.lang.Integer sorting;
  /** Description: fieldtype. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "fieldtype", length = 15)
  private java.lang.String fieldtype;
  /** Description: orderno. */
  @Basic
  @Column(name = "orderno")
  private java.lang.Long orderno;

  public Afxtablefields() {}

  public java.lang.String getFieldname() {
    return this.fieldname;
  }

  public java.lang.String getTablename() {
    return this.tablename;
  }

  public void setFieldname(java.lang.String fieldname) {
    this.fieldname = fieldname;
  }

  public void setTablename(java.lang.String tablename) {
    this.tablename = tablename;
  }

  public java.lang.String getFielddesc() {
    return this.fielddesc;
  }

  public java.lang.Integer getSorting() {
    return this.sorting;
  }

  public java.lang.String getFieldtype() {
    return this.fieldtype;
  }

  public java.lang.Long getOrderno() {
    return this.orderno;
  }

  public void setFielddesc(java.lang.String fielddesc) {
    this.fielddesc = fielddesc;
  }

  public void setSorting(java.lang.Integer sorting) {
    this.sorting = sorting;
  }

  public void setFieldtype(java.lang.String fieldtype) {
    this.fieldtype = fieldtype;
  }

  public void setOrderno(java.lang.Long orderno) {
    this.orderno = orderno;
  }
}
