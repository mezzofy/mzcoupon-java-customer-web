package com.mezzofy.coupon.api.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mezzofy.coupon.data.MasscouponData;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class MassCouponModel {
	private MasscouponData masscoupon;
	private List<MassCouponDetailModel> masscoupondtls;
	public MasscouponData getMasscoupon() {
		return masscoupon;
	}

	public void setMasscoupon(MasscouponData masscoupon) {
		this.masscoupon = masscoupon;
	}

	public List<MassCouponDetailModel> getMasscoupondtls() {
		return masscoupondtls;
	}

	public void setMasscoupondtls(List<MassCouponDetailModel> masscoupondtls) {
		this.masscoupondtls = masscoupondtls;
	}
	
}
