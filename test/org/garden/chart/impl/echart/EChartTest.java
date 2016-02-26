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

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.garden.chart.IChart;
import org.garden.chart.data.ICategory;
import org.garden.chart.data.IChartData;
import org.garden.chart.data.ILegend;
import org.garden.chart.data.ISeries;
import org.garden.chart.data.ISeriesData;
import org.garden.chart.data.impl.SimpleCategory;
import org.garden.chart.data.impl.SimpleChartData;
import org.garden.chart.data.impl.SimpleLegend;
import org.garden.chart.data.impl.SimpleSeries;
import org.garden.chart.data.impl.SimpleSeriesData;
import org.junit.Before;
import org.junit.Test;

/**
 * EChartTest.java
 *
 * @author Garden
 * create on 2015年3月18日 下午3:59:23
 */
public class EChartTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLine() {
		IChartData chartData = genLineData();
		IChart chart = new LineChart( chartData);
		chart.toScript();
	}
	
	@Test
	public void testK() {
		IChartData chartData = genKData();
		IChart chart = new KChart( chartData);
		chart.toScript();
	}
	
	private IChartData genKData() {
		int csize = 88;
		int ssize = 1;
		
		ICategory[] categories = new ICategory[csize];
		ISeries[] series = new ISeries[ssize];
		
		String[][] values = new String[][] {
				{"2320.26","2302.6","2287.3","2362.94"},
		        {"2300","2291.3","2288.26","2308.38"},
		        {"2295.35","2346.5","2295.35","2346.92"},
		        {"2347.22","2358.98","2337.35","2363.8"},
		        {"2360.75","2382.48","2347.89","2383.76"},
		        {"2383.43","2385.42","2371.23","2391.82"},
		        {"2377.41","2419.02","2369.57","2421.15"},
		        {"2425.92","2428.15","2417.58","2440.38"},
		        {"2411","2433.13","2403.3","2437.42"},
		        {"2432.68","2434.48","2427.7","2441.73"},
		        {"2430.69","2418.53","2394.22","2433.89"},
		        {"2416.62","2432.4","2414.4","2443.03"},
		        {"2441.91","2421.56","2415.43","2444.8"},
		        {"2420.26","2382.91","2373.53","2427.07"},
		        {"2383.49","2397.18","2370.61","2397.94"},
		        {"2378.82","2325.95","2309.17","2378.82"},
		        {"2322.94","2314.16","2308.76","2330.88"},
		        {"2320.62","2325.82","2315.01","2338.78"},
		        {"2313.74","2293.34","2289.89","2340.71"},
		        {"2297.77","2313.22","2292.03","2324.63"},
		        {"2322.32","2365.59","2308.92","2366.16"},
		        {"2364.54","2359.51","2330.86","2369.65"},
		        {"2332.08","2273.4","2259.25","2333.54"},
		        {"2274.81","2326.31","2270.1","2328.14"},
		        {"2333.61","2347.18","2321.6","2351.44"},
		        {"2340.44","2324.29","2304.27","2352.02"},
		        {"2326.42","2318.61","2314.59","2333.67"},
		        {"2314.68","2310.59","2296.58","2320.96"},
		        {"2309.16","2286.6","2264.83","2333.29"},
		        {"2282.17","2263.97","2253.25","2286.33"},
		        {"2255.77","2270.28","2253.31","2276.22"},
		        {"2269.31","2278.4","2250","2312.08"},
		        {"2267.29","2240.02","2239.21","2276.05"},
		        {"2244.26","2257.43","2232.02","2261.31"},
		        {"2257.74","2317.37","2257.42","2317.86"},
		        {"2318.21","2324.24","2311.6","2330.81"},
		        {"2321.4","2328.28","2314.97","2332"},
		        {"2334.74","2326.72","2319.91","2344.89"},
		        {"2318.58","2297.67","2281.12","2319.99"},
		        {"2299.38","2301.26","2289","2323.48"},
		        {"2273.55","2236.3","2232.91","2273.55"},
		        {"2238.49","2236.62","2228.81","2246.87"},
		        {"2229.46","2234.4","2227.31","2243.95"},
		        {"2234.9","2227.74","2220.44","2253.42"},
		        {"2232.69","2225.29","2217.25","2241.34"},
		        {"2196.24","2211.59","2180.67","2212.59"},
		        {"2215.47","2225.77","2215.47","2234.73"},
		        {"2224.93","2226.13","2212.56","2233.04"},
		        {"2236.98","2219.55","2217.26","2242.48"},
		        {"2218.09","2206.78","2204.44","2226.26"},
		        {"2199.91","2181.94","2177.39","2204.99"},
		        {"2169.63","2194.85","2165.78","2196.43"},
		        {"2195.03","2193.8","2178.47","2197.51"},
		        {"2181.82","2197.6","2175.44","2206.03"},
		        {"2201.12","2244.64","2200.58","2250.11"},
		        {"2236.4","2242.17","2232.26","2245.12"},
		        {"2242.62","2184.54","2182.81","2242.62"},
		        {"2187.35","2218.32","2184.11","2226.12"},
		        {"2213.19","2199.31","2191.85","2224.63"},
		        {"2203.89","2177.91","2173.86","2210.58"},
		        {"2170.78","2174.12","2161.14","2179.65"},
		        {"2179.05","2205.5","2179.05","2222.81"},
		        {"2212.5","2231.17","2212.5","2236.07"},
		        {"2227.86","2235.57","2219.44","2240.26"},
		        {"2242.39","2246.3","2235.42","2255.21"},
		        {"2246.96","2232.97","2221.38","2247.86"},
		        {"2228.82","2246.83","2225.81","2247.67"},
		        {"2247.68","2241.92","2231.36","2250.85"},
		        {"2238.9","2217.01","2205.87","2239.93"},
		        {"2217.09","2224.8","2213.58","2225.19"},
		        {"2221.34","2251.81","2210.77","2252.87"},
		        {"2249.81","2282.87","2248.41","2288.09"},
		        {"2286.33","2299.99","2281.9","2309.39"},
		        {"2297.11","2305.11","2290.12","2305.3"},
		        {"2303.75","2302.4","2292.43","2314.18"},
		        {"2293.81","2275.67","2274.1","2304.95"},
		        {"2281.45","2288.53","2270.25","2292.59"},
		        {"2286.66","2293.08","2283.94","2301.7"},
		        {"2293.4","2321.32","2281.47","2322.1"},
		        {"2323.54","2324.02","2321.17","2334.33"},
		        {"2316.25","2317.75","2310.49","2325.72"},
		        {"2320.74","2300.59","2299.37","2325.53"},
		        {"2300.21","2299.25","2294.11","2313.43"},
		        {"2297.1","2272.42","2264.76","2297.1"},
		        {"2270.71","2270.93","2260.87","2276.86"},
		        {"2264.43","2242.11","2240.07","2266.69"},
		        {"2242.26","2210.9","2205.07","2250.63"},
		        {"2190.1","2148.35","2126.22","2190.1"}
		};
		
		for ( int i=0; i<categories.length; i++) {
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
	        Date dt = new Date();
	        Calendar rightNow = Calendar.getInstance();
	        rightNow.setTime(dt);
	        rightNow.add(Calendar.DAY_OF_YEAR,i);//日期加10天
	        String date = sdf.format(rightNow.getTime());
	        
	        ICategory category = new SimpleCategory(date);
	        categories[i] = category;
		}
		
		for ( int i=0; i<series.length; i++) {
			ILegend legend = new SimpleLegend("上证指数", "k", null, null, null);
			ISeriesData[] datas = new ISeriesData[csize];
			
			for ( int j=0; j<csize; j++) {
				ISeriesData[] value = new SimpleSeriesData[4];
				
				for ( int k=0; k<4; k++) {
					value[k] = new SimpleSeriesData(values[j][k]);
				}
				
				ISeriesData data = new SimpleSeriesData(value);
				datas[j] = data;
			}
			ISeries serie = new SimpleSeries(legend, datas);
			series[i] = serie;
		}
			
		IChartData chartData = new SimpleChartData(categories, series);
		
		return chartData;
	}

	private IChartData genLineData() {
		int csize = 10;
		int ssize = 3;
		ICategory[] categories = new ICategory[csize];
		ISeries[] series = new ISeries[ssize];
		
		for ( int i=0; i<categories.length; i++) {
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
	        Date dt = new Date();
	        Calendar rightNow = Calendar.getInstance();
	        rightNow.setTime(dt);
	        rightNow.add(Calendar.DAY_OF_YEAR,i);//日期加10天
	        String date = sdf.format(rightNow.getTime());
	        
	        ICategory category = new SimpleCategory(date);
	        categories[i] = category;
		}
		for ( int i=0; i<series.length; i++) {
			ILegend legend = new SimpleLegend("图例"+i, "line", null, null, null);
			ISeriesData[] datas = new ISeriesData[csize];
			
			for ( int j=0; j<csize; j++) {
				ISeriesData data = new SimpleSeriesData(String.valueOf((int) (Math.random() * 10)));
				datas[j] = data;
			}
			ISeries serie = new SimpleSeries(legend, datas);
			series[i] = serie;
		}
			
		IChartData chartData = new SimpleChartData(categories, series);
		
		return chartData;
	}

}
