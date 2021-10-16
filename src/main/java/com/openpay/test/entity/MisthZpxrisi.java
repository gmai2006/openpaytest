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
@Table(name = "misth_zpxrisi")
public class MisthZpxrisi implements Serializable {
  private static final long serialVersionUID = 163436646519049405L;

  /** Description: kodxrisi. */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name = "kodxrisi")
  private java.lang.String kodxrisi;

  /** Description: descxrisi. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "descxrisi", length = 50)
  private java.lang.String descxrisi;
  /** Description: startdate. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "startdate")
  private java.util.Date startdate;
  /** Description: enddate. */
  @javax.validation.constraints.NotNull
  @Basic
  @Column(name = "enddate")
  private java.util.Date enddate;
  /** Description: maskposo. */
  @Basic
  @Column(name = "maskposo", length = 50)
  private java.lang.String maskposo;
  /** Description: maskposot. */
  @Basic
  @Column(name = "maskposot", length = 50)
  private java.lang.String maskposot;
  /** Description: maskdate. */
  @Basic
  @Column(name = "maskdate", length = 50)
  private java.lang.String maskdate;
  /** Description: eteria. */
  @Basic
  @Column(name = "eteria", length = 100)
  private java.lang.String eteria;
  /** Description: eteriadesc. */
  @Basic
  @Column(name = "eteriadesc", length = 100)
  private java.lang.String eteriadesc;
  /** Description: address. */
  @Basic
  @Column(name = "address", length = 100)
  private java.lang.String address;
  /** Description: tk. */
  @Basic
  @Column(name = "tk", length = 15)
  private java.lang.String tk;
  /** Description: city. */
  @Basic
  @Column(name = "city", length = 50)
  private java.lang.String city;
  /** Description: phone. */
  @Basic
  @Column(name = "phone", length = 100)
  private java.lang.String phone;
  /** Description: fax. */
  @Basic
  @Column(name = "fax", length = 100)
  private java.lang.String fax;
  /** Description: maskdate_e. */
  @Basic
  @Column(name = "maskdate_e", length = 50)
  private java.lang.String maskdatee;
  /** Description: maskposo_e. */
  @Basic
  @Column(name = "maskposo_e", length = 50)
  private java.lang.String maskposoe;
  /** Description: maskposot_e. */
  @Basic
  @Column(name = "maskposot_e", length = 50)
  private java.lang.String maskposote;
  /** Description: afm. */
  @Basic
  @Column(name = "afm", length = 20)
  private java.lang.String afm;
  /** Description: doy. */
  @Basic
  @Column(name = "doy", length = 100)
  private java.lang.String doy;
  /** Description: round. */
  @Basic
  @Column(name = "round")
  private java.lang.Integer round;
  /** Description: prn_logo1. */
  @Basic
  @Column(name = "prn_logo1", length = 100)
  private java.lang.String prnLogo1;
  /** Description: prn_logo2. */
  @Basic
  @Column(name = "prn_logo2", length = 100)
  private java.lang.String prnLogo2;
  /** Description: prn_logo3. */
  @Basic
  @Column(name = "prn_logo3", length = 100)
  private java.lang.String prnLogo3;
  /** Description: prn_logo4. */
  @Basic
  @Column(name = "prn_logo4", length = 100)
  private java.lang.String prnLogo4;
  /** Description: prn_logo5. */
  @Basic
  @Column(name = "prn_logo5", length = 100)
  private java.lang.String prnLogo5;
  /** Description: prn_sign1_prosf. */
  @Basic
  @Column(name = "prn_sign1_prosf", length = 100)
  private java.lang.String prnSign1Prosf;
  /** Description: prn_sign1_name. */
  @Basic
  @Column(name = "prn_sign1_name", length = 100)
  private java.lang.String prnSign1Name;
  /** Description: prn_sign2_prosf. */
  @Basic
  @Column(name = "prn_sign2_prosf", length = 100)
  private java.lang.String prnSign2Prosf;
  /** Description: prn_sign2_name. */
  @Basic
  @Column(name = "prn_sign2_name", length = 100)
  private java.lang.String prnSign2Name;
  /** Description: prn_sign3_prosf. */
  @Basic
  @Column(name = "prn_sign3_prosf", length = 100)
  private java.lang.String prnSign3Prosf;
  /** Description: prn_sign3_name. */
  @Basic
  @Column(name = "prn_sign3_name", length = 100)
  private java.lang.String prnSign3Name;
  /** Description: prn_notes1. */
  @Basic
  @Column(name = "prn_notes1", length = 0)
  private java.lang.String prnNotes1;
  /** Description: prn_notes2. */
  @Basic
  @Column(name = "prn_notes2", length = 0)
  private java.lang.String prnNotes2;
  /** Description: prn_notes3. */
  @Basic
  @Column(name = "prn_notes3", length = 0)
  private java.lang.String prnNotes3;

  public MisthZpxrisi() {}

  public java.lang.String getKodxrisi() {
    return this.kodxrisi;
  }

  public void setKodxrisi(java.lang.String kodxrisi) {
    this.kodxrisi = kodxrisi;
  }

  public java.lang.String getDescxrisi() {
    return this.descxrisi;
  }

  public java.util.Date getStartdate() {
    return this.startdate;
  }

  public java.util.Date getEnddate() {
    return this.enddate;
  }

  public java.lang.String getMaskposo() {
    return this.maskposo;
  }

  public java.lang.String getMaskposot() {
    return this.maskposot;
  }

  public java.lang.String getMaskdate() {
    return this.maskdate;
  }

  public java.lang.String getEteria() {
    return this.eteria;
  }

  public java.lang.String getEteriadesc() {
    return this.eteriadesc;
  }

  public java.lang.String getAddress() {
    return this.address;
  }

  public java.lang.String getTk() {
    return this.tk;
  }

  public java.lang.String getCity() {
    return this.city;
  }

  public java.lang.String getPhone() {
    return this.phone;
  }

  public java.lang.String getFax() {
    return this.fax;
  }

  public java.lang.String getMaskdatee() {
    return this.maskdatee;
  }

  public java.lang.String getMaskposoe() {
    return this.maskposoe;
  }

  public java.lang.String getMaskposote() {
    return this.maskposote;
  }

  public java.lang.String getAfm() {
    return this.afm;
  }

  public java.lang.String getDoy() {
    return this.doy;
  }

  public java.lang.Integer getRound() {
    return this.round;
  }

  public java.lang.String getPrnLogo1() {
    return this.prnLogo1;
  }

  public java.lang.String getPrnLogo2() {
    return this.prnLogo2;
  }

  public java.lang.String getPrnLogo3() {
    return this.prnLogo3;
  }

  public java.lang.String getPrnLogo4() {
    return this.prnLogo4;
  }

  public java.lang.String getPrnLogo5() {
    return this.prnLogo5;
  }

  public java.lang.String getPrnSign1Prosf() {
    return this.prnSign1Prosf;
  }

  public java.lang.String getPrnSign1Name() {
    return this.prnSign1Name;
  }

  public java.lang.String getPrnSign2Prosf() {
    return this.prnSign2Prosf;
  }

  public java.lang.String getPrnSign2Name() {
    return this.prnSign2Name;
  }

  public java.lang.String getPrnSign3Prosf() {
    return this.prnSign3Prosf;
  }

  public java.lang.String getPrnSign3Name() {
    return this.prnSign3Name;
  }

  public java.lang.String getPrnNotes1() {
    return this.prnNotes1;
  }

  public java.lang.String getPrnNotes2() {
    return this.prnNotes2;
  }

  public java.lang.String getPrnNotes3() {
    return this.prnNotes3;
  }

  public void setDescxrisi(java.lang.String descxrisi) {
    this.descxrisi = descxrisi;
  }

  public void setStartdate(java.util.Date startdate) {
    this.startdate = startdate;
  }

  public void setEnddate(java.util.Date enddate) {
    this.enddate = enddate;
  }

  public void setMaskposo(java.lang.String maskposo) {
    this.maskposo = maskposo;
  }

  public void setMaskposot(java.lang.String maskposot) {
    this.maskposot = maskposot;
  }

  public void setMaskdate(java.lang.String maskdate) {
    this.maskdate = maskdate;
  }

  public void setEteria(java.lang.String eteria) {
    this.eteria = eteria;
  }

  public void setEteriadesc(java.lang.String eteriadesc) {
    this.eteriadesc = eteriadesc;
  }

  public void setAddress(java.lang.String address) {
    this.address = address;
  }

  public void setTk(java.lang.String tk) {
    this.tk = tk;
  }

  public void setCity(java.lang.String city) {
    this.city = city;
  }

  public void setPhone(java.lang.String phone) {
    this.phone = phone;
  }

  public void setFax(java.lang.String fax) {
    this.fax = fax;
  }

  public void setMaskdatee(java.lang.String maskdatee) {
    this.maskdatee = maskdatee;
  }

  public void setMaskposoe(java.lang.String maskposoe) {
    this.maskposoe = maskposoe;
  }

  public void setMaskposote(java.lang.String maskposote) {
    this.maskposote = maskposote;
  }

  public void setAfm(java.lang.String afm) {
    this.afm = afm;
  }

  public void setDoy(java.lang.String doy) {
    this.doy = doy;
  }

  public void setRound(java.lang.Integer round) {
    this.round = round;
  }

  public void setPrnLogo1(java.lang.String prnLogo1) {
    this.prnLogo1 = prnLogo1;
  }

  public void setPrnLogo2(java.lang.String prnLogo2) {
    this.prnLogo2 = prnLogo2;
  }

  public void setPrnLogo3(java.lang.String prnLogo3) {
    this.prnLogo3 = prnLogo3;
  }

  public void setPrnLogo4(java.lang.String prnLogo4) {
    this.prnLogo4 = prnLogo4;
  }

  public void setPrnLogo5(java.lang.String prnLogo5) {
    this.prnLogo5 = prnLogo5;
  }

  public void setPrnSign1Prosf(java.lang.String prnSign1Prosf) {
    this.prnSign1Prosf = prnSign1Prosf;
  }

  public void setPrnSign1Name(java.lang.String prnSign1Name) {
    this.prnSign1Name = prnSign1Name;
  }

  public void setPrnSign2Prosf(java.lang.String prnSign2Prosf) {
    this.prnSign2Prosf = prnSign2Prosf;
  }

  public void setPrnSign2Name(java.lang.String prnSign2Name) {
    this.prnSign2Name = prnSign2Name;
  }

  public void setPrnSign3Prosf(java.lang.String prnSign3Prosf) {
    this.prnSign3Prosf = prnSign3Prosf;
  }

  public void setPrnSign3Name(java.lang.String prnSign3Name) {
    this.prnSign3Name = prnSign3Name;
  }

  public void setPrnNotes1(java.lang.String prnNotes1) {
    this.prnNotes1 = prnNotes1;
  }

  public void setPrnNotes2(java.lang.String prnNotes2) {
    this.prnNotes2 = prnNotes2;
  }

  public void setPrnNotes3(java.lang.String prnNotes3) {
    this.prnNotes3 = prnNotes3;
  }
}
