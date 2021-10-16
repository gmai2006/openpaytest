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
package com.openpay.test.handler;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import java.nio.charset.StandardCharsets;
import com.openpay.test.entity.MisthReport;
import com.openpay.test.dao.JpaDao;

import com.openpay.test.utils.DelimiterParser;

// @Stateless
@Named("MisthReportHandler")
public class MisthReportHandler extends DelimiterFileHandler<MisthReport> {

  @Inject
  @Named("DefaultJpaDao")
  public MisthReportHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected MisthReport parseLine(List<String> headers, List<String> tokens) {
    MisthReport record = new MisthReport();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "kodreport":
          record.setKodreport(tokens.get(i));
          break;

        case "kodxrisi":
          record.setKodxrisi(tokens.get(i));
          break;

        case "descreport":
          record.setDescreport(tokens.get(i));
          break;

        case "subtitle":
          record.setSubtitle(tokens.get(i));
          break;

        case "printMarginTop":
          record.setPrintMarginTop(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "printMarginBottom":
          record.setPrintMarginBottom(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "printMarginLeft":
          record.setPrintMarginLeft(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "printMarginRight":
          record.setPrintMarginRight(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "printOrientation":
          record.setPrintOrientation(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "printPaperSize":
          record.setPrintPaperSize(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "printScale":
          record.setPrintScale(java.lang.Integer.valueOf((tokens.get(i))));
          break;
        case "prnNotes1":
          record.setPrnNotes1(tokens.get(i));
          break;

        case "prnNotes2":
          record.setPrnNotes2(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
