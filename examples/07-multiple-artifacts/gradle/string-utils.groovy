String.metaClass.with {
	dashSeparated = {
		delegate.replaceAll(/\B[A-Z]/, { ('-' + it).toLowerCase() } )
	}
	camelCase = {
		delegate.replaceAll(/-[a-z]/, { (it - '-').toUpperCase() } )
	}
}