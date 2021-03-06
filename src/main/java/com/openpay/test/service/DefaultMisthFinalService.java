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
import com.openpay.test.dao.MisthFinalDao;
import com.openpay.test.entity.MisthFinal;
import com.openpay.test.entity.MisthFinalId;

@Stateless
@Named("DefaultMisthFinalService")
public class DefaultMisthFinalService implements MisthFinalService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthFinalDao dao;

  @Inject
  @Named("DefaultMisthFinalDao")
  public DefaultMisthFinalService(final MisthFinalDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthFinal find(MisthFinalId id) {
    final MisthFinal result = dao.find(id);
    logger.info("find(MisthFinal) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthFinal> select(int maxResult) {
    final List<MisthFinal> result = dao.select(maxResult);
    logger.info("select(MisthFinal) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<MisthFinal> selectAll() {
    final List<MisthFinal> results = dao.selectAll();
    logger.info("selectAll(MisthFinal) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthFinal create(MisthFinal bean) {
    requireNonNull(bean);
    logger.info("create(MisthFinal={}) - entered bean ");

    final MisthFinal result = dao.create(bean);

    logger.info("create(MisthFinal) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthFinal update(MisthFinal bean) {
    requireNonNull(bean);
    logger.info("update(MisthFinal={}) - entered bean ");

    final MisthFinal result = dao.update(bean);

    logger.info("update(MisthFinal) - exited - return value={} result ");
    return result;
  }
}
