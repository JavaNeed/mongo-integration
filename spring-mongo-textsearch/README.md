spring-mongo-textsearch
------------------------
db['order-details'].dropIndex("OrderID_text") 

db.orders.createIndex({"OrderID":"text"})

db.orders.find( { $text: { $search: "\"Lyon\"" } } )

db.orders.find( { $text: { $search: "\"lyon\"",language: "en"} } )

db.orders.find( { $text: { $search: "\"reims\"" } } )


Note:
------
Execute IndexToolTest.java once

Reference URL:
****************

-  http://stackoverflow.com/questions/30801801/spring-data-mongodb-text-search-for-phrase-or-words-in-phrase

- http://stackoverflow.com/questions/25550822/how-to-combine-a-spring-data-mongodb-query-with-full-text-search

- http://stackoverflow.com/questions/33156106/how-to-combine-text-and-geo-query-using-spring-data-mongodb