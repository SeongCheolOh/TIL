module my_module_a {
	exports pack1;
//	exports pack2; 패키지 은닉
	requires transitive my_module_b;

}