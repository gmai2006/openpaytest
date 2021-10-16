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

import com.openpay.test.entity.MisthZpkrat;
import com.openpay.test.entity.MisthZpkratId;

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

public class MisthZpkratServiceTest {
  private static DefaultMisthZpkratService serviceMock;
  private static MisthZpkrat[] records;
  static Gson gson =
      new GsonBuilder()
          .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
          .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
          .create();

  /** Run when the class is loaded. */
  @BeforeClass
  public static void setUp() {
    serviceMock = mock(DefaultMisthZpkratService.class);
    String inputFile = "MisthZpkrat.json";
    try {
      String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
      records = gson.fromJson(json, MisthZpkrat[].class);
    } catch (IOException ex) {
      ex.printStackTrace();
    }

    final MisthZpkratId id = new MisthZpkratId(records[0].getKodkrat(), records[0].getKodxrisi());
    when(serviceMock.find(id)).thenReturn(records[0]);
  }

  @Test
  public void testFind_success() {
    final MisthZpkratId id = new MisthZpkratId(records[0].getKodkrat(), records[0].getKodxrisi());
    MisthZpkrat testResult = serviceMock.find(id);
    org.junit.Assert.assertNotNull(testResult);
    org.junit.Assert.assertEquals(
        "expect equals desckrat ", records[0].getDesckrat(), testResult.getDesckrat());
    org.junit.Assert.assertTrue(
        "expect equals isforos ", records[0].getIsforos() == testResult.getIsforos());
    org.junit.Assert.assertTrue(
        "expect equals isasf ", records[0].getIsasf() == testResult.getIsasf());
    org.junit.Assert.assertTrue(
        "expect equals isautoforos ", records[0].getIsautoforos() == testResult.getIsautoforos());
  }
}
