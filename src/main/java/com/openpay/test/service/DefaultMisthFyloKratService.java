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
import com.openpay.test.dao.MisthFyloKratDao;
import com.openpay.test.entity.MisthFyloKrat;
import com.openpay.test.entity.MisthFyloKratId;

@Stateless
@Named("DefaultMisthFyloKratService")
public class DefaultMisthFyloKratService implements MisthFyloKratService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthFyloKratDao dao;

  @Inject
  @Named("DefaultMisthFyloKratDao")
  public DefaultMisthFyloKratService(final MisthFyloKratDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthFyloKrat find(MisthFyloKratId id) {
    final MisthFyloKrat result = dao.find(id);
    logger.info("find(MisthFyloKrat) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthFyloKrat> select(int maxResult) {
    final List<MisthFyloKrat> result = dao.select(maxResult);
    logger.info("select(MisthFyloKrat) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<MisthFyloKrat> selectAll() {
    final List<MisthFyloKrat> results = dao.selectAll();
    logger.info("selectAll(MisthFyloKrat) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthFyloKrat create(MisthFyloKrat bean) {
    requireNonNull(bean);
    logger.info("create(MisthFyloKrat={}) - entered bean ");

    final MisthFyloKrat result = dao.create(bean);

    logger.info("create(MisthFyloKrat) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthFyloKrat update(MisthFyloKrat bean) {
    requireNonNull(bean);
    logger.info("update(MisthFyloKrat={}) - entered bean ");

    final MisthFyloKrat result = dao.update(bean);

    logger.info("update(MisthFyloKrat) - exited - return value={} result ");
    return result;
  }
}
