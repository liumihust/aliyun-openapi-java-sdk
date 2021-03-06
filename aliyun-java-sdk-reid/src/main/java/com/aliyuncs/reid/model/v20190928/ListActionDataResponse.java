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

package com.aliyuncs.reid.model.v20190928;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.reid.transform.v20190928.ListActionDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListActionDataResponse extends AcsResponse {

	private String errorCode;

	private String errorMessage;

	private Integer pageNumber;

	private String message;

	private String code;

	private Long totalCount;

	private String dynamicCode;

	private Integer pageSize;

	private String requestId;

	private Boolean success;

	private String dynamicMessage;

	private List<Action> actions;

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public List<Action> getActions() {
		return this.actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}

	public static class Action {

		private Long storeId;

		private Long gmtCreate;

		private String locationLayerType;

		private Boolean stayValid;

		private String gender;

		private Long ukId;

		private Long arriveTimeStamp;

		private Long gmtModified;

		private String imageType;

		private Integer status;

		private Integer age;

		private String imageUrl;

		private Long locationId;

		private Integer stayPeriod;

		private Long leaveTimeStamp;

		private Float score;

		private String specialType;

		private String imageObjectKey;

		private FacePositionInImage facePositionInImage;

		private PointInMap pointInMap;

		public Long getStoreId() {
			return this.storeId;
		}

		public void setStoreId(Long storeId) {
			this.storeId = storeId;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getLocationLayerType() {
			return this.locationLayerType;
		}

		public void setLocationLayerType(String locationLayerType) {
			this.locationLayerType = locationLayerType;
		}

		public Boolean getStayValid() {
			return this.stayValid;
		}

		public void setStayValid(Boolean stayValid) {
			this.stayValid = stayValid;
		}

		public String getGender() {
			return this.gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public Long getUkId() {
			return this.ukId;
		}

		public void setUkId(Long ukId) {
			this.ukId = ukId;
		}

		public Long getArriveTimeStamp() {
			return this.arriveTimeStamp;
		}

		public void setArriveTimeStamp(Long arriveTimeStamp) {
			this.arriveTimeStamp = arriveTimeStamp;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getImageType() {
			return this.imageType;
		}

		public void setImageType(String imageType) {
			this.imageType = imageType;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getAge() {
			return this.age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		public String getImageUrl() {
			return this.imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public Long getLocationId() {
			return this.locationId;
		}

		public void setLocationId(Long locationId) {
			this.locationId = locationId;
		}

		public Integer getStayPeriod() {
			return this.stayPeriod;
		}

		public void setStayPeriod(Integer stayPeriod) {
			this.stayPeriod = stayPeriod;
		}

		public Long getLeaveTimeStamp() {
			return this.leaveTimeStamp;
		}

		public void setLeaveTimeStamp(Long leaveTimeStamp) {
			this.leaveTimeStamp = leaveTimeStamp;
		}

		public Float getScore() {
			return this.score;
		}

		public void setScore(Float score) {
			this.score = score;
		}

		public String getSpecialType() {
			return this.specialType;
		}

		public void setSpecialType(String specialType) {
			this.specialType = specialType;
		}

		public String getImageObjectKey() {
			return this.imageObjectKey;
		}

		public void setImageObjectKey(String imageObjectKey) {
			this.imageObjectKey = imageObjectKey;
		}

		public FacePositionInImage getFacePositionInImage() {
			return this.facePositionInImage;
		}

		public void setFacePositionInImage(FacePositionInImage facePositionInImage) {
			this.facePositionInImage = facePositionInImage;
		}

		public PointInMap getPointInMap() {
			return this.pointInMap;
		}

		public void setPointInMap(PointInMap pointInMap) {
			this.pointInMap = pointInMap;
		}

		public static class FacePositionInImage {

			private Float bottom;

			private Float left;

			private Float top;

			private Float right;

			public Float getBottom() {
				return this.bottom;
			}

			public void setBottom(Float bottom) {
				this.bottom = bottom;
			}

			public Float getLeft() {
				return this.left;
			}

			public void setLeft(Float left) {
				this.left = left;
			}

			public Float getTop() {
				return this.top;
			}

			public void setTop(Float top) {
				this.top = top;
			}

			public Float getRight() {
				return this.right;
			}

			public void setRight(Float right) {
				this.right = right;
			}
		}

		public static class PointInMap {

			private Float x;

			private Float y;

			public Float getX() {
				return this.x;
			}

			public void setX(Float x) {
				this.x = x;
			}

			public Float getY() {
				return this.y;
			}

			public void setY(Float y) {
				this.y = y;
			}
		}
	}

	@Override
	public ListActionDataResponse getInstance(UnmarshallerContext context) {
		return	ListActionDataResponseUnmarshaller.unmarshall(this, context);
	}
}
