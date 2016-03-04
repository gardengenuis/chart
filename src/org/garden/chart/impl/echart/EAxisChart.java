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

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.garden.chart.AbstractAxisChart;
import org.garden.chart.model.ILegend;
import org.garden.chart.model.ISeries;
import org.garden.chart.model.ITitle;
import org.garden.chart.model.IXYAxis;
import org.garden.utils.VelocityUtils;
import org.garden.utils.VelocityUtils.LoadType;

/** 
* @ClassName: EAxisChart 
* @Description: TODO
* @author Garden Lee
* @date 2016年3月3日 下午3:05:54 
*/
public class EAxisChart extends AbstractAxisChart {
	
	protected String templatePath;
	protected String templateName;
	
	/**
	 * @param title
	 * @param legend
	 * @param series
	 * @param xAxis
	 * @param yAxis
	 */
	protected EAxisChart(ITitle title, ILegend legend, ISeries series, IXYAxis xAxis, IXYAxis yAxis, String templatePath, String templateName) {
		super(title, legend, series, xAxis, yAxis);
		this.templateName = templateName;
		this.templatePath = templatePath;
	}
	
	protected EAxisChart(ITitle title, ILegend legend, ISeries series, IXYAxis xAxis, IXYAxis yAxis) {
		super(title, legend, series, xAxis, yAxis);
		this.templateName = "/" + this.getClass().getPackage().getName().replaceAll("\\.", "/") + "/" + getTemplateName();
		this.templatePath = null;
	}
	
	/**
	 * @return
	 */
	protected String getTemplateName() {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.garden.chart.IChart#toScript()
	 */
	@Override
	public String toScript() {
		String script = "";
		
		Map<String, Object> params = new HashMap<String, Object>();
		
		params.put(Constants.TEMPLATE_KEY, this);
		
		if ( StringUtils.isEmpty(templatePath)) {	// 取默认classpath下的模板
			script = VelocityUtils.template2String(templatePath, templateName, params, LoadType.CLASSPATH);
		} else { // 用户自定义模板路径
			script = VelocityUtils.template2String(templatePath, templateName, params, LoadType.FILE);
		}
		
		return script;
	}

}
