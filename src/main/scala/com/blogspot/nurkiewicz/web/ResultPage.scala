package com.blogspot.nurkiewicz.web

import com.blogspot.nurkiewicz.Book
import javax.xml.bind.annotation.XmlRootElement
import javax.xml.bind.annotation.XmlSeeAlso
import reflect.BeanProperty
import org.springframework.data.domain.{PageImpl, Page}
import java.util.{Collections, List}

@XmlRootElement
@XmlSeeAlso(Array(classOf[Book]))
class ResultPage[T](@BeanProperty var rows: List[T],
		             @BeanProperty var page: Int,
		             @BeanProperty var max: Int,
		             @BeanProperty var total: Long) {

	def this(results: Page[T]) {
		this(results.getContent, results.getNumber + 1, results.getSize, results.getTotalElements)
	}

	@Deprecated
	def this() {this(new PageImpl(Collections.emptyList()))}

}