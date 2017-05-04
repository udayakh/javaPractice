
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.uday.junit.OrderEntity;
import com.uday.junit.OrderEntityToOrderSummaryTransformer;
import com.uday.junit.OrderItemEntity;
import com.uday.junit.OrderSummary;


public class OrderEntityToOrderSummaryTransformerTest {

	private OrderEntityToOrderSummaryTransformer target = null;
	
	@Before
	public void setup() {
		target = new OrderEntityToOrderSummaryTransformer();
	}
	
	@Test
	public void test_transform_success() {
		
		String orderNumberFixture = UUID.randomUUID().toString();
		
		OrderEntity orderEntityFixture = new OrderEntity();
		orderEntityFixture.setOrderNumber(orderNumberFixture);
		orderEntityFixture.setOrderItemList(new LinkedList<OrderItemEntity>());
		
		OrderItemEntity itemFixture1 = new OrderItemEntity();
		itemFixture1.setQuantity(1);
		itemFixture1.setSellingPrice(new BigDecimal("10.00"));
		orderEntityFixture.getOrderItemList().add(itemFixture1);
		
		OrderItemEntity itemFixture2 = new OrderItemEntity();
		itemFixture2.setQuantity(2);
		itemFixture2.setSellingPrice(new BigDecimal("1.50"));
		orderEntityFixture.getOrderItemList().add(itemFixture2);
		
		OrderSummary result = target.transform(orderEntityFixture);
		
		Assert.assertNotNull(result);
		
		Assert.assertEquals(orderNumberFixture, result.getOrderNumber());
		Assert.assertEquals(3, result.getItemCount());
		Assert.assertEquals(new BigDecimal("13.00"), result.getTotalAmount());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test_transform_inputIsNull() {
		target.transform(null);
	}
	
	@Test
	public void test_transform_noItemsInOrder() {
		
		String orderNumberFixture = UUID.randomUUID().toString();
		
		OrderEntity orderEntityFixture = new OrderEntity();
		orderEntityFixture.setOrderNumber(orderNumberFixture);
		orderEntityFixture.setOrderItemList(new LinkedList<OrderItemEntity>());
		
		OrderSummary result = target.transform(orderEntityFixture);
		
		Assert.assertNotNull(result);
		
		Assert.assertEquals(0, result.getItemCount());
		Assert.assertEquals(new BigDecimal("0.00"), result.getTotalAmount());
	}
}
