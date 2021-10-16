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
import com.openpay.test.entity.Afxfilterd;
import com.openpay.test.dao.JpaDao;

import com.openpay.test.utils.DelimiterParser;

// @Stateless
@Named("AfxfilterdHandler")
public class AfxfilterdHandler extends DelimiterFileHandler<Afxfilterd> {

  @Inject
  @Named("DefaultJpaDao")
  public AfxfilterdHandler(final JpaDao dao) {
    super(dao);
  }

  @Override
  protected Afxfilterd parseLine(List<String> headers, List<String> tokens) {
    Afxfilterd record = new Afxfilterd();
    for (int i = 0; i < tokens.size(); i++) {
      switch (headers.get(i)) {
        case "kodfilterd":
          record.setKodfilterd(java.lang.Long.valueOf((tokens.get(i))));
          break;
        case "kodfilter":
          record.setKodfilter(java.lang.Long.valueOf((tokens.get(i))));
          break;
        case "pedio":
          record.setPedio(tokens.get(i));
          break;

        case "telestis":
          record.setTelestis(tokens.get(i));
          break;

        case "timi":
          record.setTimi(tokens.get(i));
          break;

        case "joint":
          record.setJoint(tokens.get(i));
          break;

        default:
          logger.severe("Unknown col " + headers.get(i));
      }
    }
    return record;
  }
}
