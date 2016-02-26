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

import org.garden.chart.data.ILegend;
import org.garden.chart.data.ISeries;
import org.garden.chart.data.ISeriesData;

/**
 * AbstractSeries.java
 *
 * @author Garden
 * create on 2015年3月11日 下午4:51:51
 */
public abstract class AbstractSeries implements ISeries {

	protected ILegend legend;
	protected ISeriesData[] datas;
	
	private AbstractSeries() {}
	
	public AbstractSeries( ILegend legend, ISeriesData[] datas) {
		this();
		this.legend = legend;
		this.datas = datas;
	}
	/* (non-Javadoc)
	 * @see org.garden.chart.ISeries#getLegend()
	 */
	@Override
	public ILegend getLegend() {
		return this.legend;
	}
	/* (non-Javadoc)
	 * @see org.garden.chart.ISeries#getDatas()
	 */
	@Override
	public ISeriesData[] getDatas() {
		return this.datas;
	}
}
