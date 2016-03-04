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
package org.garden.chart.impl.echart.model;

import java.util.List;

import org.garden.chart.model.AbstractForceSeries;
import org.garden.chart.model.ICategories;
import org.garden.chart.model.ILinks;
import org.garden.chart.model.INodes;
import org.garden.chart.model.ISeries;
import org.garden.chart.model.ISeriesData;

/** 
* @ClassName: EForceSeries 
* @Description: TODO
* @author Garden Lee
* @date 2016年3月4日 下午3:22:14 
*/
public class EForceSeries extends AbstractForceSeries {

	/**
	 * @param type
	 * @param name
	 * @param stack
	 * @param data
	 * @param categories
	 * @param series
	 * @param nodes
	 * @param links
	 */
	public EForceSeries(String type, String name, String stack, List<ISeriesData> data, List<ICategories> categories,
			List<ISeries> series, List<INodes> nodes, List<ILinks> links) {
		super(type, name, stack, data, categories, series, nodes, links);
	}

	public EForceSeries(List<ISeries> series) {
		super(null, null, null, null, null, series, null, null);
	}
	
	public EForceSeries(String type, String name, List<ICategories> categories, List<INodes> nodes, List<ILinks> links) {
		super(type, name, null, null, categories, null, nodes, links);
	}
}
