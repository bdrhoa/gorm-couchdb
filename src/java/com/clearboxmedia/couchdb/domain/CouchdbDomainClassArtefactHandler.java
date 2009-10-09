/*
 * Copyright $today.year the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.clearboxmedia.couchdb.domain;

import com.clearboxmedia.couchdb.CouchEntity;
import org.codehaus.groovy.grails.commons.ArtefactHandlerAdapter;
import org.codehaus.groovy.grails.commons.GrailsDomainClass;

/**
 * 
 * @author Warner Onstine, Cory Hacking
 */
public class CouchdbDomainClassArtefactHandler extends ArtefactHandlerAdapter {

    public static final String TYPE = "Domain";

    public CouchdbDomainClassArtefactHandler() {
        super(TYPE, GrailsDomainClass.class, CouchdbGrailsDomainClass.class, null);
    }

    public boolean isArtefactClass(Class clazz) {
        return isCouchDBDomainClass(clazz);
    }

    public static boolean isCouchDBDomainClass(Class clazz){
        return clazz != null && clazz.getAnnotation(CouchEntity.class) != null;
    }
}
