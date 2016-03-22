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
package org.garden.chart.model;

import java.util.List;

/** 
* @ClassName: AbstractTitle 
* @Description: TODO
* @author Garden Lee
* @date 2016年3月3日 下午1:59:12 
*/
public abstract class AbstractSeries implements ISeries {
	protected String type;
	protected String name;
	protected String stack;
	
	protected List<ISeriesData> data;
	protected List<ICategories> categories;
	protected List<ISeries> series;
	protected String yAxisIndex;
	
	
	/**
	 * @param type
	 * @param name
	 * @param stack
	 * @param data
	 * @param categories
	 * @param series
	 */
	public AbstractSeries(String type, String name, String stack, List<ISeriesData> data, List<ICategories> categories,
			List<ISeries> series, String yAxisIndex) {

		this.type = type;
		this.name = name;
		this.stack = stack;
		this.data = data;
		this.categories = categories;
		this.series = series;
		this.yAxisIndex = yAxisIndex;
	}
	@Override
	public String getType() {
		return this.type;
	}
	@Override
	public String getName() {

		return this.name;
	}
	@Override
	public String getStack() {

		return this.stack;
	}
	@Override
	public List<ISeriesData> getData() {

		return this.data;
	}
	@Override
	public List<ICategories> getCategories() {

		return this.categories;
	}
	@Override
	public List<ISeries> getSeries() {

		return this.series;
	}
	@Override
	public String getYAxisIndex() {
		return this.yAxisIndex;
	}
	

}
