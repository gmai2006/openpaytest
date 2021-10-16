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

import static java.util.Objects.requireNonNull;
import java.util.List;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.ejb.Stateless;
import javax.inject.Named;
import com.openpay.test.dao.AfxkeygenDao;
import com.openpay.test.entity.Afxkeygen;

@Stateless
@Named("DefaultAfxkeygenService")
public class DefaultAfxkeygenService implements AfxkeygenService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final AfxkeygenDao dao;

  @Inject
  @Named("DefaultAfxkeygenDao")
  public DefaultAfxkeygenService(final AfxkeygenDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public Afxkeygen find(java.lang.String id) {

    final Afxkeygen result = dao.find(id);
    logger.info("find(Afxkeygen) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<Afxkeygen> select(int maxResult) {
    final List<Afxkeygen> result = dao.select(maxResult);
    logger.info("select(Afxkeygen) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<Afxkeygen> selectAll() {
    final List<Afxkeygen> results = dao.selectAll();
    logger.info("selectAll(Afxkeygen) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public Afxkeygen create(Afxkeygen bean) {
    requireNonNull(bean);
    logger.info("create(Afxkeygen={}) - entered bean ");

    final Afxkeygen result = dao.create(bean);

    logger.info("create(Afxkeygen) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public Afxkeygen update(Afxkeygen bean) {
    requireNonNull(bean);
    logger.info("update(Afxkeygen={}) - entered bean ");

    final Afxkeygen result = dao.update(bean);

    logger.info("update(Afxkeygen) - exited - return value={} result ");
    return result;
  }
}
