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
import com.openpay.test.entity.MisthReport;
import com.openpay.test.entity.MisthReportId;
import com.openpay.test.utils.FileUtils;
import com.openpay.test.utils.ByteArrayToBase64TypeAdapter;

public class MisthReportDaoTestIt {
  static final String inputFile = "MisthReport.json";
  static MisthReportDao dao;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();
  private MisthReport[] records;

  /** Run when the class is loaded. */
  @BeforeClass
  public static void beforeClass() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
    JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
    dao = new DefaultMisthReportDao(jpa);
  }

  /** Run before the test. */
  @Before
  public void before() {
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, MisthReport[].class);
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
    final MisthReportId id =
        new MisthReportId(this.records[1].getKodxrisi(), this.records[1].getKodreport());
    MisthReport testResult = dao.find(id);
    assertNotNull("expect result", testResult);
    org.junit.Assert.assertEquals(
        "expect equals descreport ", this.records[1].getDescreport(), testResult.getDescreport());
    org.junit.Assert.assertEquals(
        "expect equals subtitle ", this.records[1].getSubtitle(), testResult.getSubtitle());
    org.junit.Assert.assertTrue(
        "expect equals printMarginTop ",
        this.records[1].getPrintMarginTop() == testResult.getPrintMarginTop());
    org.junit.Assert.assertTrue(
        "expect equals printMarginBottom ",
        this.records[1].getPrintMarginBottom() == testResult.getPrintMarginBottom());
    org.junit.Assert.assertTrue(
        "expect equals printMarginLeft ",
        this.records[1].getPrintMarginLeft() == testResult.getPrintMarginLeft());
    org.junit.Assert.assertTrue(
        "expect equals printMarginRight ",
        this.records[1].getPrintMarginRight() == testResult.getPrintMarginRight());
    org.junit.Assert.assertTrue(
        "expect equals printOrientation ",
        this.records[1].getPrintOrientation() == testResult.getPrintOrientation());
    org.junit.Assert.assertTrue(
        "expect equals printPaperSize ",
        this.records[1].getPrintPaperSize() == testResult.getPrintPaperSize());
    org.junit.Assert.assertTrue(
        "expect equals printScale ", this.records[1].getPrintScale() == testResult.getPrintScale());
    org.junit.Assert.assertEquals(
        "expect equals prnNotes1 ", this.records[1].getPrnNotes1(), testResult.getPrnNotes1());
    org.junit.Assert.assertEquals(
        "expect equals prnNotes2 ", this.records[1].getPrnNotes2(), testResult.getPrnNotes2());
  }
}
