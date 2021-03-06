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

/**
 * An AccessLocalException is thrown to indicate that the caller does not
 * have permission to call the method. This exception is thrown to local clients.
 */
public class AccessLocalException extends EJBException {

  /**
   * Constructs an AccessLocalException with no detail message.
   */
  public AccessLocalException() {
    super();
  }

  /**
   * Constructs an AccessLocalException with the specified detail message.
   *
   * @param message - The detailed message
   */
  public AccessLocalException(java.lang.String message) {
    super(message);
  }

  /**
   * Constructs an AccessLocalException with the specified detail message and a nested exception.
   *
   * @param message - The detailed message
   * @param ex - The nested exception
   */
  public AccessLocalException(java.lang.String message,
                              java.lang.Exception ex) {
    super(message,ex);
  }
}
