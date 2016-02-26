/*
 * Copyright (c) 2004, 2015, Garden Lee. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 
package org.garden.chart.data.impl;

import org.garden.chart.data.ICategory;
import org.garden.chart.data.IChartData;
import org.garden.chart.data.ISeries;

/**
 * AbstractChartData.java
 *
 * @author Garden
 * create on 2015年3月18日 上午9:57:31
 */
public abstract class AbstractChartData implements IChartData {

	protected ISeries[] series;
	protected ICategory[] categories;
	
	private AbstractChartData() {
	}
	
	public AbstractChartData(ICategory[] category, ISeries[] series) {
		this();
		this.series = series;
		this.categories = category;
	}
	/* (non-Javadoc)
	 * @see org.garden.chart.IChartData#getSeries()
	 */
	@Override
	public ISeries[] getSeries() {
		return this.series;
	}

	/* (non-Javadoc)
	 * @see org.garden.chart.IChartData#getCategory()
	 */
	@Override
	public ICategory[] getCategories() {
		return this.categories;
	}

}
