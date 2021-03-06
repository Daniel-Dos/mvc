/*
 * Copyright (c) 2015 Oracle and/or its affiliates. All rights reserved.
 * Copyright (c) 2016-2018 JSR 371 expert group and contributors
 * Copyright (c) 2020 Contributors to the Eclipse Foundation
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */
package jakarta.mvc;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * <p>Declares a view for a controller that returns void, or for a controller
 * that may return {@code null} and wants to declare a default value.
 * If declared at the type level, it applies to all controller methods in the type and
 * can be overridden by another instance of this annotation at the method level.
 *
 * <p>Example:
 * <pre><code>
 *     &#64;Controller
 *     &#64;View("hello.jsp")
 *     public void sayHello() {
 *         ...
 *     }
 * </code></pre>
 *
 * @author Santiago Pericas-Geertsen
 * @see Controller
 * @since 1.0
 */
@Target({METHOD, TYPE})
@Retention(RUNTIME)
@Documented
@Inherited
public @interface View {

    /**
     * The name of the view
     *
     * @return view name
     */
    String value();

}

