/*
 *  JBoss, Home of Professional Open Source
 *  Copyright 2010 Red Hat, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package javax.ejb;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static javax.ejb.LockType.WRITE;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Declares a concurrency lock for a singleton method.
 * 
 * @author <a href="mailto:cdewolf@redhat.com">Carlo de Wolf</a>
 * @version $Revision$
 * @since 3.1
 */
@Target({METHOD,TYPE})
@Retention(RUNTIME)
public @interface Lock {
   LockType value() default WRITE;
}
