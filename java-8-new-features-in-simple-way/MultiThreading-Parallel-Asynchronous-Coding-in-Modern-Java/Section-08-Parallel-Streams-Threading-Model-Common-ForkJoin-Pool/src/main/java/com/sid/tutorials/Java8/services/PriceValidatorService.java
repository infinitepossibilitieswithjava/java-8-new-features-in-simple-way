package com.sid.tutorials.Java8.services;

import static com.sid.tutorials.Java8.util.CommonUtil.delay;

import com.sid.tutorials.Java8.domain.CartItem;
import static com.sid.tutorials.Java8.util.LoggerUtil.*;

public class PriceValidatorService {

	public boolean isCartItemInvalid(CartItem cartItem) {
		int cartId = cartItem.getItemId();
		log("isCartItemInvalid : " + cartItem);
		delay(500);
		if (cartId == 7 || cartId == 9 || cartId == 11) {
			return true;
		}
		return false;
	}
}
