/*
 * Copyright (c) 2011-2013 The original author or authors
 * ------------------------------------------------------
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 *     The Eclipse Public License is available at
 *     http://www.eclipse.org/legal/epl-v10.html
 *
 *     The Apache License v2.0 is available at
 *     http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package org.vertx.java.core.impl;

import org.vertx.java.core.*;

/**
 * @author pidster
 *
 */
public class VertxFactoryImpl extends VertxFactory {

  @Override
  public Vertx createVertx() {
    return new VertxImpl();
  }

  @Override
  public Vertx createVertx(VertxOptions options) {
    return new VertxImpl(options);
  }

  @Override
  public void createVertx(VertxOptions options, final Handler<AsyncResult<Vertx>> resultHandler) {
    new VertxImpl(options, resultHandler);
  }

}
