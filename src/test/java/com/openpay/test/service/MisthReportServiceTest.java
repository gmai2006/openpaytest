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
package com.openpay.test.service;

import com.openpay.test.entity.MisthReport;
import com.openpay.test.entity.MisthReportId;

import com.openpay.test.utils.FileUtils;
import com.google.gson.JsonArray;
import com.google.gson.GsonBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import com.google.gson.Gson;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.openpay.test.utils.ByteArrayToBase64TypeAdapter;

public class MisthReportServiceTest {
  private static DefaultMisthReportService serviceMock;
  private static MisthReport[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultMisthReportService.class);
    String inputFile = "MisthReport.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, MisthReport[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    final MisthReportId id = new MisthReportId(records[0].getKodxrisi(), records[0].getKodreport());
    when(serviceMock.find(id)).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    final MisthReportId id = new MisthReportId(records[0].getKodxrisi(), records[0].getKodreport());
    MisthReport testResult = serviceMock.find(id);
    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals descreport ", records[0].getDescreport(), testResult.getDescreport());
    org.junit.Assert.assertEquals(
        "expect equals subtitle ", records[0].getSubtitle(), testResult.getSubtitle());
    org.junit.Assert.assertTrue(
        "expect equals printMarginTop ",
        records[0].getPrintMarginTop() == testResult.getPrintMarginTop());
    org.junit.Assert.assertTrue(
        "expect equals printMarginBottom ",
        records[0].getPrintMarginBottom() == testResult.getPrintMarginBottom());
    org.junit.Assert.assertTrue(
        "expect equals printMarginLeft ",
        records[0].getPrintMarginLeft() == testResult.getPrintMarginLeft());
    org.junit.Assert.assertTrue(
        "expect equals printMarginRight ",
        records[0].getPrintMarginRight() == testResult.getPrintMarginRight());
    org.junit.Assert.assertTrue(
        "expect equals printOrientation ",
        records[0].getPrintOrientation() == testResult.getPrintOrientation());
    org.junit.Assert.assertTrue(
        "expect equals printPaperSize ",
        records[0].getPrintPaperSize() == testResult.getPrintPaperSize());
    org.junit.Assert.assertTrue(
        "expect equals printScale ", records[0].getPrintScale() == testResult.getPrintScale());
    org.junit.Assert.assertEquals(
        "expect equals prnNotes1 ", records[0].getPrnNotes1(), testResult.getPrnNotes1());
    org.junit.Assert.assertEquals(
        "expect equals prnNotes2 ", records[0].getPrnNotes2(), testResult.getPrnNotes2());
  }
}
