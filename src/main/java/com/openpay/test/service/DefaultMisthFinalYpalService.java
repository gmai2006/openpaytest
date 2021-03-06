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
import com.openpay.test.dao.MisthFinalYpalDao;
import com.openpay.test.entity.MisthFinalYpal;
import com.openpay.test.entity.MisthFinalYpalId;

@Stateless
@Named("DefaultMisthFinalYpalService")
public class DefaultMisthFinalYpalService implements MisthFinalYpalService {
  private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final MisthFinalYpalDao dao;

  @Inject
  @Named("DefaultMisthFinalYpalDao")
  public DefaultMisthFinalYpalService(final MisthFinalYpalDao dao) {
    requireNonNull(dao);
    this.dao = dao;
  }

  /** {@inheritDoc} */
  @Override
  public MisthFinalYpal find(MisthFinalYpalId id) {
    final MisthFinalYpal result = dao.find(id);
    logger.info("find(MisthFinalYpal) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  public List<MisthFinalYpal> select(int maxResult) {
    final List<MisthFinalYpal> result = dao.select(maxResult);
    logger.info("select(MisthFinalYpal) - exited - return value={} result ");

    return result;
  }

  /** {@inheritDoc} */
  public List<MisthFinalYpal> selectAll() {
    final List<MisthFinalYpal> results = dao.selectAll();
    logger.info("selectAll(MisthFinalYpal) - exited - return value={} result ");
    return results;
  }

  /** {@inheritDoc} */
  @Override
  public MisthFinalYpal create(MisthFinalYpal bean) {
    requireNonNull(bean);
    logger.info("create(MisthFinalYpal={}) - entered bean ");

    final MisthFinalYpal result = dao.create(bean);

    logger.info("create(MisthFinalYpal) - exited - return value={} result ");
    return result;
  }

  /** {@inheritDoc} */
  @Override
  public MisthFinalYpal update(MisthFinalYpal bean) {
    requireNonNull(bean);
    logger.info("update(MisthFinalYpal={}) - entered bean ");

    final MisthFinalYpal result = dao.update(bean);

    logger.info("update(MisthFinalYpal) - exited - return value={} result ");
    return result;
  }
}
