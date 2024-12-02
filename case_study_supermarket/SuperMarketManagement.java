Super Market

SRS
1. Buying - Customer
2. Billing - Staff
3. Purchase - Manager
4. Delivery - DeliveryBoy
5. ProductManagement - Manager
6. SalesReturn - Customer
7. PurchaseReturn - Manager

Procurement 
Supplier
Product
Stock - ROQ

Sales
Billing - Bill 
Customer
Product
Stock

entity
Product
Customer
Supplier
Staff
Bill
Invoice


Product
productId
productName
price
roq
quantity

Customer
customerId
customerName
address
mobileNumber

Staff
staffId
staffName
designation
address
mobileNumber
salary
department

Supplier
suplierId
supplierName
address
mobileNumber

Bill
billNumber
billingDate
customerId
billAmount

BillItems(cart)
billNumber
productId
quantity
subAmount









































