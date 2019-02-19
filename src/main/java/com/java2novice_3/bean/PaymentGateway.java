package com.java2novice_3.bean;

public class PaymentGateway {
 
    private Order order;

    //given this setter method name (setOrderX) spring expects to find EITHER
    // 1, a property element in the PaymentGateway's <bean> definition in context.xml with a name=orderX. see context-autowire-by-name, or

/*
    <bean id="paymentGateway" class="com.java2novice_3.bean.PaymentGateway" >
        <!-- if this (property element) is used then spring expects to find a setOrderX setter method in PaymentGateway -->
        <property name="orderX" ref="orderBean" />
    </bean>
*/

    // 2, if autowire-by-name is being used, <bean id="orderX" ... > in context.xml - see context-autowire-by-name_2

/*
    <bean id="paymentGateway" class="com.java2novice_3.bean.PaymentGateway" autowire="byName" />

    <!-- note the bean id ("order") has to match the name of the property (field) in the PaymentGateway class -->
    <bean id="orderX" class="com.java2novice_3.bean.Order" >
        ...
*/

    public void setOrderX(Order ord){
        System.out.println("PaymentGateway: setOrder....");
        this.order = ord;
    }



    public Order getOrder() {
        return order;
    }
 
    @Override
    public String toString(){
        return "ordering "+this.order.getItem()+" | price: "+this.order.getPrice();
    }
}