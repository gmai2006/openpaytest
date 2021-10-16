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

import com.openpay.test.entity.MisthZpxrisi;

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

public class MisthZpxrisiServiceTest {
  private static DefaultMisthZpxrisiService serviceMock;
  private static MisthZpxrisi[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultMisthZpxrisiService.class);
    String inputFile = "MisthZpxrisi.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, MisthZpxrisi[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    // test data
    when(serviceMock.find(records[0].getKodxrisi())).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    MisthZpxrisi testResult = serviceMock.find(records[0].getKodxrisi());

    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals descxrisi ", records[0].getDescxrisi(), testResult.getDescxrisi());
    org.junit.Assert.assertEquals(
        "expect equals maskposo ", records[0].getMaskposo(), testResult.getMaskposo());
    org.junit.Assert.assertEquals(
        "expect equals maskposot ", records[0].getMaskposot(), testResult.getMaskposot());
    org.junit.Assert.assertEquals(
        "expect equals maskdate ", records[0].getMaskdate(), testResult.getMaskdate());
    org.junit.Assert.assertEquals(
        "expect equals eteria ", records[0].getEteria(), testResult.getEteria());
    org.junit.Assert.assertEquals(
        "expect equals eteriadesc ", records[0].getEteriadesc(), testResult.getEteriadesc());
    org.junit.Assert.assertEquals(
        "expect equals address ", records[0].getAddress(), testResult.getAddress());
    org.junit.Assert.assertEquals("expect equals tk ", records[0].getTk(), testResult.getTk());
    org.junit.Assert.assertEquals(
        "expect equals city ", records[0].getCity(), testResult.getCity());
    org.junit.Assert.assertEquals(
        "expect equals phone ", records[0].getPhone(), testResult.getPhone());
    org.junit.Assert.assertEquals("expect equals fax ", records[0].getFax(), testResult.getFax());
    org.junit.Assert.assertEquals(
        "expect equals maskdatee ", records[0].getMaskdatee(), testResult.getMaskdatee());
    org.junit.Assert.assertEquals(
        "expect equals maskposoe ", records[0].getMaskposoe(), testResult.getMaskposoe());
    org.junit.Assert.assertEquals(
        "expect equals maskposote ", records[0].getMaskposote(), testResult.getMaskposote());
    org.junit.Assert.assertEquals("expect equals afm ", records[0].getAfm(), testResult.getAfm());
    org.junit.Assert.assertEquals("expect equals doy ", records[0].getDoy(), testResult.getDoy());
    org.junit.Assert.assertTrue(
        "expect equals round ", records[0].getRound() == testResult.getRound());
    org.junit.Assert.assertEquals(
        "expect equals prnLogo1 ", records[0].getPrnLogo1(), testResult.getPrnLogo1());
    org.junit.Assert.assertEquals(
        "expect equals prnLogo2 ", records[0].getPrnLogo2(), testResult.getPrnLogo2());
    org.junit.Assert.assertEquals(
        "expect equals prnLogo3 ", records[0].getPrnLogo3(), testResult.getPrnLogo3());
    org.junit.Assert.assertEquals(
        "expect equals prnLogo4 ", records[0].getPrnLogo4(), testResult.getPrnLogo4());
    org.junit.Assert.assertEquals(
        "expect equals prnLogo5 ", records[0].getPrnLogo5(), testResult.getPrnLogo5());
    org.junit.Assert.assertEquals(
        "expect equals prnSign1Prosf ",
        records[0].getPrnSign1Prosf(),
        testResult.getPrnSign1Prosf());
    org.junit.Assert.assertEquals(
        "expect equals prnSign1Name ", records[0].getPrnSign1Name(), testResult.getPrnSign1Name());
    org.junit.Assert.assertEquals(
        "expect equals prnSign2Prosf ",
        records[0].getPrnSign2Prosf(),
        testResult.getPrnSign2Prosf());
    org.junit.Assert.assertEquals(
        "expect equals prnSign2Name ", records[0].getPrnSign2Name(), testResult.getPrnSign2Name());
    org.junit.Assert.assertEquals(
        "expect equals prnSign3Prosf ",
        records[0].getPrnSign3Prosf(),
        testResult.getPrnSign3Prosf());
    org.junit.Assert.assertEquals(
        "expect equals prnSign3Name ", records[0].getPrnSign3Name(), testResult.getPrnSign3Name());
    org.junit.Assert.assertEquals(
        "expect equals prnNotes1 ", records[0].getPrnNotes1(), testResult.getPrnNotes1());
    org.junit.Assert.assertEquals(
        "expect equals prnNotes2 ", records[0].getPrnNotes2(), testResult.getPrnNotes2());
    org.junit.Assert.assertEquals(
        "expect equals prnNotes3 ", records[0].getPrnNotes3(), testResult.getPrnNotes3());
  }
}
