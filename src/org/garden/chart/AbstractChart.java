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
package org.garden.chart;

import org.garden.chart.model.IDataZoom;
import org.garden.chart.model.ILegend;
import org.garden.chart.model.ISeries;
import org.garden.chart.model.ITitle;

/** 
* @ClassName: AbstractChart 
* @Description: TODO
* @author Garden Lee
* @date 2016年3月3日 上午9:27:51 
*/
public abstract class AbstractChart implements IChart {
	protected ITitle title;
	protected ILegend legend;
	protected ISeries series;
	protected IDataZoom dataZoom;
	
	/**
	 * @param title
	 * @param legend
	 * @param series
	 */
	protected AbstractChart(ITitle title, ILegend legend, ISeries series) {
		this.title = title;
		this.legend = legend;
		this.series = series;
		this.dataZoom = null;
	}
	
	protected AbstractChart(ITitle title, ILegend legend, IDataZoom dataZoom, ISeries series) {
		this.title = title;
		this.legend = legend;
		this.series = series;
		this.dataZoom = dataZoom;
	}

	/* (non-Javadoc)
	 * @see org.garden.chart.IChart#getTitle()
	 */
	@Override
	public ITitle getTitle() {

		return this.title;
	}

	/* (non-Javadoc)
	 * @see org.garden.chart.IChart#getLegend()
	 */
	@Override
	public ILegend getLegend() {

		return this.legend;
	}

	/* (non-Javadoc)
	 * @see org.garden.chart.IChart#getSeries()
	 */
	@Override
	public ISeries getSeries() {

		return this.series;
	}
	
	@Override
	public IDataZoom getDataZoom() {
		return this.dataZoom;
	}
}
