/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeSystemEventHistogramResponse;
import com.aliyuncs.cms.model.v20190101.DescribeSystemEventHistogramResponse.SystemEventHistogram;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSystemEventHistogramResponseUnmarshaller {

	public static DescribeSystemEventHistogramResponse unmarshall(DescribeSystemEventHistogramResponse describeSystemEventHistogramResponse, UnmarshallerContext context) {
		
		describeSystemEventHistogramResponse.setRequestId(context.stringValue("DescribeSystemEventHistogramResponse.RequestId"));
		describeSystemEventHistogramResponse.setCode(context.stringValue("DescribeSystemEventHistogramResponse.Code"));
		describeSystemEventHistogramResponse.setMessage(context.stringValue("DescribeSystemEventHistogramResponse.Message"));
		describeSystemEventHistogramResponse.setSuccess(context.stringValue("DescribeSystemEventHistogramResponse.Success"));

		List<SystemEventHistogram> systemEventHistograms = new ArrayList<SystemEventHistogram>();
		for (int i = 0; i < context.lengthValue("DescribeSystemEventHistogramResponse.SystemEventHistograms.Length"); i++) {
			SystemEventHistogram systemEventHistogram = new SystemEventHistogram();
			systemEventHistogram.setCount(context.longValue("DescribeSystemEventHistogramResponse.SystemEventHistograms["+ i +"].Count"));
			systemEventHistogram.setStartTime(context.longValue("DescribeSystemEventHistogramResponse.SystemEventHistograms["+ i +"].StartTime"));
			systemEventHistogram.setEndTime(context.longValue("DescribeSystemEventHistogramResponse.SystemEventHistograms["+ i +"].EndTime"));

			systemEventHistograms.add(systemEventHistogram);
		}
		describeSystemEventHistogramResponse.setSystemEventHistograms(systemEventHistograms);
	 
	 	return describeSystemEventHistogramResponse;
	}
}