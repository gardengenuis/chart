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
package org.garden.chart.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.garden.chart.ChartType;
import org.garden.chart.ICommonChart;
import org.garden.chart.data.IChartData;
import org.garden.utils.VelocityUtils;
import org.garden.utils.VelocityUtils.LoadType;

/**
 * AbstractCommonChart.java
 *
 * @author Garden
 * create on 2015年3月10日 下午4:17:52
 */
public abstract class AbstractCommonChart implements ICommonChart {

	protected IChartData chartData;
	protected ChartType chartType;
	
	protected String templatePath = null;
	protected String templateName = null;

	private AbstractCommonChart() {}
	
	public AbstractCommonChart( IChartData chartData) {
		this();
		this.chartData = chartData;
	}
	
	public AbstractCommonChart( String templatePath, String templateName, IChartData chartData) {
		this(chartData);
		this.templateName = templatePath;
		this.templatePath = templatePath;
	}
	/* (non-Javadoc)
	 * @see org.garden.chart.IChart#toJSON()
	 */
	@Override
	public String toScript() {
		String json = "";
		
		Map<String, Object> params = new HashMap<String, Object>();
		
		params.put("chartData", chartData);
		
		if ( StringUtils.isEmpty(templatePath)) {	// 取默认classpath下的模板
			json = VelocityUtils.template2String(templatePath, templateName, params, LoadType.CLASSPATH);
		} else { // 用户自定义模板路径
			json = VelocityUtils.template2String(templatePath, templateName, params, LoadType.FILE);
		}
		
		return json;
	}
	/* (non-Javadoc)
	 * @see org.garden.chart.IChart#getChartType()
	 */
	@Override
	public ChartType getChartType() {
		return chartType;
	}

	/* (non-Javadoc)
	 * @see org.garden.chart.ICommonChart#getSeries()
	 */
	@Override
	public IChartData getChartData() {
		return chartData;
	}
}
