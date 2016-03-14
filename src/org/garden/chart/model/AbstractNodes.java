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

/** 
* @ClassName: AbstractTitle 
* @Description: TODO
* @author Garden Lee
* @date 2016年3月3日 下午1:59:12 
*/
public abstract class AbstractNodes implements INodes {
	protected String name;
	protected String category;
	protected String value;
	protected String label;
	protected IItemStyle itemStyle;
	
	/**
	 * @param name
	 * @param category
	 * @param value
	 */
	public AbstractNodes(String name, String category, String value, String label, IItemStyle itemStyle) {

		this.name = name;
		this.category = category;
		this.value = value;
		this.label = label;
		this.itemStyle = itemStyle;
	}
	@Override
	public IItemStyle getItemStyle() {
		return this.itemStyle;
	}
	@Override
	public String getCategory() {

		return this.category;
	}
	@Override
	public String getName() {

		return this.name;
	}
	@Override
	public String getValue() {

		return this.value;
	}
	@Override
	public String getLabel() {
		return this.label;
	}
	

}
