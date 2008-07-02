/*
 * Copyright 2005 Joe Walker
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.directwebremoting.extend;

import java.util.List;


/**
 * A {@link TypeInfo} that simply hands back what we gave it for children in the
 * constructor
 * @author Joe Walker [joe at getahead dot ltd dot uk]
 */
public class DefaultTypeInfo implements TypeInfo
{
    /**
     * @param primaryType The top level type
     */
    private DefaultTypeInfo(Class<?> primaryType, List<TypeInfo> children)
    {
        this.primaryType = primaryType;
        this.children = children;
    }

    /* (non-Javadoc)
     * @see org.directwebremoting.extend.TypeInfo#getChildTypeInfo(int)
     */
    public TypeInfo getChildTypeInfo(int i)
    {
        return children.get(i);
    }

    /* (non-Javadoc)
     * @see org.directwebremoting.extend.TypeInfo#getPrimaryType()
     */
    public Class<?> getPrimaryType()
    {
        return primaryType;
    }

    /**
     * The type about which we don't understand the any generic type info
     */
    private Class<?> primaryType;

    /**
     * If we've been given any specific
     */
    private List<TypeInfo> children = null;
}