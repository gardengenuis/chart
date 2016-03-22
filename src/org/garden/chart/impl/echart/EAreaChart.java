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
package org.garden.chart.impl.echart;

import org.garden.chart.model.IDataZoom;
import org.garden.chart.model.ILegend;
import org.garden.chart.model.ISeries;
import org.garden.chart.model.ITitle;
import org.garden.chart.model.IXYAxis;

/** 
* @ClassName: ELineChart 
* @Description: TODO
* @author Garden Lee
* @date 2016年3月3日 下午3:30:51 
*/
public class EAreaChart extends EAxisChart {

	/**
	 * @param title
	 * @param legend
	 * @param series
	 * @param xAxis
	 * @param yAxis
	 * @param templatePath
	 * @param templateName
	 */
	public EAreaChart(ITitle title, ILegend legend, ISeries series, IXYAxis xAxis, IXYAxis yAxis, String templatePath,
			String templateName) {
		super(title, legend, null, series, xAxis, yAxis, templatePath, templateName);

	}
	
	public EAreaChart(ITitle title, ILegend legend, IDataZoom dataZoom, ISeries series, IXYAxis xAxis, IXYAxis yAxis, String templatePath,
			String templateName) {
		super(title, legend, dataZoom, series, xAxis, yAxis, templatePath, templateName);

	}

	/**
	 * @param title
	 * @param legend
	 * @param series
	 * @param xAxis
	 * @param yAxis
	 */
	public EAreaChart(ITitle title, ILegend legend, ISeries series, IXYAxis xAxis, IXYAxis yAxis) {
		super(title, legend, null, series, xAxis, yAxis);
		
	}
	
	public EAreaChart(ITitle title, ILegend legend, IDataZoom dataZoom, ISeries series, IXYAxis xAxis, IXYAxis yAxis) {
		super(title, legend, dataZoom, series, xAxis, yAxis);
		
	}
	
	@Override
	protected String getTemplateName() {
		return Constants.TEMPLATE_NAME_AREA_AXIS;
	}
}
