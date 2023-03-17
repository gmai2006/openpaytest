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
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Basic;

@Entity
@Table(name = "afxoperators")
public class Afxoperators implements Serializable {
  private static final long serialVersionUID = 167901651873485072L;

  /** Description: operatorname. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "operatorname")
  private java.lang.String operatorname;

  /** Description: operator. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "operator", length = 50)
  private java.lang.String operator;
  /** Description: orderno. */
  @Basic
  @Column(name = "orderno")
  private java.lang.Integer orderno;

  public Afxoperators() {}

  public java.lang.String getOperatorname() {
    return this.operatorname;
  }

  public void setOperatorname(java.lang.String operatorname) {
    this.operatorname = operatorname;
  }

  public java.lang.String getOperator() {
    return this.operator;
  }

  public java.lang.Integer getOrderno() {
    return this.orderno;
  }

  public void setOperator(java.lang.String operator) {
    this.operator = operator;
  }

  public void setOrderno(java.lang.Integer orderno) {
    this.orderno = orderno;
  }
}
