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
package com.openpay.test.dao;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.openpay.test.entity.MisthZpxrisi;
import com.openpay.test.utils.FileUtils;
import com.openpay.test.utils.ByteArrayToBase64TypeAdapter;

public class MisthZpxrisiDaoTestIt {
  static final String inputFile = "MisthZpxrisi.json";
  static MisthZpxrisiDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private MisthZpxrisi[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultMisthZpxrisiDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, MisthZpxrisi[].class);
      json = null;
      Arrays.stream(records).skip(1).forEach(o -> dao.create(o));
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  @After
  public void after() {
    records = null;
  }

  @Test
  public void testSelect() {
    MisthZpxrisi testResult = dao.find(records[1].getKodxrisi());
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertEquals(
        "expect equals descxrisi ", this.records[1].getDescxrisi(), testResult.getDescxrisi());
    org.junit.Assert.assertEquals(
        "expect equals maskposo ", this.records[1].getMaskposo(), testResult.getMaskposo());
    org.junit.Assert.assertEquals(
        "expect equals maskposot ", this.records[1].getMaskposot(), testResult.getMaskposot());
    org.junit.Assert.assertEquals(
        "expect equals maskdate ", this.records[1].getMaskdate(), testResult.getMaskdate());
    org.junit.Assert.assertEquals(
        "expect equals eteria ", this.records[1].getEteria(), testResult.getEteria());
    org.junit.Assert.assertEquals(
        "expect equals eteriadesc ", this.records[1].getEteriadesc(), testResult.getEteriadesc());
    org.junit.Assert.assertEquals(
        "expect equals address ", this.records[1].getAddress(), testResult.getAddress());
    org.junit.Assert.assertEquals("expect equals tk ", this.records[1].getTk(), testResult.getTk());
    org.junit.Assert.assertEquals(
        "expect equals city ", this.records[1].getCity(), testResult.getCity());
    org.junit.Assert.assertEquals(
        "expect equals phone ", this.records[1].getPhone(), testResult.getPhone());
    org.junit.Assert.assertEquals(
        "expect equals fax ", this.records[1].getFax(), testResult.getFax());
    org.junit.Assert.assertEquals(
        "expect equals maskdatee ", this.records[1].getMaskdatee(), testResult.getMaskdatee());
    org.junit.Assert.assertEquals(
        "expect equals maskposoe ", this.records[1].getMaskposoe(), testResult.getMaskposoe());
    org.junit.Assert.assertEquals(
        "expect equals maskposote ", this.records[1].getMaskposote(), testResult.getMaskposote());
    org.junit.Assert.assertEquals(
        "expect equals afm ", this.records[1].getAfm(), testResult.getAfm());
    org.junit.Assert.assertEquals(
        "expect equals doy ", this.records[1].getDoy(), testResult.getDoy());
    org.junit.Assert.assertTrue(
        "expect equals round ", this.records[1].getRound() == testResult.getRound());
    org.junit.Assert.assertEquals(
        "expect equals prnLogo1 ", this.records[1].getPrnLogo1(), testResult.getPrnLogo1());
    org.junit.Assert.assertEquals(
        "expect equals prnLogo2 ", this.records[1].getPrnLogo2(), testResult.getPrnLogo2());
    org.junit.Assert.assertEquals(
        "expect equals prnLogo3 ", this.records[1].getPrnLogo3(), testResult.getPrnLogo3());
    org.junit.Assert.assertEquals(
        "expect equals prnLogo4 ", this.records[1].getPrnLogo4(), testResult.getPrnLogo4());
    org.junit.Assert.assertEquals(
        "expect equals prnLogo5 ", this.records[1].getPrnLogo5(), testResult.getPrnLogo5());
    org.junit.Assert.assertEquals(
        "expect equals prnSign1Prosf ",
        this.records[1].getPrnSign1Prosf(),
        testResult.getPrnSign1Prosf());
    org.junit.Assert.assertEquals(
        "expect equals prnSign1Name ",
        this.records[1].getPrnSign1Name(),
        testResult.getPrnSign1Name());
    org.junit.Assert.assertEquals(
        "expect equals prnSign2Prosf ",
        this.records[1].getPrnSign2Prosf(),
        testResult.getPrnSign2Prosf());
    org.junit.Assert.assertEquals(
        "expect equals prnSign2Name ",
        this.records[1].getPrnSign2Name(),
        testResult.getPrnSign2Name());
    org.junit.Assert.assertEquals(
        "expect equals prnSign3Prosf ",
        this.records[1].getPrnSign3Prosf(),
        testResult.getPrnSign3Prosf());
    org.junit.Assert.assertEquals(
        "expect equals prnSign3Name ",
        this.records[1].getPrnSign3Name(),
        testResult.getPrnSign3Name());
    org.junit.Assert.assertEquals(
        "expect equals prnNotes1 ", this.records[1].getPrnNotes1(), testResult.getPrnNotes1());
    org.junit.Assert.assertEquals(
        "expect equals prnNotes2 ", this.records[1].getPrnNotes2(), testResult.getPrnNotes2());
    org.junit.Assert.assertEquals(
        "expect equals prnNotes3 ", this.records[1].getPrnNotes3(), testResult.getPrnNotes3());
  }
}
