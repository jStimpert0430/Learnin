 $(".accordion").on("click", ".accordion-header", function() 
 {
    $(this).toggleClass("active").next().slideToggle();
	
	// this jQuery selector selects the current HTML element
	// .next() method is traversing the DOM
	
 });