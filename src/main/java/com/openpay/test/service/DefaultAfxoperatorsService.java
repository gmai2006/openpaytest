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
import com.openpay.test.dao.AfxoperatorsDao;
import com.openpay.test.entity.Afxoperators;

@Stateless
@Named("DefaultAfxoperatorsService")
public class DefaultAfxoperatorsService implements AfxoperatorsService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final AfxoperatorsDao dao;

  @Inject
  @Named("DefaultAfxoperatorsDao")
  public DefaultAfxoperatorsService(final AfxoperatorsDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public Afxoperators find(java.lang.String id) {

    final Afxoperators result = dao.find(id);
    logger.info("find(Afxoperators) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<Afxoperators> select(int maxResult) {
    final List<Afxoperators> result = dao.select(maxResult);
    logger.info("select(Afxoperators) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<Afxoperators> selectAll() {
    final List<Afxoperators> results = dao.selectAll();
    logger.info("selectAll(Afxoperators) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public Afxoperators create(Afxoperators bean) {
    requireNonNull(bean);
    logger.info("create(Afxoperators={}) - entered bean ");

    final Afxoperators result = dao.create(bean);

    logger.info("create(Afxoperators) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public Afxoperators update(Afxoperators bean) {
    requireNonNull(bean);
    logger.info("update(Afxoperators={}) - entered bean ");

    final Afxoperators result = dao.update(bean);

    logger.info("update(Afxoperators) - exited - return value={} result ");
    return result;
  }
}
