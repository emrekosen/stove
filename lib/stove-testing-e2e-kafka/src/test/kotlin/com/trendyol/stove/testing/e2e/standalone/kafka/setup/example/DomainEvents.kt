package com.trendyol.stove.testing.e2e.standalone.kafka.setup.example

object DomainEvents {
  data class ProductCreated(val productId: String)

  data class ProductFailingCreated(val productId: String)
}
