/*
	JavaScript Lab
*/

// create a new function named display that passes a parameter named event
function display(event)

// statement block
{
 // enter a jQuery selector to select the currentTarget value of the event parameter
$(this).on("click", "h3", function()
 // This function will be called when a user clicks either of the h3 elements, the selector references the h3 element the user clicks
 {
	// this jQuery selector selects the current HTML element
	// .next() method is traversing the DOM

});
 // The .next() method traverses the DOM tree to the element that follows the h3 element
$(this).next().fadeIn("slow");
 // Use the jQuery fadeIn() function

}

// Event listener for the h3 elements that call the display() function
$("h3").click(display());
