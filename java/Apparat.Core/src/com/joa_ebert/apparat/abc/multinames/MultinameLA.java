/*
 * This file is part of Apparat.
 * 
 * Apparat is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Apparat is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Apparat. If not, see <http://www.gnu.org/licenses/>.
 * 
 * Copyright (C) 2009 Joa Ebert
 * http://www.joa-ebert.com/
 * 
 */

package com.joa_ebert.apparat.abc.multinames;

import com.joa_ebert.apparat.abc.AbcContext;
import com.joa_ebert.apparat.abc.AbstractMultiname;
import com.joa_ebert.apparat.abc.IAbcVisitor;
import com.joa_ebert.apparat.abc.MultinameKind;

/**
 * 
 * @author Joa Ebert
 * 
 */
public final class MultinameLA extends MultinameL
{
	public MultinameLA()
	{
		super( MultinameKind.MultinameLA );
	}

	@Override
	public void accept( final AbcContext context, final IAbcVisitor visitor )
	{
		visitor.visit( context, this );

		if( null != namespaceSet )
		{
			namespaceSet.accept( context, visitor );
		}
	}

	@Override
	public boolean equals( final AbstractMultiname other )
	{
		if( other instanceof MultinameLA )
		{
			return equals( (MultinameLA)other );
		}

		return false;
	}

	public boolean equals( final MultinameLA other )
	{
		return namespaceSet.equals( other.namespaceSet );
	}
}