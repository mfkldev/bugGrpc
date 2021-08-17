package br.com.marciofranklin

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("br.com.marciofranklin")
		.start()
}

