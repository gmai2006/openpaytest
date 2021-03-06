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
import com.openpay.test.dao.MisthZpperiodDao;
import com.openpay.test.entity.MisthZpperiod;
import com.openpay.test.entity.MisthZpperiodId;

@Stateless
@Named("DefaultMisthZpperiodService")
public class DefaultMisthZpperiodService implements MisthZpperiodService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthZpperiodDao dao;

  @Inject
  @Named("DefaultMisthZpperiodDao")
  public DefaultMisthZpperiodService(final MisthZpperiodDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpperiod find(MisthZpperiodId id) {
    final MisthZpperiod result = dao.find(id);
    logger.info("find(MisthZpperiod) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthZpperiod> select(int maxResult) {
    final List<MisthZpperiod> result = dao.select(maxResult);
    logger.info("select(MisthZpperiod) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<MisthZpperiod> selectAll() {
    final List<MisthZpperiod> results = dao.selectAll();
    logger.info("selectAll(MisthZpperiod) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpperiod create(MisthZpperiod bean) {
    requireNonNull(bean);
    logger.info("create(MisthZpperiod={}) - entered bean ");

    final MisthZpperiod result = dao.create(bean);

    logger.info("create(MisthZpperiod) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthZpperiod update(MisthZpperiod bean) {
    requireNonNull(bean);
    logger.info("update(MisthZpperiod={}) - entered bean ");

    final MisthZpperiod result = dao.update(bean);

    logger.info("update(MisthZpperiod) - exited - return value={} result ");
    return result;
  }
}
