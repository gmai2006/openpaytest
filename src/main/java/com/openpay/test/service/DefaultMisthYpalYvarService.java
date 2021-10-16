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
import com.openpay.test.dao.MisthYpalYvarDao;
import com.openpay.test.entity.MisthYpalYvar;
import com.openpay.test.entity.MisthYpalYvarId;

@Stateless
@Named("DefaultMisthYpalYvarService")
public class DefaultMisthYpalYvarService implements MisthYpalYvarService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthYpalYvarDao dao;

  @Inject
  @Named("DefaultMisthYpalYvarDao")
  public DefaultMisthYpalYvarService(final MisthYpalYvarDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthYpalYvar find(MisthYpalYvarId id) {
    final MisthYpalYvar result = dao.find(id);
    logger.info("find(MisthYpalYvar) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthYpalYvar> select(int maxResult) {
    final List<MisthYpalYvar> result = dao.select(maxResult);
    logger.info("select(MisthYpalYvar) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<MisthYpalYvar> selectAll() {
    final List<MisthYpalYvar> results = dao.selectAll();
    logger.info("selectAll(MisthYpalYvar) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthYpalYvar create(MisthYpalYvar bean) {
    requireNonNull(bean);
    logger.info("create(MisthYpalYvar={}) - entered bean ");

    final MisthYpalYvar result = dao.create(bean);

    logger.info("create(MisthYpalYvar) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthYpalYvar update(MisthYpalYvar bean) {
    requireNonNull(bean);
    logger.info("update(MisthYpalYvar={}) - entered bean ");

    final MisthYpalYvar result = dao.update(bean);

    logger.info("update(MisthYpalYvar) - exited - return value={} result ");
    return result;
  }
}
